<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html class="no-js" lang="en">
<head>
<meta charset="utf-8">
<title>Blog ::</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="/resources/css/base.css">
<link rel="stylesheet" href="/resources/css/vendor.css">
<link rel="stylesheet" href="/resources/css/main.css">
<script src="js/modernizr.js"></script>
</head>
<body id="top">
	<header class="s-header header">
		<div class="header__logo">
			<a class="logo" href="/blog/index"> <img
				src="/resources/images/logo.png" alt="Homepage">
			</a>
		</div>
		<!-- 네비게이션 시작 -->
		<nav class="header__nav-wrap">
			<h2 class="header__nav-heading h6">Navigate to</h2>
			<ul class="header__nav">
				<li class="current"><a href="/blog/index" title="">Home</a></li>
				<li><a href="/blog/list" title="">List </a></li>
				<li><a href="/blog/writeForm" title="">Write </a></li>
				<c:choose>
					<c:when test="${empty sessionScope.user}">
						<li><a href="/blog/user/joinForm">Join</a></li>
						<li><a href="/blog/user/loginForm">Login</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="/blog/user/updateForm/${sessionScope.user.id}">Profile</a></li>
						<li><a href="/blog/user/logout">Logout</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</nav>
		<!-- 네비게이션 끝 -->

	</header>