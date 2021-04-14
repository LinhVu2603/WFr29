<?php 
require('model/Comment.php');
require('controller/BaseController.php');

class CommentController extends BaseController
{
	public $model;

	function __construct()
	{
		$this->model = new Comment();
	}

	public function insert(){
		$data = $_POST;
		$id = $data['id_post'];
		$result = $this->model->add($data);
		$datas = $this->model->all_comment('created_at');
		$this->redirect("index.php?mod=home&act=detail&id=$id");

	}
	public function list(){
		$comment = $this->model->all();
		$this->view('Comment/list.php',[
			'comment' => $comment,
		]);
	}
	public function delete(){
		$id = $_GET['id'];

		$result = $this->model->delete($id);

		if ($result) {
			setcookie("success","Xóa thanh cong",time()+3);
		}else {
			setcookie("fail","Xóa khong thanh cong",time()+3);
		}

		$this->redirect("/hw8/index.php?mod=comment&act=list");

	}



	
	

}

?>