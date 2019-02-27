<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Sample BBS</title>
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

  <script src="${path}/resources/bootstrap/bower_components/jquery/dist/jquery.min.js"></script>
  <script src="${path}/resources/bootstrap/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
  <script src="${path}/resources/bootstrap/dist/js/adminlte.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.0.11/handlebars.min.js"></script>

  <link rel="stylesheet" href="${path}/resources/bootstrap/bower_components/bootstrap/dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="${path}/resources/bootstrap/bower_components/font-awesome/css/font-awesome.min.css">
  <link rel="stylesheet" href="${path}/resources/bootstrap/bower_components/Ionicons/css/ionicons.min.css">
  <link rel="stylesheet" href="${path}/resources/bootstrap/dist/css/AdminLTE.min.css">
  <link rel="stylesheet" href="${path}/resources/bootstrap/dist/css/skins/skin-blue.min.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>