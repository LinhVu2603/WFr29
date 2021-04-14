<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 3 | Log in</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="public/backend/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="public/backend/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="public/backend/dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition login-page" style="background-image: url(image/background-anh-dong_032845920.gif);background-size: cover;  ">
<div class="login-box">
  <div class="login-logo">
    <a href="public/backend/index2.html"><b>Admin</b>Zent</a>
  </div>
  <!-- /.login-logo -->
  <div class="card">
    <div class="card-body login-card-body">
      <p class="login-box-msg">Sign in to start your session</p>
        <?php if (isset($_COOKIE['erro'])) { ?>
          <br>
          <p style="color: red;"> Thông báo : <?php echo $_COOKIE['erro']; ?></p>
        <?php   } ?>  
      <form action="index.php?mod=auth&act=login" method="post" role="form" id="quickForm">
                <div class="card-body">
                  <div class="form-group">
                    <label for="exampleInputEmail1">Email address</label>
                  </div>
                  <div class="input-group mb-3">
                    <input type="email" class="form-control" placeholder="Email" name="email">
                    <div class="input-group-append">
                      <div class="input-group-text">
                        <span class="fas fa-envelope"></span>
                      </div>
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
  
                  </div>
                  <div class="input-group mb-3">
                    <input type="password" class="form-control" placeholder="Password" name="password" >
                    <div class="input-group-append">
                      <div class="input-group-text">
                        <span class="fas fa-lock"></span>
                      </div>
                    </div>
                  </div>
                </div>
                <!-- /.card-body -->
                 <div class="row">
                  <div class="col-8">
                  <div class="icheck-primary">
                    <a href="index.php?mod=auth&act=register" class="text-center">Register An Account </a>
                  </div>
                </div>
                 
                  <div class="col-4">
                    <div class="card-footer">
                          <button type="submit" name="btn_submit" class="btn btn-primary">Submit</button>
                    </div>
                  </div>
                </div>
              </form>
 
      
      <!-- /.social-auth-links -->    
      
    </div>
    <!-- /.login-card-body -->
  </div>
</div>
<!-- /.login-box -->

<!-- jQuery -->
<script src="public/backend/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="public/backend/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="public/backend/dist/js/adminlte.min.js"></script>
<script src="public/backend/plugins/jquery-validation/jquery.validate.min.js"></script>

<script src="public/backend/plugins/jquery-validation/additional-methods.min.js"></script>
<!-- AdminLTE App -->
<script src="public/backend/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="public/backend/dist/js/demo.js"></script>
<script type="text/javascript">
$(document).ready(function () {
  
  $('#quickForm').validate({
    rules: {
      email: {
        required: true,
        email: true,
      },
      password: {
        required: true,
        minlength: 5
      },
      terms: {
        required: true
      },
    },
    messages: {
      email: {
        required: "Please enter a email address",
        email: "Please enter a vaild email address"
      },
      password: {
        required: "Please provide a password",
        minlength: "Your password must be at least 5 characters long"
      },
      terms: "Please accept our terms"
    },
    errorElement: 'span',
    errorPlacement: function (error, element) {
      error.addClass('invalid-feedback');
      element.closest('.form-group').append(error);
    },
    highlight: function (element, errorClass, validClass) {
      $(element).addClass('is-invalid');
    },
    unhighlight: function (element, errorClass, validClass) {
      $(element).removeClass('is-invalid');
    }
  });
});
</script>

</body>
</html>
