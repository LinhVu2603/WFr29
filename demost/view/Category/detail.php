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
              <li class="breadcrumb-item active">Blank Page</li>
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
        <h3 class="text-center">--- CATEGORIES ---</h3>
        <a href="/hw8/index.php?mod=category&act=list" class="btn btn-primary">HOME</a>
        <table class="table">
            <thead>
                <th style="width: 10%;height: 100px;">ID</th>
                <th>name</th>
                <th>Parent Category</th>
                <th>Slug</th>
                <th>Image</th>
                <th>Description</th>
                <th>Time</th>
               
            </thead>
            <?php foreach ($data as $value) { ?>
            <tr>
                <td><?php echo $value['id'] ?></td>
                <td><?php echo $value['name_category'] ?></td>
                <td><?php echo $value['parent_id'] ?></td>
                <td><?php echo $value['slug'] ?></td>
                <td style="width: 150px ;height: 100px"><img style="width: 100%;height: 100%" src="<?php echo "image/".$value['image_category'] ?>" alt="">
                </td>
                
                <td >
                    <?php echo $value['description_category']; ?>
                </td>
                <td>
                    <?php echo $value['created_at_category']; ?>
                </td>
            </tr>
            <?php }  ?>
        </table>
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

