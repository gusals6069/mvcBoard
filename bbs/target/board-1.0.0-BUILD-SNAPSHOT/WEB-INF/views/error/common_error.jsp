<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<%@ include file = "../include/head.jsp" %>
	<body class="hold-transition skin-blue sidebar-mini">
		<div class="wrapper">
			<%@ include file = "../include/main_header.jsp" %>
			<%@ include file = "../include/menu.jsp" %>
			
			<div class="content-wrapper">
				<section class="content container-fluid">
					<h3><i class="fa fa-warning text-red"></i> ${exception.getMessage()}</h3>
				    <ul>
				        <c:forEach items="${exception.getStackTrace()}" var="stack">
				            <li>${stack.toString()}</li>
				        </c:forEach>
				    </ul>
				</section>
			</div>
			
			<%@ include file = "../include/main_footer.jsp" %>
		</div>
	</body>
</html>