
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
              <li class="breadcrumb-item active">Danh Sách danh mục</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
         <div class="col-12">
           <div class="card">
            <div class="card-header">
              <h3 class="card-title"></h3>
            </div>
            <!-- /.card-header -->
            <div class="card-body">
              <table id="example1" class="table table-bordered table-striped">
                <thead>
                <tr>
                  <th>Chuyên mục</th>
                  <th>Danh mục</th>
                  <th></th>
                </tr>
                </thead>
               
                <tbody>
                   <?php foreach ($categories as $value) {   ?>
                    <tr>
                        <td> <?php echo $value['name_category'] ?></td>
                        <td ><?php echo htmlspecialchars_decode($value['description_category']); ?></td>
                       
                        <td class="project-actions text-right">
                          <a class="btn btn-primary btn-sm" href="/hw8/index.php?mod=category&act=detail&id=<?php echo $value['id']; ?>">
                              <i class="fas fa-folder"></i>
                              View
                          </a>
                          <a class="btn btn-info btn-sm" href="/hw8/index.php?mod=category&act=edit&id=<?php echo $value['id']; ?>">
                              <i class="fas fa-pencil-alt"></i>
                              Edit
                          </a>
                          <a class="btn btn-danger btn-sm" href="/hw8/index.php?mod=category&act=delete&id=<?php echo $value['id']; ?>">
                              <i class="fas fa-trash"></i>
                              Delete
                          </a>
                      </td>
                    </tr> 
                     <?php } ?>     
                </tbody>
                
                <tfoot>
                <tr>
                  <th>Tên danh mục</th>
                  <th>Mô tả</th>
                  <th></th>
                </tr>
                </tfoot>
              </table>
            </div>
            <!-- /.card-body -->
          </div>
         </div>

      </div>
      <!-- Default box -->
    
      <!-- /.card -->

    </section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->

<?php 
 require('view/banken/footer.php');
 ?>
