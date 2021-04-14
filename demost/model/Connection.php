<?php 
class Connection{
	var $conn;

	const SERVER_NAME = 'localhost';
	const USER_NAME = 'root';
	const PASSSWORD = '';
	const DB_NAME = 'php';
	
	function __construct(){
		$this->conn = new mysqli(self::SERVER_NAME,self::USER_NAME,self::PASSSWORD,self::DB_NAME);
		$this->conn->set_charset("utf8");
		if ($this->conn->connect_error) {
			die("Connection failed: ".$this->conn->connect_error);
		}
	}
}
?>