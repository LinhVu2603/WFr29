<?php 
require('model/Model.php');
class User extends Model
{
	protected $table = "users";
	
	const ROLE = [
		'user' => 0,
		'admin' =>1,
		'content' =>2,
	];

	public function where($columns, $value = null){
		if (is_array($columns)) {
			$where = '';
			foreach ($columns as $column => $value) {
				$where .= "$column = '$value'";
				$where .= " AND ";
			}
			$where = rtrim($where, " AND");
		}else {
			$where = "$columns = '$value'";
	
		}
		$query = "SELECT * from " . $this->table . " WHERE " . $where;

		$result = $this->connection->query($query);

		$data = array();

		while ($row = $result->fetch_assoc()) {
		    $data[] = $row;
		}
		return $data;
	}
	
}

?> 