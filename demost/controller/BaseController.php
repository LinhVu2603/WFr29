<?php 
class BaseController
{
	public function view ($path,$data = []){
		if (!empty($data)) {
			extract($data);
		}
		include('view/'. $path);
	}
	public function redirect($path){

		header("location: " . $path);
	}
} 

?>