<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
    <section class="s-content s-content--top-padding s-content--narrow">

        <article class="row entry format-standard">
			<!-- 작성 정보 시작 -->
            <div class="entry__header col-full">
            <img src="${board.userProfile}" width=45px; height=45px; style="border-radius:50%;" /> <br/>
                <h1 class="entry__header-title display-1">
                    ${board.title}
                </h1>
                <ul class="entry__header-meta">
                    <li class="date">${board.createDate}</li>
                    <li class="byline">
                        By <a href="#0">${board.username}</a>
                    </li>
                </ul>
            </div>
            <!-- 작성 정보 끝 -->
            <div style="text-align:center;">
				<a class="buttonstyle" style="margin-right:10px;" href="/blog/updateForm/${board.id}">Update</a>
				<a class="buttonstyle" href="/blog/delete/${board.id}">Delete</a>
			</div>
			<!-- 본문 스타일 -->
			<section class="s-content s-content--top-padding s-content--narrow">
			<div>${board.content}</div>
			</section>
        </article>

    </section>
    <%@include file="include/footer.jsp"%>