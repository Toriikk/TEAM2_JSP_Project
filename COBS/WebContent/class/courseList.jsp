<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp" %>
<style>
html, body, div, span, applet, object, iframes,
	p, blockquote, pre, abbr, acronym, address, big, quotes, code, del,
	dfn, em, img, ins, kbd, q, s, samp, small, strike, sub, sup, tt, var, u,
	i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table,
	caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas,
	details, embed, figure, figcaption, footer, header, hgroup, menu, nav,
	output, ruby, section, summary, time, mark, audio, video {
	margin: 0;
	padding: 0;
	border: 0;
	font-size: 100%;
	do: inherit;
	vertical-align: baseline;
}
article, aside, details, figcaption, figure, footer, header, hgroup,
	menu, nav, section {
	display: block;
}
blockquote, q {
	quotes: none;
}
blockquote : before, blockquote : after, q : before, q : after {
	content: '';
	content: none;
}
table {
	border-collapse: collapse;
	border-spacing: 0;
}
a{
	text-decoration: none;
	color: black;
}
a:hover{
	text-decoration: none;
	color: black;
}
.card:hover{
    background-color: #eee;
}
.card {
	height: 400px;
	width: 350px;
	border-radius: 15px;
	display: inline-block;
	margin-top: 30px;
	margin-bottom: 30px;
	position: relative;
	box-shadow: 0 6px 0px 0 rgba(0, 0, 0, 0.2);
	overflow: hidden;
}
.card-header {
	-webkit-transition: 0.5s; /*사파리 & 크롬*/
    -moz-transition: 0.5s;  /*파이어폭스*/
    -ms-transition: 0.5s;	/*인터넷 익스플로러*/
    -o-transition: 0.5s;  /*오페라*/
    transition: 0.5s;
	width: 100%;
	height: 230px;
	border-radius: 15px 15px 0 0;
	background-color: gray;
	background-size: 100% 230px;
	background-repeat: no-repeat;	
}
.card-header-is_closed{
    background-color: #EF5A31 ;
    color: #FFF ;
    font-weight: bold ;
    text-align: center ;
    float: right;
    margin: 15px 15px 0 0;
    border-radius: 50%;
    font-weight: bold;
    padding: 10px 10px;
    line-height: 20px;
}
.card-body-header{
	line-height: 25px;
	margin: 10px 20px 0px 20px;
}
.card:hover .card-body-description {
    opacity: 1;
    -webkit-transition: .5s ease-in-out;
    -moz-transition: .5s ease-in-out;
    -ms-transition: .5s ease-in-out;
    -o-transition: .5s ease-in-out;
    transition : .5s ease-in-out;
    overflow: scroll;
    text-decoration: none;
}
.card-columns{
	overflow: auto;
	flex-wrap: nowrap;
}
</style>
<body>
<br/>
<div class="container">
<h3>과정 둘러보기</h3>
<hr>
<p style="font-size:1.25em;">왕초보 탈출코스</p>

<p style="font-size:0.9em;">눈높이에 맞는 수업으로 자신감과 실력을 키워보세요. 간단한 문제부터 복잡한 문제에 대해 자세한 설명, A부터Z까지! 누구나 이해할 수 있습니다.</p>
<div class="card-columns" style="column-count:4;">
	<c:forEach items="${dto}" var="dto">
		<c:if test="${dto.clevel eq 'beginner'}">
		<a href="CourseDetail?num=${dto.classnum}">
			<div class="card">
				<div class="card-header" style="background-image: url('/Tutoring/img/${dto.uploadFile}');">
				</div>
				<div class="card-body">
					<div class="card-body-header" >
						<h5>${dto.classname}</h5>
						<p class = "card-body-nickname" style="font-size:0.9em;">${dto.topic}</p>
					</div>
				</div>
			</div>
		</a>
		</c:if>
	</c:forEach>
</div>
<br/><br/>

<p style="font-size:1.25em;">중급자를 위한 코스</p>
<p style="font-size:0.9em;">왕초보를 벗어나신 분들과 실력이 UP되고 싶어하시는 분들을 위해 준비된 코스!</p>
<div class="card-columns" style="column-count:4;">
	<c:forEach items="${dto}" var="dto">
		<c:if test="${dto.clevel eq 'intermediate'}">
		<a href="CourseDetail?num=${dto.classnum}">
			<div class="card">
				<div class="card-header" style="background-image: url('/Tutoring/img/${dto.uploadFile}');"> <!-- upload파일에 사진이 안담겨 사진경로 바꿈 -->
				</div>
				<div class="card-body">
					<div class="card-body-header" >
						<h5>${dto.classname}</h5>
						<p class = "card-body-nickname" style="font-size:0.9em;">${dto.topic}</p>
					</div>
				</div>
			</div>
		</a>
		</c:if>
	</c:forEach>
</div>
<br/><br/>

<p style="font-size:1.25em;">상급자를 위한 코스</p>
<p style="font-size:0.9em;">어느정도 실력을 섭렵하셨다면,이제 더 심화된 강의로 실력을 키워보세요!.</p>
<div class="card-columns" style="column-count:4;">
	<c:forEach items="${dto}" var="dto">
		<c:if test="${dto.clevel eq 'senior'}">
		<a href="CourseDetail?num=${dto.classnum}">
			<div class="card">
				<div class="card-header" style="background-image: url('/Tutoring/img/${dto.uploadFile}');">
				</div>
				<div class="card-body">
					<div class="card-body-header" >
						<h5>${dto.classname}</h5>
						<p class = "card-body-nickname" style="font-size:0.9em;">${dto.topic}</p>
					</div>
				</div>
			</div>
		</a>
		</c:if>
	</c:forEach>
</div>
<br/><br/>

<%-- <p style="font-size:1.25em;">시험 준비</p>
<p style="font-size:0.9em;">최신 시험 기출 문제를 연습해 다가오는 영어 말하기 시험에 대비하세요.</p>
<div class="card-columns" style="column-count:4;">
	<c:forEach items="${dto}" var="dto">
		<c:if test="${dto.clevel eq 'test'}">
		<a href="CourseDetail?num=${dto.classnum}">
			<div class="card">
				<div class="card-header" style="background-image: url('/Tutoring/img/${dto.uploadFile}');">
				</div>
				<div class="card-body">
					<div class="card-body-header" >
						<h5>${dto.classname}</h5>
						<p class = "card-body-nickname" style="font-size:0.9em;">${dto.topic}</p>
					</div>
				</div>
			</div>
		</a>
		</c:if>
	</c:forEach>
</div>
<br/><br/>
 --%>
</div>
</body>
</html>
<%@ include file="/include/footer.jsp" %>