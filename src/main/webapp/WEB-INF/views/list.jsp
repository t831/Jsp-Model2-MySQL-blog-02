<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<section class="s-content s-content--top-padding">

        <div class="row narrow">
            <div class="col-full s-content__header" data-aos="fade-up">
                <h1 class="display-1 display-1--with-line-sep">Post List</h1>
            </div>
        </div>
        
        <div class="row entries-wrap add-top-padding wide">
            <div class="entries">
				<!-- 게시글 박스 시작 -->
				<c:forEach var="board" items="${boards}">
                <article class="col-block">
                    <div class="item-entry" data-aos="zoom-in">
                        <div class="item-entry__text" style="background-image: url('/resources/images/background.jpg');">
                            <div class="item-entry__cat">
                                <a>${board.userId}</a>
                            </div>
                            <h1 class="item-entry__title" style="overflow:hidden; text-overflow:ellpsis; white-space:nowrap; "><a href="/blog/detail/${board.id}">${board.title}</a></h1>
                            <div class="item-entry__date">
                                <a>${board.createDate}</a>
                            </div>
                        </div>
                    </div>
                </article>
                </c:forEach>
                <!-- 게시글 박스 끝 -->                        
            </div>
        </div>
    </section>
    <%@include file="include/footer.jsp"%>