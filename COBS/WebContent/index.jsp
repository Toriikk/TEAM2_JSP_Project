<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp" %>
<style>
h1{
	text-align: left;
}
</style>
  <!-- Masthead -->
  <header class="masthead text-white text-center">
    <div class="overlay"></div>
       
        <div class="mainLine">
          <span style="width: 100%; height: 200px;"></span>
          <h1 style="color:#484848; font-size: 48px; line-height: 1.5em;">누구나 들을 수 있는 무료 코딩 강의,<br/> 지금 바로 시작하세요!</h1>
        </div>
       
          <form>
            <div class="form-row" style="width: 30%;">
              <div class="col-12 col-md-9 mb-2 mb-md-0">
                <input type="email" class="form-control form-control-lg" placeholder="  이메일 주소">
              </div>
              <div class="col-12 col-md-3">
                <input type="button" value="회원가입" class="btn btn-block btn-lg btn-primary" onclick="location.href='/Tutoring/member/insert'">
              </div>
            </div>
          </form>
  </header>

  <!-- Icons Grid -->
  <section class="features-icons bg-light text-center">
    <div class="container">
      <div class="row">
        <div class="col-lg-4">
          <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
            <div class="features-icons-icon d-flex">
              <i class="icon-screen-desktop m-auto text-primary"></i>
            </div>
            <h3>강의</h3>
            <p class="lead mb-0">누구나, 어디서나 들을 수 있는 <br/>무료 강의</p>
          </div>
        </div>
        <div class="col-lg-4">
          <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
            <div class="features-icons-icon d-flex">
              <i class="icon-layers m-auto text-primary"></i>
            </div>
            <h3>커리큘럼</h3>
            <p class="lead mb-0">내 레벨에 맞춰 선택하고<br/> 체계적인 수업 진행</p>
          </div>
        </div>
        <div class="col-lg-4">
          <div class="features-icons-item mx-auto mb-0 mb-lg-3">
            <div class="features-icons-icon d-flex">
              <i class="icon-check m-auto text-primary"></i>
            </div>
            <h3>수료증</h3>
            <p class="lead mb-0">완강하면 주어지는 <br/>수료증을 모아보세요! <br/>쌓여가는 수료증과 함께<br/> 늘어나는 성취감!</p>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- Testimonials -->
  <section class="testimonials text-center bg-light">
    <div class="container">
      <h2 class="mb-5">지금 가장 인기있는 강의 탑3!</h2>
      <div class="row">
        <div class="col-lg-4">
          <div class="testimonial-item mx-auto mb-5 mb-lg-0">
            <img class="img-fluid rounded-circle mb-3" src="img/bjavat.jpg" alt="">
            <h5>강의1.</h5>
            <p class="font-weight-light mb-0">강의1에 대한 설명..</p>
          </div>
        </div>
        <div class="col-lg-4">
          <div class="testimonial-item mx-auto mb-5 mb-lg-0">
            <img class="img-fluid rounded-circle mb-3" src="img/expression3.JPG" alt="">
            <h5>강의2.</h5>
            <p class="font-weight-light mb-0">강의2에대한 설명</p>
          </div>
        </div>
        <div class="col-lg-4">
          <div class="testimonial-item mx-auto mb-5 mb-lg-0">
            <img class="img-fluid rounded-circle mb-3" src="img/java2.jpg" alt="">
            <h5>강의3.</h5>
            <p class="font-weight-light mb-0">강의3에대한 설명</p>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- Call to Action -->
 <!--  <section class="call-to-action text-white text-center">
    <div class="overlay"></div>
    <div class="container">
      <div class="row">
        <div class="col-xl-9 mx-auto">
          <h2 class="mb-4">내게 꼭 맞는 튜터를 찾아보세요</h2>
        </div>
        <div class="col-md-10 col-lg-8 col-xl-7 mx-auto">
          <form>
            <div class="form-row">
              <div class="col-12 col-md-9 mb-2 mb-md-0">
                <input type="email" class="form-control form-control-lg" placeholder="  이메일 주소">
              </div>
              <div class="col-12 col-md-3">
                 <input type="button" value="회원가입" class="btn btn-block btn-lg btn-primary" onclick="location.href='/Tutoring/member/insert'">
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </section> -->
<%@ include file="/include/footer.jsp" %>