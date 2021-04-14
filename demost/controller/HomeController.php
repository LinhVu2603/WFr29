<?php
	require('model/Post.php');
	require('controller/BaseController.php');
	class HomeController extends BaseController{
		public $model;

		function __construct()
		{
			$this->model = new Post();
		}
		public function index(){
			
			$this->view('home.php');
		}
		public function index2(){
			$post_fontEnd_view = $this->model->all('view_count',4);
			$post_fontEnd_time = $this->model->all('created_at',4);
			$users = $this->model->getUsers('role',2);		
			$this->view('frontend/home.php',[
				'post_fontEnd_view' => $post_fontEnd_view,
				'post_fontEnd_time' =>$post_fontEnd_time,
				'users' =>$users,
			]);
		}
		public function news(){
			$Post_news_view = $this->model->get_fontEnd_all('view_count','Thời Sự',4);
			$Post_news_time = $this->model->get_fontEnd_all('created_at','Thời Sự');
			$users = $this->model->getUsers();
			$this->view('Post_FontEnd/news.php',[
				'Post_news_view' => $Post_news_view,
				'Post_news_time' => $Post_news_time,
				'users' => $users,
			]);
		}
		public function news_country(){
			$Post_newCountry_view = $this->model->get_fontEnd_category('view_count','Tin Trong Nước',4);
			$Post_newCountry_time = $this->model->get_fontEnd_category('created_at','Tin Trong Nước');
			$users = $this->model->getUsers();
			$this->view('Post_FontEnd/new_country.php',[
				'Post_newCountry_view' => $Post_newCountry_view,
				'Post_newCountry_time' => $Post_newCountry_time,
				'users' => $users,
			]);
		}
		public function news_international(){
			$Post_international_view = $this->model->get_fontEnd_category('view_count','Tin Quốc Tế',4);
			$Post_international_time = $this->model->get_fontEnd_category('created_at','Tin Quốc Tế');
			$users = $this->model->getUsers();
			$this->view('Post_FontEnd/new_international.php',[
				'Post_international_view' => $Post_international_view,
				'Post_international_time' => $Post_international_time,
				'users' => $users,
			]);
		}
		public function sports(){
			$Post_sports_time = $this->model->get_fontEnd_all('created_at','Thể Thao',);
			$Post_sports_view = $this->model->get_fontEnd_all('view_count','Thể Thao',4);
			$users = $this->model->getUsers(); 
			$this->view('Post_FontEnd/sports.php',[
				'Post_sports_time' => $Post_sports_time,
				'Post_sports_view' => $Post_sports_view,
				'users' => $users,

			]);
		}
		public function soccers(){	

			$Post_Soccers_view = $this->model->get_fontEnd_category('view_count','Bóng Đá',4);
			$Post_Soccers_time = $this->model->get_fontEnd_category('created_at','Bóng Đá');
			$users = $this->model->getUsers();
			$this->view('Post_FontEnd/soccers.php',[
				'Post_Soccers_view' => $Post_Soccers_view,
				'Post_Soccers_time' => $Post_Soccers_time,
				'users' => $users,
			]);
		}
		public function tennis(){

			$Post_tennis_view = $this->model->get_fontEnd_category('view_count','Quần Vợt',4);
			$Post_tennis_time = $this->model->get_fontEnd_category('created_at','Quần Vợt',);
			$users = $this->model->getUsers();	
			$this->view('Post_FontEnd/tennis.php',[
				'Post_tennis_view' => $Post_tennis_view,
				'Post_tennis_time' => $Post_tennis_time,
				'users' => $users,
			]);
		}
		public function medical(){
			$Post_medical_view = $this->model->get_fontEnd_all('view_count','Y Tế',4);
			$Post_medical_time = $this->model->get_fontEnd_all('created_at','Y Tế');
			$users = $this->model->getUsers();
			$this->view('Post_FontEnd/medical.php',[
				'Post_medical_view' => $Post_medical_view,
				'Post_medical_time' => $Post_medical_time,
				'users' => $users,
			]);

		}
		public function covid_19(){
			$Post_covid_19_view = $this->model->get_fontEnd_category('view_count','Covid-19',4);
			$Post_covid_19_time = $this->model->get_fontEnd_category('created_at','Covid-19');
			$users = $this->model->getUsers();
			$this->view('Post_FontEnd/covid_19.php',[
				'Post_covid_19_view' => $Post_covid_19_view,
				'Post_covid_19_time' => $Post_covid_19_time,
				'users' => $users,
			]);
		}
		public function detail(){
			$id = $_GET['id'];
			$demo = $this->model->getpost($id);
			$data = array();
			$data['view_count'] = $demo['view_count']+1 ; 
			$demo_updata = $this->model->update($data,$id);
			$Post_detail_id = $this->model->getpost($id);
			$this->view('Post_FontEnd/detail.php',[
				'Post_detail_id' => $Post_detail_id,
			]);
		}
		public function warning(){
			
			$this->view('warning/404.php');

		}
	}

 ?>