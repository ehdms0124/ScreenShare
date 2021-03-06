<!doctype html>
<html lang="ko">

<head>
<!-- Required meta tags -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Concept - Bootstrap 4 Admin Dashboard Template</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet"
          href="../assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="../assets/vendor/fonts/circular-std/style.css"
          rel="stylesheet">
    <link rel="stylesheet" href="../assets/libs/css/style.css">
    <link rel="stylesheet"
          href="../assets/vendor/fonts/fontawesome/css/fontawesome-all.css">

</head>

<body oncontextmenu="return false" onselectstart="return false" ondragstart="return false">
<!-- ============================================================== -->
<!-- main wrapper -->
<!-- ============================================================== -->
<div class="dashboard-main-wrapper">
    <!-- ============================================================== -->
    <!-- navbar -->
    <!-- ============================================================== -->
    <div id="header"></div>
	<!-- ============================================================== -->
	<!-- end navbar -->
	<!-- ============================================================== -->
	<!-- ============================================================== -->
	<!-- left sidebar -->
	<!-- ============================================================== -->
		<div id="menu"></div>
    <!-- ============================================================== -->
    <!-- end left sidebar -->
    <!-- ============================================================== -->
    <!-- ============================================================== -->
    <!-- wrapper  -->
    <!-- ============================================================== -->
    <div class="dashboard-wrapper">
        <div class="container-fluid  dashboard-content">
            <!-- ============================================================== -->
            <!-- pageheader -->
            <!-- ============================================================== -->
            <div class="row">
                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="page-header">
                        <div class="alert alert-primary" role="alert">
                            <h2 class="pageheader-title"><b><c:if test="${empty classNm}">${boardNm}</c:if>${classNm}</b></h2>
                        </div>

                    </div>
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- end pageheader -->
            <!-- ============================================================== -->

            <div class="row">
                <!-- ============================================================== -->
                <!-- end bordered table -->
                <!-- ============================================================== -->
                <!-- ============================================================== -->
                <!-- hoverable table -->
                <!-- ============================================================== -->
                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                    <div class="card">
                            <h5 class="card-header"><b>${boardNm}</b>
                                <c:if test="${C == true}">
                                    <a class="btn btn-primary" href="/write/${boardNo}" style="float:right">글쓰기</a>
                                </c:if></h5>
                        <div class="card-body">
                            <table class="table table-hover">
                                <colgroup>
                                    <col width="10%"/>
                                    <col width="*"/>
                                    <col width="10%"/>
                                    <col width="10%"/>
                                    <col width="10%"/>
                                </colgroup>
                                <thead>
                                <tr>
                                    <th scope="col">번호</th>
                                    <th scope="col">제목</th>
                                    <th scope="col">작성자</th>
                                    <th scope="col">작성일</th>
                                    <th scope="col">조회수</th>
                                </tr>
                                </thead>
                                <tbody>
<%--                                <c:if test="#{element.img == true}"> <i class="fas fa-image"></i> </c:if>--%>
                                <c:set var="l" value="${fn:length(list)}" />
                                <c:forEach var="element" items="${list}" varStatus="var" >
                                <tr onclick="location.href='/detail/${element.postNo}'" style="cursor:pointer;">
                                    <th scope="col"><font size="1"> ${l - var.index}</font></th>
                                    <th scope="col">${element.postTitle}  &nbsp; &nbsp; &nbsp;<c:if test="${element.img == true}"><span class="badge badge-pill badge-success "><i class="fas fa-image"></i></span>  </c:if>
                                        <c:if test="${element.file == true}"><span class="badge badge-pill badge-primary ">첨부파일</span> </c:if><c:if test="${element.commentCount >0}"><span class="badge badge-success">${element.commentCount}</span></c:if></th>
                                    <th scope="col" >${element.fk_postNick}</th>
                                    <th scope="col"><font size="1" > ${element.postDate} </font></th>
                                    <th scope="col"><font size="1">${element.hits}</font></th>
                                </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <!-- ============================================================== -->
                <!-- end hoverable table -->
                <!-- ============================================================== -->
            </div>
        </div>
        <!-- ============================================================== -->
        <!-- footer -->
        <!-- ============================================================== -->
        <div class="footer">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12">
                        Copyright © 2018 Concept. All rights reserved. Dashboard by <a
                            href="https://colorlib.com/wp/">Colorlib</a>.
                    </div>
                    <div class="col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12">
                        <div class="text-md-right footer-links d-none d-sm-block">
                            <a href="javascript: void(0);">About</a> <a
                                href="javascript: void(0);">Support</a> <a
                                href="javascript: void(0);">Contact Us</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- ============================================================== -->
        <!-- end footer -->
        <!-- ============================================================== -->
    </div>
</div>
<!-- ============================================================== -->
<!-- end main wrapper -->
<!-- ============================================================== -->
<!-- Optional JavaScript -->
<script src="../assets/vendor/jquery/jquery-3.3.1.min.js"></script>
<script src="../assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
<script src="../assets/vendor/slimscroll/jquery.slimscroll.js"></script>
<script src="../assets/vendor/custom-js/jquery.multi-select.html"></script>
<script src="../assets/libs/js/main-js.js"></script>
<script type="text/javascript">
	$(document).ready(function(){$("#header").load("/header");});
	</script>
	<script type="text/javascript">
	$(document).ready(function(){$("#menu").load("/menu");});
	</script>
</body>

</html>