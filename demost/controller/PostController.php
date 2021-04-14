<?php 
require('model/Post.php');
require('controller/BaseController.php');

class PostController extends BaseController
{
	public $model;

	function __construct()
	{
		$this->model = new Post();
	}

	public function list(){
		$posts = $this->model->all();
		$categories = $this->model->getCategory();
		$users = $this->model->getUsers();
		$this->view('Post/list.php',[
			'posts' => $posts,
			'categories' => $categories,
			'users' => $users
		]);
	}
	
	public function add(){

		$categories = $this->model->getCategory();
		$users = $this->model->getUsers();
		$this->view('Post/add.php',[
			'categories' =>$categories,
			'users' =>$users
		]);
	}
	public function addProcess(){
		$data = $_POST;
		$file = $_FILES['image'];
		$this->model->upLoadFile("image","image","500000",array('jpg','png','txt'));
		$arr_data = array();
		$arr_data['title'] = $data['title'];
		$arr_data['description'] = $data['description'];
		$arr_data['image'] = $file['name'];
		$arr_data['content'] =  htmlspecialchars($data['content']);
		$arr_data['slug'] = $data['title'];
		
		$arr_data['view_count'] = $data['view_count'];
		$arr_data['category_id'] = $data['category_id'];
		$arr_data['user_id'] = $data['user_id'];
		$arr_data['created_at'] = $data['created_at'];
		$arr_data['accept'] = $data['accept'];
		
		$result = $this->model->add($arr_data);
		if ($result) {
			setcookie("success","tao moi thanh cong",time()+3);
			$this->redirect("/hw8/index.php?mod=post&act=list");
		}else {
			setcookie("fail","tao moi khong thanh cong",time()+3);
			$this->redirect("/hw8/index.php?mod=post&act=add");
		}
	}

	public function edit(){
		$id = $_GET['id'];

		$data_edit =  $this->model->getId($id);
		$categories = $this->model->getCategory();
		$users = $this->model->getUsers();
		$this->view('Post/edit.php',[
			'data_edit' => $data_edit,
			'categories' => $categories,
			'users' => $users
		]);
	}
	public function editProcess(){

		$data = $_POST;
		$id = $data['id'];
		$file = $_FILES['image_edit'];

		$arr_data_edit = array();

		$arr_data_edit['title'] = $data['title'];
		$arr_data_edit['description'] = $data['description'];
		if (!$file['name'] == "") {
			$this->model->upLoadFile("image","image_edit","500000",array('jpg','png','txt'));
			$arr_data_edit['image'] = $file['name'];
		}else {
			$arr_data_edit['image'] = $data['image'];
		}

		$arr_data_edit['content'] = str_replace(htmlspecialchars('<p><br></p>'), '', htmlspecialchars($data['content']));
		
		$arr_data_edit['slug'] = $data['slug'];
		$arr_data_edit['view_count'] = $data['view_count'];
		$arr_data_edit['category_id'] = $data['category_id'];
		$arr_data_edit['user_id'] = $data['user_id'];
		$arr_data_edit['created_at'] = $data['created_at'];


		$result = $this->model->update($arr_data_edit,$id);
		echo $result;
		if ($result) {
			setcookie("success","Update thanh cong",time()+3);
			$this->redirect("/hw8/index.php?mod=post&act=list");
		}else {
			setcookie("fail","update khong thanh cong",time()+3);
			$this->redirect("/hw8/index.php?mod=post&act=edit");
		}
	}
	public function delete(){
		$id = $_GET['id'];

		$result = $this->model->delete($id);

		if ($result) {
			setcookie("success","Xóa thanh cong",time()+3);
		}else {
			setcookie("fail","Xóa khong thanh cong",time()+3);
		}

		$this->redirect("/hw8/index.php?mod=post&act=list");
	}
	public function detail(){
		$id = $_GET['id'];
		$data_detail = $this->model->getpost($id);	
		$this->view('Post/detail.php',[
			'data_detail' => $data_detail,
		]);
	}
	public function add_author(){

		$categories = $this->model->getCategory();
		$users = $this->model->getUsers();
		$this->view('Author/add.php',[
			'categories' =>$categories,
			'users' =>$users
		]);
	}
	public function list_content(){
		$posts = $this->model->get_all('accept',0);
		$categories = $this->model->getCategory();
		$users = $this->model->getUsers();
		$this->view('Post/list_content.php',[
			'posts' => $posts,
			'categories' => $categories,
			'users' => $users
		]);
	}
	public function detail_content(){
		$id = $_GET['id'];
		$data_detail = $this->model->getpost($id);	
		$this->view('Post/edit_content.php',[
			'data_detail' => $data_detail,
		]);

	}
	public function update_content(){
		$data = $_POST;

		$id = $data['id'];

		$arr_data = array();

		$arr_data['accept'] = $data['accept'];

		$result = $this->model->update($arr_data,$id);
		
		if ($result) {
			setcookie("success","Update thanh cong",time()+3);
			$this->redirect("/hw8/index.php?mod=post&act=list_content");
		}else {
			setcookie("fail","update khong thanh cong",time()+3);
			$this->redirect("/hw8/index.php?mod=post&act=edit");
		}


	}
	public function delete_content(){
		$id = $_GET['id'];

		$result = $this->model->delete($id);

		if ($result) {
			setcookie("success","Xóa thanh cong",time()+3);
		}else {
			setcookie("fail","Xóa khong thanh cong",time()+3);
		}

		$this->redirect("/hw8/index.php?mod=post&act=list_content");
	}


}

?>