<!DOCTYPE html>
<html lang="en-US">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Eleganter - New Amazing HTML5 Template</title>
    <link rel="stylesheet" href="../../public/fontEnd/css/components.css">
    <link rel="stylesheet" href="../../public/fontEnd/css/icons.css">
    <link rel="stylesheet" href="../../public/fontEnd/css/responsee.css">
    <link rel="stylesheet" href="../../public/fontEnd/owl-carousel/owl.carousel.css">
    <link rel="stylesheet" href="../../public/fontEnd/owl-carousel/owl.theme.css">     
    <link rel="stylesheet" href="../../public/fontEnd/css/template-style.css">
    <link rel="stylesheet" href="../../public/backend/plugins/summernote/summernote-bs4.css">
    <link rel="stylesheet" href="../../public/fontEnd/css/animate.css"  type="text/css"/>
    <link href='https://fonts.googleapis.com/css?family=Playfair+Display&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <script type="text/javascript" src="../../public/fontEnd/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="../../public/fontEnd/js/jquery-ui.min.js"></script>      
  </head>
  
  <body class="size-1140">
    <!-- PREMIUM x BUTTON -->
    <a target="_blank" class="hide-s" href="../template/eleganter-premium-responsive-business-template/" style="position:fixed;top:120px;right:-14px;z-index:10;"><img src="../../public/fontEnd/img/premium-features.png" alt=""></a>
    <!-- HEADER -->
    <header role="banner" class="position-absolute">    
      <!-- Top Navigation -->
      <nav class="background-transparent background-transparent-hightlight full-width sticky">
        <div class="s-12 l-2">
          <a href="index.html" class="logo">
            <!-- Logo White Version -->
            <img class="logo-white" src="../../public/fontEnd/img/logo.png" alt="">
            <!-- Logo Dark Version -->
            <img class="logo-dark" src="../../public/fontEnd/img/logo-dark.png" alt="">
          </a>
        </div>
        <div class="top-nav s-12 l-10">
          <p class="nav-text"></p>
          <ul class="right chevron">
            <li><a href="/hw8/index.php?mod=home&act=index2">Home</a></li>
            <li><a href="/hw8/index.php?mod=home&act=news">Thời Sự</a>
              <ul>
                <li><a href="/hw8/index.php?mod=home&act=news_country">Tin Trong Nước</a></li>
                <li><a href="/hw8/index.php?mod=home&act=news_international">Tin Quốc Tế</a></li>
              </ul>
            </li>
            <li><a href="/hw8/index.php?mod=home&act=sports">Thể Thao</a>
              <ul>
                <li><a href="/hw8/index.php?mod=home&act=soccers">Bóng Đá</a></li>
                <li><a href="/hw8/index.php?mod=home&act=tennis">Quần Vợt</a></li>
              </ul>
            </li>
            <li><a href="/hw8/index.php?mod=home&act=medical">Y Tế</a>
              <ul>
                <li><a href="/hw8/index.php?mod=home&act=covid_19">Dịch Covid-19</a></li>
              </ul>
            </li>
            <li><a href="gallery.html">Gallery</a></li>
            <li>
              <a href="/hw8/index.php?mod=auth&act=login" class="login" style="display: <?php 
                    if (isset($_SESSION['user'])) {
                      echo 'none';
                    }else {
                      echo 'block';
                    }
               ?> ">Đăng Nhập</a>
              <a href="/hw8/index.php?mod=auth&act=logout" class="logout" style="display: <?php 
                    if (isset($_SESSION['user'])) {
                      echo 'block';
                    }else {
                      echo 'none';
                    }?>;">Đăng Xuất <p><?php echo $_SESSION['user']['name_user']; ?></p></a>



            </li>
          </ul>
        </div>
      </nav>
    </header>