
  
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
              <li class="breadcrumb-item active">Thêm Danh Mục</li>
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
    <h3 align="center">Add New Category</h3>
    <hr>
        <div class="container-fluid">

       
        <form action="/hw8/index.php?mod=category&act=addProcess" method="POST" role="form" enctype="multipart/form-data">
            
            <div class="form-group">
                <label for="">Tên chuyên mục</label>
                <input type="text" class="form-control" id="" placeholder="" name="name_category">
            </div>
           <!--  <div class="form-group">
                <label for="">Parent Category</label>
                <input type="text" class="form-control" id="" placeholder="" name="parent_id">
            </div> -->
              <div class="form-group">
                <label for="">Image</label>
                <input type="file" class="form-control" id="" placeholder="" name="image_category">
            </div>
            <!-- <div class="form-group">
                <label for="">Slug</label>
                <input type="text" class="form-control" id="" placeholder="" name="slug">
            </div> -->
              
            <div class="form-group">
                <label for="">Danh mục</label>
              <!--   <textarea name="description" id="description" class="form-control"></textarea> -->
                <input type="text" class="form-control" name="description_category">
                
                
            </div>

            <div class="form-group">
                <label for="">Time</label>
                <input type="text" class="form-control" name="created_at_category" value="<?php echo  date("Y/m/d")." ". date("h:i:sa") ?>">
            </div> 
            
            <!-- <div class="form-group">
                <label for="">Time</label>
                <div class="input-group">
                    <div class="input-group-prepend">
                      <span class="input-group-text"><i class="far fa-calendar-alt"></i></span>
                    </div>
                    <input id="datemask" name="created_at" type="text" class="form-control" data-inputmask-alias="datetime" data-inputmask-inputformat="yyyy/mm/đ" data-mask>
                  </div>
            </div> -->
            <button type="submit" class="btn btn-primary" name="">Create</button><br><br>
                </form>

                </div>
            </div>

            </form>
           
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


