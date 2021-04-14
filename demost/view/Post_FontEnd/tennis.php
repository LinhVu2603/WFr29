<?php 
require('view/FontEnd/header.php');
?>
<main role="main">
      <!-- Content -->
      <article>
        <header class="section background-dark">
          <div class="line">        
            <h1 class="text-white margin-top-bottom-40 text-size-60 text-line-height-1"><a href="">Home</a>->Sports->Tennis</h1>
          </div>  
        </header>
      </article>

      <section class="full-width padding-2x">  
          <div class="s-12 m-12 l-9 ">
            <h2 class="text-size-50 text-left">News</h2>
            <hr class="break-small background-primary break-left"> 
            <?php foreach ($Post_tennis_time as $data) { ?>
            
              <div class="line "> 
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
            <?php    } ?>
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

      <section class="section-top-padding full-width padding-2x">
        <h2 class="text-size-50 text-center">Trending</h2>
        <hr class="break-small background-primary break-center"> 
        <div class="tabs background-primary-hightlight">
            <div class="tab-item tab-active">
            <div class="tab-content lightbox-gallery">
        <?php foreach ($Post_tennis_view as $data) { ?>
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



</main>
<?php 
require('view/FontEnd/footer.php');
?>