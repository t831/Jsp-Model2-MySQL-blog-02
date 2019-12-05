<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<section class="s-featured">
	<div class="row">
		<div class="col-full">
			<div class="featured-slider featured" data-aos="zoom-in">
				<!-- 슬라이드 시작 -->
				<c:forEach var="board" items="${boards}">
				<div class="featured__slide">
					<div class="entry">
						<div class="entry__background" style="background-image: url('/resources/images/background.jpg');"></div>
						<div class="entry__content">
							<span class="entry__category"><a><img src="${board.userProfile}" width=40px; height=40px; style="border-radius:50%;" /></a></span><br/>
							<span class="entry__category"><a>${board.username}</a></span>
							<h1>
								<a href="/blog/detail/${board.id}">${board.title}</a>
							</h1>
							<span class="entry__category" style="margin-bottom:2px;"><a>UserId : ${board.userId}</a></span><br/>
							<span class="entry__category"><a>${board.createDate}</a></span>
						</div>
					</div>
				</div>
				</c:forEach>
				<!-- 슬라이드 끝 -->
			</div>
		</div>
	</div>
</section>
<%@include file="include/footer.jsp"%>