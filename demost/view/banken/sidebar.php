  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="public/backend/index3.html" class="brand-link">
      <img src="public/backend/dist/img/AdminLTELogo.png"
           alt="AdminLTE Logo"
           class="brand-image img-circle elevation-3"
           style="opacity: .8">
      <span class="brand-text font-weight-light">AdminLTE 3</span>
    </a>
    
    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
          <img src="public/backend/dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
          <a href="#" class="d-block"><?php echo $_SESSION['user']['name_user']; ?></a>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item">
            <a href="widgets.html" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
                Trang Chủ
                <span class="right badge badge-danger">New</span>
              </p>
            </a>
          </li>
          <?php if ($_SESSION['user']['role'] == 1) { ?>
          <li class="nav-item has-treeview <?php if($_GET['mod'] == 'category') echo  'menu-open'?>">
            <a href="#" class="nav-link <?php if($_GET['mod'] == 'category') echo 'active' ?>">
              <i class="nav-icon fas fa-copy"></i>
              <p>
                Danh mục
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="/hw8/index.php?mod=category&act=list" class="nav-link ">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Danh sách danh mục </p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/hw8/index.php?mod=category&act=add" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Thêm danh mục</p>
                </a>
              </li>
            </ul>
          </li>
          <?php } ?>
          
          <li class="nav-item has-treeview <?php if ($_GET['mod'] == 'post') echo 'menu-open'?>">
            <a href="" class="nav-link <?php if ($_GET['mod'] == 'post') echo 'active'?> ">
              <i class="nav-icon fas fa-copy"></i>
              <p>
                Post

                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              
              <li class="nav-item">
                <a href="/hw8/index.php?mod=post&act=list" class="nav-link ">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Danh sách bài Viết</p>
                </a>
              </li>
             
              <li class="nav-item" x>
                <a href="/hw8/index.php?mod=post&act=add" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Thêm Bài Viết</p>
                </a>
              </li>
             <?php if ($_SESSION['user']['role'] == 1) { ?>
              <li class="nav-item" x>
                <a href="/hw8/index.php?mod=post&act=list_content" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Duyệt Bài Viết</p>
                </a>
              </li>
               <?php  } ?> 
              
            </ul>
          <?php if ($_SESSION['user']['role'] == 1) { ?>
          <li class="nav-item has-treeview <?php if ($_GET['mod'] == 'user') echo 'menu-open'?>" >
            <a href="" class="nav-link <?php if ($_GET['mod'] == 'user') echo 'active'?> ">
              <i class="nav-icon fas fa-copy"></i>
              <p>
                User

                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="/hw8/index.php?mod=user&act=list" class="nav-link ">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Danh sách người dùng</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/hw8/index.php?mod=user&act=add" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Thêm người dùng</p>
                </a>
              </li>
              
            </ul>
          </li> 
          <?php  } ?>  
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>
