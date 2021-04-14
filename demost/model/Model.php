<?php 
	require('model/Connection.php');
	class Model{
		protected $conn;
		protected $table;
		// private $query = [

		// 	"SELECT" 	=> "",
		// 	"WHERE" 	=> "",
		// 	"GET" 		=> "",
		// 	"ORDERBY" 	=> ""
		// ];
		function __construct(){
			$connect = new Connection();
			$this->connection = $connect->conn;
		}

		public static function createSlug($str, $delimiter = '-'){

		    $slug = strtolower(trim(preg_replace('/[\s-]+/', $delimiter, preg_replace('/[^A-Za-z0-9-]+/', $delimiter, preg_replace('/[&]/', 'and', preg_replace('/[\']/', '', iconv('UTF-8', 'ASCII//TRANSLIT', $str))))), $delimiter));
		    return $slug;

		} 
				// public function select($colunns = []){
		// 	if (empty($colunns)) {
		// 		$this->query["SELECT"] = "*";
		// 	}else {
		// 		foreach ($colunns as $key => $value) {
		// 			$this->query["SELECT"] .= $value . ",";
		// 		}
		// 		$this->query["SELECT"] = substr_replace($this->query["SELECT"], "", -1);
		// 	}
		// 	return $this;

		// }

		// public function where ($condition = []){
		// 	foreach ($Connection as $value) {
		// 		if (is_array($Connection)) {
		// 			$this->query["WHERE"] .= implode(" ", $condition) . " and";
		// 		}else {
		// 			$this->query["WHERE"] .= $key . " = " . $condition . " and";
		// 		}
		// 	}
		// 	$this->query["WHERE"] = substr($this->query["WHERE"], start)


		// }
		public function all($cloumn="",$number=""){

			if ($cloumn == "" && $number == "") {
				$query = "SELECT * FROM  " . $this->table ;
			}else {
				$query = "SELECT * FROM categories LEFT JOIN posts ON posts.category_id = categories.id WHERE  posts.accept = 1 ORDER BY $cloumn DESC LIMIT $number ";
			};

		    $result = $this->connection->query($query);

		    $data =array();
		    while ($row = $result->fetch_assoc()) {
		        $data[] = $row;
		    }
			return $data;	
		}
		public function get_all($cloumn,$number){

			$query = "SELECT * FROM $this->table WHERE $cloumn = $number";
			
			$result = $this->connection->query($query);

			$data = array();

			while ($row = $result->fetch_assoc()) {
			    $data[] = $row;
			}
			return $data;
		}
		// public function all_accept(){
		// 	$query = "SELECT * FROM  " . $this->table ." WHERE accept = 0";
		// 	$result = $this->connection->query($query);

		//     $data =array();
		//     while ($row = $result->fetch_assoc()) {
		//         $data[] = $row;
		//     }
		// 	return $data;	
		// }
		public function getId($id){
			$query = "SELECT * FROM " . $this->table . " WHERE id = " .$id;
		    $result = $this->connection->query($query);

		    $data =array();
		    while ($row = $result->fetch_assoc()) {
		        $data[] = $row;
		    }
			return $data;
		}
		public function getCategory(){
			$query = "SELECT * FROM  categories  "  ;

			$result = $this->connection->query($query);

			$data_category = array();

			while ($row = $result->fetch_assoc()) {
			    $data_category[] = $row;
			}
			return $data_category;
		}
		public function getUsers($cloumn="",$number1=""){
			if ($cloumn=="" && $number1 == "") {
				$query = "SELECT * FROM  users  "  ;
			}else{
				$query = "SELECT * FROM users WHERE $cloumn = $number1";
			}
			

			$result = $this->connection->query($query);

			$data_user = array();

			while ($row = $result->fetch_assoc()) {
			    $data_user[] = $row;
			}
			return $data_user;
		}
		public function getpost($id){
			$query_post = "SELECT * FROM $this->table WHERE id= ".$id;

			$post_resutl = $this->connection->query($query_post);

			$posts = $post_resutl->fetch_assoc();


			if ($posts['user_id']) {
				$query_user = "SELECT * FROM users WHERE id = ".$posts['user_id'];

				$user_resutl = $this->connection->query($query_user);

				$users =  $user_resutl->fetch_assoc();

				$posts['user'] =$users;
			}else {
				echo 'sai';
			}

			if ($posts['category_id']) {
				$query_categories = "SELECT * FROM categories WHERE id = ".$posts['category_id'] ;

				$categories_resutl = $this->connection->query($query_categories);

				$catogories = $categories_resutl->fetch_assoc();

				$posts['categorie'] = $catogories;
			}


			return $posts;
		}
		public function update($data,$id){
			$query = "UPDATE  " . $this->table . " SET ";
			foreach ($data as $key => $value) {
			 	$query .= $key . " = '" . $value. "'," ;  
			}
			$query = substr_replace($query, "", -1);

			$query .=" WHERE id= ".$id;

			$status = $this->connection->query($query);
			
			return $status;
		}
		public function add($data){
			$query = "INSERT INTO " . $this->table . "(";
			end($data);
			$lastKey = key($data);

			foreach ($data as $key => $value) {
				if ($key == $lastKey) {
					$query .= $key . ")";
				}else {
					$query .= $key . ",";
				}
			}
			$query .= " VALUES (";

			foreach ($data  as $key => $value) {
				if ($key == $lastKey) {
					$query .= "'" . $value . "'" . ")";
				}else {
					$query .= "'" . $value . "'" . ",";
				}
			}
			
			$result = $this->connection->query($query);
			
			return $result;		
		} 
		public function delete($id){
			$query = "DELETE  FROM  ". $this->table ." WHERE id = " . $id;
			
		    $result = $this->connection->query($query);
		}
		public function upLoadFile($target_dir,$input_name,$max_size,$formats_allowed_array){
			$target_file = $target_dir."/".basename($_FILES[$input_name]['name']);

			$uploadok = 1;
			$imagefileType = strtolower(pathinfo($target_file,PATHINFO_EXTENSION));
			$error_arr = array();

			if (file_exists($target_file)) {
				$error_arr[] = "file không tồn tại";
				$uploadok = 0;
			}


			if ($_FILES[$input_name]['size'] > $max_size) {
				$error_arr = "kích thức sai quá lớn";
				$uploadok = 0;
			}

			if (!in_array($imagefileType, $formats_allowed_array)) {
				$error_arr[] = "xin loi, chỉ" . implode(array_values($formats_allowed_array), ",")."được cho phép";
				$uploadok = 0 ;
			}

			if ($uploadok == 0 ) {
				$error_arr[] = "<br>"."upload không thanh công";
			}else {
				if (move_uploaded_file($_FILES[$input_name]['tmp_name'], $target_file)) {
					return $_FILES[$input_name]['name'];
					
				}else {
					$error_arr[] = "khong thanh công";
				}
			}


			return $error_arr;
		}

		public function get_fontEnd_all($cloumn,$name,$number=""){
			if ($number == "") {
				$query_post = "SELECT * FROM categories LEFT JOIN  $this->table ON posts.category_id = categories.id WHERE categories.description_category = '$name' AND posts.accept = 1 ORDER BY $cloumn DESC  ";
			}else {
				$query_post = "SELECT * FROM categories LEFT JOIN  $this->table ON posts.category_id = categories.id WHERE categories.description_category = '$name' AND posts.accept = 1 ORDER BY $cloumn DESC LIMIT $number ";
			}
			
			$post_resutl = $this->connection->query($query_post);

			$data = array();

			while ($row =$post_resutl->fetch_assoc()) {
			    $data[] = $row; 
			}
			return $data;
		}
		public function get_fontEnd_category($cloumn,$name,$number=""){
			if ($number == "") {
				$query_post = "SELECT * FROM categories LEFT JOIN  $this->table ON posts.category_id = categories.id WHERE categories.name_category = '$name' AND posts.accept = 1 ORDER BY $cloumn DESC  ";
			}else {
				$query_post = "SELECT * FROM categories LEFT JOIN  $this->table ON posts.category_id = categories.id WHERE categories.name_category = '$name' AND posts.accept = 1 ORDER BY $cloumn DESC LIMIT $number ";
			}


			$post_resutl = $this->connection->query($query_post);

			$data = array();

			while ($row =$post_resutl->fetch_assoc()) {
			    $data[] = $row; 
			}
			return $data;
		}
		function send_email($email_recive,$name,$contents,$subject){
	        //https://www.google.com/settings/security/lesssecureapps
	        // Khai báo thư viên phpmailer
	        require "public/phpmailer/PHPMailerAutoload.php";
	        require "public/phpmailer/class.phpmailer.php";
	        // Khai báo tạo PHPMailer
	        $mail = new PHPMailer();
	        //Khai báo gửi mail bằng SMTP
	        $mail->isSMTP();
	        //Tắt mở kiểm tra lỗi trả về, chấp nhận các giá trị 0 1 2
	        // 0 = off không thông báo bất kì gì, tốt nhất nên dùng khi đã hoàn thành.
	        // 1 = Thông báo lỗi ở client
	        // 2 = Thông báo lỗi cả client và lỗi ở server
	        // To load the French version
	        $mail->setLanguage('vi', '/optional/path/to/language/directory/');
	        $mail->SMTPDebug  = 1;
	                $mail->SMTPOptions = array (
	                'ssl' => array(
	                'verify_peer'  => false,
	                'verify_peer_name'  => false,
	                'allow_self_signed' => true)
	                );
	        $mail->CharSet="UTF-8";
	        $mail->Debugoutput = "html"; // Lỗi trả về hiển thị với cấu trúc HTML
	        $mail->Host       = "smtp.gmail.com"; //host smtp để gửi mail
	        $mail->Port       = 587; // cổng để gửi mail
	        $mail->SMTPSecure = "tls"; //Phương thức mã hóa thư - ssl hoặc tls
	        $mail->SMTPAuth   = true; //Xác thực SMTP
	        $mail->Username   = "datdoan1198@gmail.com"; // Tên đăng nhập tài khoản Gmail
	        $mail->Password   = "anhdatday"; //Mật khẩu của gmail
	        $mail->SetFrom("datdoan1198@gmail.com", "Zent Group"); // Thông tin người gửi
	        $mail->AddReplyTo("datdoan1198@gmail.com","Zent Group");// Ấn định email sẽ nhận khi người dùng reply lại.
	        $mail->AddAddress($email_recive, $name);//Email của người nhận
	        //$mail->AddCC($email_recive, $name);//Email của người nhận
	        $mail->Subject = $subject; //Tiêu đề của thư
	        $mail->MsgHTML($contents); //Nội dung của bức thư.
	        // $mail->MsgHTML(file_get_contents("email-template.html"), dirname(__FILE__));
	        // Gửi thư với tập tin html
	        $mail->AltBody = "Nội dung thư";//Nội dung rút gọn hiển thị bên ngoài thư mục thư.
	        //$mail->AddAttachment("images/attact-tui.gif");//Tập tin cần attach

	        //Tiến hành gửi email và kiểm tra lỗi
	        if(!$mail->Send()) {
	          echo "Có lỗi khi gửi mail: " . $mail->ErrorInfo;
	                    return false;
	        } else {
	          echo "Đã gửi thư thành công!";
	                    return true;
	        }
	    }

	}
 ?>
