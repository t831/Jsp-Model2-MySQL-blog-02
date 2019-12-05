<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>

   <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<link href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote-lite.css" rel="stylesheet">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote-lite.js"></script>
<body>
<c:if test="${empty sessionScope.user}">
   <script>
      alert('로그인 후 작성해주세요');
      location.href = "/blog/user/loginForm";
   </script>
</c:if>
   <section class="s-content s-content--top-padding s-content--narrow">
        <article class="row entry format-standard">
        <form action="/blog/write" method="POST">
        <input style="width:1000px;" type="text" name="title" placeholder="title">
        <textarea id="summernote" name="content"></textarea>
        <input style="float:right; margin-top:20px;" type="submit" value="작성하기">
        </form>
        </article>
    </section>
    <script>
      $('#summernote').summernote({
        placeholder: '내용을 작성해주세요',
        tabsize: 2,
        height: 450
      });
      $('.dropdown-toggle').dropdown()
    </script>
<%@include file="include/footer.jsp"%>