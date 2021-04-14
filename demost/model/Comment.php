<?php 
require('model/Model.php');
	class Comment extends Model
	{
		protected $table = "comments";




		public function all_comment($cloumn){
			$query = "SELECT * FROM $this->table ORDER BY $cloumn DESC";

			$result = $this->connection->query($query);

			$data =array();
			while ($row = $result->fetch_assoc()) {
			    $data[] = $row;
			}
			return $data;	

		}
	};

	
?>