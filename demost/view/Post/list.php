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
                  <th>Tên danh mục</th>
                  <th>Tác Giả</th>
                  <th>Danh mục</th>
                  <th>Lượt Xem</th>
                  <th style="width: 200px;"></th>
                  
                </tr>
                </thead>
               
                <tbody>
                   <?php foreach ($posts as $value) {   ?>
                     
                    <tr>
                        <td><?php echo $value['title'] ?></td>
                        <td> <?php foreach ($users as $value_user) { ?>
                            <?php  if ($value_user['id'] == $value['user_id']) echo $value_user['name_user']; ?>
                             <?php } ?>
                        </td>
                        <td>
                          <?php foreach ($categories as $value_category) {
                            if ($value_category['id'] == $value['category_id']) {
                              echo $value_category['description_category'];
                            }
                          } ?>

                        </td>
                        <td><?php echo $value['view_count'] ?></td>
                        <td class="project-actions text-right">
                          <a class="btn btn-primary btn-sm" href="/hw8/index.php?mod=post&act=detail&id=<?php echo $value['id']; ?>">
                              <i class="fas fa-folder"></i>
                              View
                          </a>
                          <?php
                            if ($_SESSION['user']['id'] == $value['user_id']  || $_SESSION['user']['role'] == 1 ) { ?>
                            <a class="btn btn-info btn-sm" href="/hw8/index.php?mod=post&act=edit&id=<?php echo $value['id']; ?>">
                                <i class="fas fa-pencil-alt"></i>
                                Edit
                            </a>  
                            <?php    } ?>                   
                           <?php if ($_SESSION['user']['role'] == 1) { ?>
                          <a class="btn btn-danger btn-sm" href="/hw8/index.php?mod=post&act=delete&id=<?php echo $value['id']; ?>">
                              <i class="fas fa-trash"></i>
                              Delete
                          </a>
                        <?php } ?>
                      </td>
                    </tr> 
                   
                     <?php  } ?>     
                </tbody>
                
                <tfoot>
                <tr>
                  <th>Tên danh mục</th>
                  <th>Tác Giả</th>
                  <th>Lượt Xem</th>
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

