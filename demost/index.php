<?php
	session_start();
	date_default_timezone_set('Asia/Ho_Chi_Minh');
	if (isset($_GET['mod'])) {
		if ($_GET['mod'] == 'category' || $_GET['mod'] == 'post' || $_GET['mod'] == 'user' ) {
			if (isset($_SESSION['user']) && $_SESSION['user']['role'] == 1) {
				$mod = $_GET['mod'];
				$act = $_GET['act'];
			}elseif (isset($_SESSION['user']) && $_SESSION['user']['role'] == 2 ) {
				$mod = 'post';
				$act = $_GET['act'];
			}else {
				$mod = 'home';
				$act = 'index2';
			}
		}elseif ($_GET['mod'] == 'auth' || $_GET['mod'] == 'home' ) {
			$mod = $_GET['mod'];
			$act = $_GET['act'];
		}
	}else {
		$mod = 'home';
		$act = 'index2';
	}
	




	$class_name = ucfirst($mod) . "Controller";

	$path = __DIR__ . "/controller/" . $class_name . ".php";

	if (!file_exists($path)) {
		echo 'file' . $path . "khong ton tai";
		exit();
	}else {
		
	}


	require($path);

	$controller_obj = new $class_name();

	if (!method_exists($controller_obj, $act)) {
		echo 'sai';
		exit();
	}

	$controller_obj->$act();

?>

