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
        <h3 class="text-center">--- POSTS ---</h3>
        <a href="/hw8/index.php?mod=post&act=list_content" class="btn btn-primary">HOME</a>
        <table class="table">
            <thead>
                <th>ID</th>
                <th>Tiêu Đề Bài Viết</th>
                <th>Ảnh</th>
                <th>Nội Dung Bài Viết</th>
                <th>Chuyên Mục</th>
                <th>Tác Giả</th>
                <th>Lượt xem</th>
                <th>Thời Gian </th>
                
            </thead>
        
            <tr>
                <td style="width: 100px"><?php echo $data_detail['id'] ?></td>
                <td style="width: 200px;"> <?php echo $data_detail['title'] ?></td>

                <td style="width: 100px ;height: 100px">
                    <img style="width: 100%;height: 100%" src="<?php echo "image/".$data_detail['image'] ?>" alt="">
                </td>
                <td style="width: 500px ;">
                    <?php echo htmlspecialchars_decode($data_detail['content']) ?>
                </td>
                <td><?php echo $data_detail['categorie']['name_category']; ?></td>
                <td><?php echo $data_detail['user']['name_user'] ?></td>
                <td><?php   echo $data_detail['view_count']; ?></td>
                <td><?php echo $data_detail['created_at'] ?></td>
                   
            </tr>
        </table>
        <div>
          <form action="/hw8/index.php?mod=post&act=update_content" method="POST" enctype="multipart/form-data">
            <input type="hidden" name="id" value="<?php echo $data_detail['id'] ?>">
            <input type="hidden" name="accept" value="1">
            <button type="submit" class="btn btn-primary">Đăng bài</button>
          </form>
        </div>
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

