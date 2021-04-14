<?php 
	require('model/User.php');
	require('controller/BaseController.php');
	class AuthController  extends BaseController{
		protected $user;

		function __construct(){
			$this->user = new User();
		}
		public function login(){
			if (!isset($_POST['btn_submit'])) {
				if (isset($_SESSION['user'])) {
					$this->redirect("/hw8/index.php?mod=home&act=index");
				}else {
					$this->view('Auth/login.php',);
				}
				
			}else {
				$email = $_POST['email'];
				$password = $_POST['password'];


				$users = $this->user->where(['email' => $email , 'password' => md5($password)]);

				if ($users[0]['role'] == User::ROLE["admin"]) {
					if (count($users) == 0 ) {
						setcookie("erro","Đăng nhập thành công",time()+3);
						$this->redirect("/hw8/index.php?mod=auth&act=login");
					}else {
						$user = $users[0];
						$_SESSION['user'] = $user;
						$this->redirect("/hw8/index.php?mod=post&act=list");
					}
				}elseif ($users[0]['role'] == User::ROLE['content']) {
					if (count($users) == 0 ) {
						setcookie("erro","Đăng nhập không thành công",time()+3);
						$this->redirect("/hw8/index.php?mod=auth&act=login");
					}else {
						$user = $users[0];
						$_SESSION['user'] = $user;
						$this->redirect("/hw8/index.php?mod=post&act=list");
					}
				}else {
					if (count($users) == 0 ) {
						setcookie("erro","Đăng nhập không thành công",time()+3);
						$this->redirect("/hw8/index.php?mod=auth&act=login");
					}else {
						$user = $users[0];
						$_SESSION['user'] = $user;
						$this->redirect("/hw8/index.php?mod=home&act=index2");
					}
				}
		
				
			}
			
		}
		public function register(){
			if (empty($_POST)) {

				$this->view('Auth/re.php');
			}else {
				$data = $_POST;
				if ($data['email'] == "" && $data['password'] == "") {
					setcookie("erro_register","email va password không được để trống",time()+3);
					$this->redirect("/hw8/index.php?mod=auth&act=register");
					exit();
				}
				$users = $this->user->where("email",$data['email']);
				if (count($users) !== 0 ) {
					setcookie("erro_register","email đã tồn tại",time()+3);
					$this->redirect("/hw8/index.php?mod=auth&act=register");
					exit();
				}

				if ($data['password'] !== $data['repassword']) {
					setcookie("erro_register","mật khẩu không khớp",time()+3);
					$this->redirect("/hw8/index.php?mod=auth&act=register");
					exit();
				}
				unset($data['repassword']);
				$data['password'] = md5($data['password']);

				$data_insert = [
					'name_user' => $data['name'],
					'email' => $data['email'],
					'password' => $data['password'],
					'role' => $data['role'],
				];
				$insert = $this->user->add($data_insert); 	
				
				if ($insert) {
					$email_recive = $data['email'];
					$name = $data['name'];
					$contents = "Dang ki thanh cong";
					$subject = "thong bao dang ki tai khoan";

					$this->user->send_email($email_recive,$name,$contents,$subject);
					setcookie("succes","Đăng kí thành công",time()+3);
					$this->redirect("/hw8/index.php?mod=auth&act=login");
					
				}else {

					setcookie("erro","Đăng kí không thành công",time()+3);
					$this->redirect("/hw8/index.php?mod=auth&act=register");

				}
			}

		}
		public function logout(){
			unset($_SESSION['user']);
			$this->view("Auth/login.php");

		}

	} 
?>