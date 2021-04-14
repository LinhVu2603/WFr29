<?php 
  require('../FontEnd/header.php');
 ?>
    
    <!-- MAIN -->
    <main role="main">    
      <!-- Main Header -->
      <header>
        <div class="carousel-default owl-carousel carousel-main carousel-nav-white background-dark text-center">
          <div class="item">
            <div class="s-12">
              <img src="public/fontEnd/img/header.jpg" alt="">
              <div class="carousel-content">
                <div class="content-center-vertical line">
                  <div class="margin-top-bottom-80">
                    <!-- Title -->
                    <h1 class="text-white margin-bottom-30 text-size-60 text-m-size-30 text-line-height-1">Đoàn Tiến Đạt<br></h1>
                    <div class="s-12 m-10 l-8 center"><p class="text-white text-size-14 margin-bottom-40"></p></div>
                    <div class="line">
                      <div class="s-12 m-12 l-3 center">
                        <a class="button button-white-stroke s-12" href="">Get Started Now</a>
                      </div>       
                    </div>  
                  </div>
                </div>
              </div>
            </div>
          </div>
         <div class="item"> 
            <div class="s-12">
              <img src="public/fontEnd/img/header.jpg" alt="">
              <div class="carousel-content">
                <div class="content-center-vertical line">
                  <div class="margin-top-bottom-80">
                    <!-- Title -->
                    <h1 class="text-white margin-bottom-30 text-size-60 text-m-size-30 text-line-height-1">Đoàn Tiến Đạt<br></h1>
                    <div class="s-12 m-10 l-8 center"><p class="text-white text-size-14 margin-bottom-40"></p></div>
                    <div class="line">
                      <div class="s-12 m-12 l-3 center">
                        <a class="button button-white-stroke s-12" href="">Get Started Now</a>
                      </div>       
                    </div>  
                  </div>
                </div>
              </div>
            </div>
          </div>
         <div class="item">
            <div class="s-12">
              <img src="public/fontEnd/img/header.jpg" alt="">
              <div class="carousel-content">
                <div class="content-center-vertical line">
                  <div class="margin-top-bottom-80">
                    <!-- Title -->
                    <h1 class="text-white margin-bottom-30 text-size-60 text-m-size-30 text-line-height-1">Đoàn Tiến Đạt<br></h1>
                    <div class="s-12 m-10 l-8 center"><p class="text-white text-size-14 margin-bottom-40"></p></div>
                    <div class="line">
                      <div class="s-12 m-12 l-3 center">
                        <a class="button button-white-stroke s-12" href="">Get Started Now</a>
                      </div>       
                    </div>  
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>               
      </header>     

      <section class="full-width padding-2x">  
	        <div class="s-12 m-12 l-9 animate-box" >
	          <h2 class="text-size-50 text-left">News</h2>
	          <hr class="break-small background-primary break-left"> 
	          <?php foreach ($post_fontEnd_time as $data) { ?>

	          
	          	<div class="line"> 
	          		<div style="border-radius: 5px;" class="s-12 m-12 l-4 margin-bottom" >  
		            <a class="image-with-hover-overlay image-hover-zoom" href="/hw8/index.php?mod=home&act=detail&id=<?php echo $data['id'] ?>">
		              <img style="border-radius: 5px"  src="<?php echo "image/".$data['image'] ?>" alt="" title="Portfolio Image 1" />
		            </a>
	          </div>
	          <div class="s-12 m-12 l-8">
		            <div class="padding-2x">
		              <h2><a href="/hw8/index.php?mod=home&act=detail&id=<?php echo $data['id'] ?>"><?php echo $data['title']; ?></a></h2>
		              <div class="s-3 m-3 l-3">
                    
                     
                    <p> <i class="icon-user"></i> <?php foreach ($users as $value_user) {
                      if ($value_user['id'] == $data['user_id']) {
                        echo $value_user['name_user'];
                      }
                    } ?></p>
                    
		              </div>
		               <div class="s-6 m-6 l-6">
                    <p><i class="icon-clock"></i>
                    <?php echo $data['created_at']; ?></p>
		              </div>
		              <br><br>
		              <?php echo htmlspecialchars_decode($data['description']); ?>
		            </div>
	          </div>
	          	</div>
	          <?php  } ?>
	        </div>
	        <div class="s-12 m-12 l-3 animate-box" >
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
      
      <!-- Section 3 -->
      
    <!--   <hr class="break margin-top-bottom-0"> -->
      <!-- Section 4 -->
      <section class="section-top-padding full-width padding-2x " >
        <h2 class="text-size-50 text-center">Trending</h2>
        <hr class="break-small background-primary break-center"> 
        <div class="tabs background-primary-hightlight">
            <div class="tab-item tab-active">
              <div class="tab-content lightbox-gallery">
				<?php foreach ($post_fontEnd_view as $data) { ?>
                <div class="s-12 m-6 l-3">
                  <a class="image-with-hover-overlay image-hover-zoom" href="/hw8/index.php?mod=home&act=detail&id=<?php echo $data['id'] ?>">
                   
                    <img  src="<?php echo "image/".$data['image'] ?>" alt="" title="Portfolio Image 1" />
                  </a>
                  <div class="padding">
                  	<h3 class="text-thin"><a href="/hw8/index.php?mod=home&act=detail&id=<?php echo $data['id'] ?>"><?php echo $data['title']; ?></a></h3>
                  	<div class="s-6 m-6 l-6">
                      <p><i class="icon-user"></i>
                      <?php foreach ($users as $value_user) {
                        if ($value_user['id']==$data['user_id']) {
                          echo $value_user['name_user'];
                        }
                      } ?></p>
                  	</div>
                  	<div class="s-6 m-6 l-6">
                      <p><i class="icon-eye"></i>
                      <?php echo $data['view_count']; ?></p>
                  	</div>
                  </div>
                </div>
				<?php } ?>
               
                </div>
              </div>  
            </div>
         </div>
      </section>
      
      <!-- Section 5 -->    
      <section class="section background-white text-center">
        <div class="line">
          <h2 class="text-size-50 text-center">Poster</h2>
          <hr class="break-small background-primary break-center">
          <div class="carousel-default owl-carousel carousel-wide-arrows">
            <?php foreach ($users as $data) { ?>
            <div class="item">
              <div class="s-12 m-12 l-7 center text-center">
                <img class="image-testimonial-small" src="public/fontEnd/img/testimonials-04.png" alt="">
                <p class="h1 margin-bottom text-size-20">
                  <?php echo $data['name_user']; ?>

                </p>
                <p class="h1 text-size-16"><a href="#">fb</a> / <a href="">twiter</a> / <a href="">intargram</a></p>
              </div>
            </div>
          <?php } ?>
          </div>
        </div>
      </section>
    </main>
    
    <!-- FOOTER -->
   <?php 
 require('../FontEnd/footer.php');
  ?>