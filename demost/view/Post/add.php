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
              <li class="breadcrumb-item active">Thêm Bài Viết</li>
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
    <h3 align="center">Add New Posts</h3>
    <hr>
        <form action="/hw8/index.php?mod=post&act=addProcess" method="POST" role="form" enctype="multipart/form-data">
            <div class="form-group">
                <label for="">title</label>
                <input type="text" class="form-control" id="" placeholder="" name="title">
            </div>
            <div class="form-group">
                <label for="">description</label>
                <textarea name="description" id="description" class="form-control"></textarea>

            </div>
            <div class="form-group">
                <label for="">Thumbnail</label>
                <input type="file" class="form-control" id="" placeholder="" name="image">
            </div>
            <div class="form-group">
                <label for="">Content</label>
               <textarea name="content" id="content" class="form-control"></textarea>
            </div>
            <div class="form-group">
                <label for="">Slug</label>
                <input type="text" class="form-control" id="" placeholder="" name="slug">
            </div>
            <div class="form-group">
                <label for="">View_count</label>
                <input type="text" class="form-control" id="" placeholder="" name="view_count">
            </div>
            
            <div class="form-group">
                <label for="">Catogory_id</label>
               <select  class="form-control" name="category_id">
                   <?php foreach ($categories as $value) { ?>
                    <option value="<?php echo $value['id'] ?>"><?php echo $value['name_category']; ?></option>
                <?php } ?>
               </select>
            </div>
            <div class="form-group">
                <label for="">User_id</label>
               <select  class="form-control" name="user_id">
                   <?php foreach ($users as $value) { ?>
                    <option value="<?php echo $value['id'] ?>"><?php echo $value['name_user']; ?></option>
                <?php } ?>
               </select>
            </div>
            <div class="form-group">
                
                <input type="hidden" class="form-control" id="" placeholder="" name="created_at" value="<?php echo  date("Y/m/d")." ". date("h:i:sa") ?>">
            </div>
            
            <div class="form-group">
               
                <input type="hidden" class="form-control" id="" placeholder="" name="accept" value="0">
            </div>
            <button type="submit" class="btn btn-primary">Create</button>
        </form>
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
