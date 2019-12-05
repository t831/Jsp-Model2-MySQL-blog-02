<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote-lite.css" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote-lite.js"></script>
<body>
	<section class="s-content s-content--top-padding s-content--narrow">
		<article class="row entry format-standard">
		<!-- 타이틀 시작 -->
		 <div class="row narrow">
            <div class="col-full s-content__header" data-aos="fade-up">
                <h1 class="display-1 display-1--with-line-sep">Join</h1>
            </div>
        </div>
		<!--  타이틀 끝 -->
		<div style="text-align:center; margin-top:50px;">
		<form action="/blog/user/join" method="POST">
			<label style="display:inline;">ID&emsp;<input style="display:inline; padding-bottom:2px;" type="text" name="username" placeholder="ID" /></label>&emsp;
			<label style="display:inline;">Password&emsp;<input style="display:inline; padding-bottom:2px;" type="password" name="password" placeholder="Password" /></label>&emsp;
			<label style="display:inline;">E-mail&emsp;<input style="display:inline; padding-bottom:2px;" type="email" name ="email" placeholder="email" /></label>&emsp;
			<input style="display:inline; margin:3px; padding:3 10px;" type="submit" value="JOIN" />
		</form>
		</div>
		</article>
	</section>
	<%@include file="include/footer.jsp"%>