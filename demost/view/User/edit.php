<?php 
 require('view/banken/header.php');
 ?>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Blank Page</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Sửa thông tin người dùng</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- Default box -->
      <div class="card">
        <div class="card-header">
          <h3 class="card-title">Title</h3>

          <div class="card-tools">
            <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip" title="Collapse">
              <i class="fas fa-minus"></i></button>
            <button type="button" class="btn btn-tool" data-card-widget="remove" data-toggle="tooltip" title="Remove">
              <i class="fas fa-times"></i></button>
          </div>
        </div>
        <div class="card-body">
          <div class="container-fluid">
    <h3 align="center">DevMind - Education And Technology Group</h3>
    <h3 align="center">Add New Users</h3>
    <hr>
        <?php foreach ($data_edit as $value) { ?>
        <form action="index.php?mod=user&act=editProcess" method="POST" role="form" enctype="multipart/form-data">
            <div class="form-group">
                <input type="hidden" class="form-control" name="id" value="<?php echo  $value['id'] ?>">
            </div>
            <div class="form-group">
                <label for="">Name</label>
                <input type="text" class="form-control" id="" placeholder="" name="name" value="<?php echo $value['name_user'] ?>">
            </div>
            <div class="form-group">
                <label for="">Email</label>
                <input type="text" class="form-control" name="email" value="<?php echo $value['email'] ?>">
            </div>
            <div class="form-group">
              <label for="">Phone</label>
              <input type="text" class="form-control" name="phone" value="<?php echo  $value['phone'] ?>">
            </div>
            <div class="form-group">
              <label for="">Address</label>
              <input type="text" class="form-control" name="address" value="<?php echo  $value['address'] ?>">
            </div>
            <div class="form-group">
                <label for="">Thumbnail</label><br>
                <img style="width: 10%;height: 10%" src="<?php echo "image/".$value['image_user'] ?>" alt=""><br><br>
                <input type="hidden" name="image" value="<?php echo $value['image'] ?>" >
                <input type="file" class="form-control" id="" placeholder="" name="image_edit" >
            </div>
            <div class="form-group">
                <label for="">Time</label>
                <input type="text" class="form-control" id="" placeholder="" name="created_at" value="<?php echo  date("Y/m/d")." ". date("h:i:sa") ?>">
            </div>
            <button type="submit" class="btn btn-primary">Create</button>
        </form>
        <?php  } ?>
    </div>
        </div>
        <!-- /.card-body -->
        <div class="card-footer">
          Footer
        </div>
        <!-- /.card-footer-->
      </div>
      <!-- /.card -->

    </section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->

<?php 
 require('view/banken/footer.php');
 ?>
