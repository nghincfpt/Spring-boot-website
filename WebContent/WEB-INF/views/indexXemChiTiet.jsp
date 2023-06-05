<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<style type="text/css">
<%@include file="/css/bootstrap.min.css"%>
</style>

<html>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
 <link
 	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
 	rel="stylesheet"> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container" style="padding-top: 10px">

		<div class="shadow-lg p-3 mb-5 bg-body rounded">
			<div align="center">
				<h2 style="color: blue">Don Hang</h2>
				
			
				<div style="display: flex; justify-content: space-between">
					<div>
						<a href=""><i
						class=" btn btn-success fas fa-calendar-plus fa-lg"></i> </a>
					</div>
					
					<div>
						<a href="xemchitiet"><i
						class=" btn btn-success fas fa-calendar-plus fa-lg"> xem chi tiet</i> </a>
					</div>
					<div>
						<form class="form-inline my-2 my-lg-0" method="get"
							action="searchInName" >
							<input class="form-control mr-sm-2" type="search"
								placeholder="Search"  name="keyword">							
							<button class="btn btn-outline-success my-2 my-sm-0"
								type="submit">Search</button>
						</form>
					</div>
				</div>
	

				
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">Ten sp </th>
							<th scope="col"><a href="?field=hoTenChuHo">So Tien </a></th>
							<th scope="col"> Ghi chu</th>
												
							<th scope="col">Action</th>
						</tr> 
					</thead>
					<tbody>
						<c:forEach items="${listxemchitiet}" var="o">
							<tr>
								<td>${o.tenSP}</td>
								<td>${o.soTien}</td>
								<td>${o.ghiChu}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>

 <script>
	function showMess(maDH) {
 		var option = confirm('are you sure to delete');
		if(option ===true){
 			window.location.href='deletematt?maDH='+maDH;
 		}
 	}
 	</script> 
 </html> 