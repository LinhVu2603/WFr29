<?php 
require('model/Category.php');
require('controller/BaseController.php');

class CategoryController extends BaseController
{
	public $model;

	function __construct()
	{
		$this->model = new Category();
	}

	public function list(){
		$categories = $this->model->all();

		$this->view('Category/list.php',[
			'categories' => $categories
		]);
	}
	public function add(){

		$this->view('Category/add.php',);
	}
	public function addProcess(){
		$data = $_POST;
		$file = $_FILES['image_category'];
		$this->model->upLoadFile("image","image_category","500000",array('jpg','png','txt'));

		$arr_data = array();
		$arr_data['name_category'] = $data['name_category'];
		$arr_data['slug'] = $data['slug'];
		$arr_data['parent_id'] = $data['parent_id'];
		$arr_data['image_category'] = $file['name'];
		$arr_data['description_category'] = $data['description_category'];
		$arr_data['created_at_category'] = $data['created_at_category'];

		$result = $this->model->add($arr_data);
		if ($result) {
			setcookie("success","tao moi thanh cong",time()+3);
			$this->redirect("/hw8/index.php?mod=category&act=list");
		}else {
			setcookie("fail","tao moi khong thanh cong",time()+3);
			$this->redirect("/hw8/index.php?mod=category&act=add");
			echo 'aaa';
		}
	}

	public function edit(){
		$id = $_GET['id'];

		$data_edit =  $this->model->getId($id);

		$this->view('Category/edit.php',[
			'data_edit' => $data_edit
		]);
	}
	public function editProcess(){

		$data = $_POST;
		$id = $data['id'];
		$file = $_FILES['image_edit'];
		$arr_data = array();
		$arr_data['name_category'] = $data['name'];
		$arr_data['slug'] = $data['slug'];
		$arr_data['parent_id'] = $data['parent_id'];
		if (!$file['name'] == "") {
			$this->model->upLoadFile("image","image_edit","500000",array('jpg','png','txt'));
			$arr_data['image_category'] = $file['name'];
		}else {
			$arr_data['image_category'] = $data['image'];

		}
		$arr_data['description_category'] = $data['description'];
		$arr_data['created_at_category'] = $data['created_at'];


		$result = $this->model->update($arr_data,$id);
		if ($result) {
			setcookie("success","Update thanh cong",time()+3);
			$this->redirect("/hw8/index.php?mod=category&act=list");
		}else {
			setcookie("fail","update khong thanh cong",time()+3);
			$this->redirect("/hw8/index.php?mod=category&act=edit");
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

		$this->redirect("/hw8/index.php?mod=category&act=list");
	}
	public function detail(){
		$id = $_GET['id'];
		$data = $this->model->getId($id);
		$this->view('Category/detail.php',[
			'data' => $data
		]);
	}

}

?>