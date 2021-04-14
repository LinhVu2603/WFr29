<?php 
require('view/FontEnd/header.php');
?>
<main role="main">
      <!-- Content -->
      <article>
        <header class="section background-dark">
          <div class="line">        
            <h1 class="text-white margin-top-bottom-40 text-size-60 text-line-height-1">
          </div>  
        </header>
      </article>
 	<section class="full-width padding-2x">  
	        <div class="s-12 m-12 l-9 ">
	          <h2 class="text-size-50 text-left">Blog</h2>
	          <hr class="break-small background-primary break-left"> 
	         	 
				  <div class="padding">
            <div class="s-12 m-12 l-12">
              <div class="s-2 m-2 l-2">
                <p><i class="icon-user"></i>
                <?php echo $Post_detail_id['user']['name_user']; ?></p>
              </div>
              <div class="s-3 m-3 l-3">
                <p> <i class="icon-clock"></i>
                <?php echo $Post_detail_id['created_at']; ?></p>
              </div>
              <div class="s-2 m-2 l-2">
                <p><i class="icon-eye"></i>
                <?php echo $Post_detail_id['view_count']; ?></p>
                
              </div>
            </div>
            <hr>
					<h1><?php echo $Post_detail_id['title']; ?></h1>

					<h5><?php echo $Post_detail_id['description']; ?></h5>

					<p><?php echo htmlspecialchars_decode($Post_detail_id['content']); ?></p><br>

					
				</div>				
	        </div>
	         <div class="s-12 m-12 l-3">
	          	<h2 class="text-size-50 text-left">Tags</h2>
	          	<hr class="break-small background-primary break-left"> 
	              <div class="button button-primary-stroke margin-bottom"> 
	                <a href="/hw8/index.php?mod=home&act=news">Thời Sự</a>
	              </div>
                <div class="button button-dark-stroke margin-bottom"> 
                  <a href="/hw8/index.php?mod=home&act=news_country">Tin Trong Nước</a>
                </div>
                <div class="button button-primary-stroke margin-bottom"> 
                  <a href="/hw8/index.php?mod=home&act=news_international">Tin Quốc Tế</a>
                </div>
	              <div class="button button-dark-stroke margin-bottom "> 
	                <a href="/hw8/index.php?mod=home&act=sports">Thể Thao</a>
	              </div>
                <div class="button button-primary-stroke margin-bottom"> 
                  <a href="/hw8/index.php?mod=home&act=soccers">BÓng Đá</a>
                </div>
                <div class="button button-dark-stroke margin-bottom"> 
                  <a href="/hw8/index.php?mod=home&act=tennis">Quần Vợt</a>
                </div>
	              <div class="button button-primary-stroke margin-bottom"> 
	                <a href="/hw8/index.php?mod=home&act=tennis">Y Tế</a>
	              </div>
                <div class="button button-dark-stroke margin-bottom"> 
                  <a href="/hw8/index.php?mod=home&act=covid_19">Covid_19</a>
                </div>
	        </div>
    </section>
	<hr>
    
        
        <div id="fb-root"></div>
        <script async defer crossorigin="anonymous" src="https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v7.0&appId=1475111092693830&autoLogAppEvents=1"></script>
    <section class="full-width padding-2x" style="display: <?php if (isset($_SESSION['user'])) {
      echo 'block';
    }else {
      echo 'none';
    } ?>">
    <h2 class="text-size-50 text-left">Commnent</h2>
        <hr class="break-small background-primary break-left">
      <div>
       <div class="fb-comments" data-href="http://php22.zent/hw8/index.php?mod=home&amp;act=detail" data-numposts="5" data-width=""></div>
      </div>
    </section>

</main>
<?php 
require('view/FontEnd/footer.php');
?>