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
						<a href="add"><i
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
							<th scope="col"> <a href="?field=matt">Ma Don Hang </a></th>
							<th scope="col">Ma khach hang</th>
							<th scope="col">Ten khach hang</th>
							<th scope="col">Gioi Tinh</th>
							<th scope="col">SDT</th>
							<th scope="col"> ngay dat may </th>
							<th scope="col">trang thai thanh toan </th>
							<th scope="col"><a href="?field=hoTenChuHo">ngay hen tra </a></th>
							<th scope="col"> trang thai don hang</th>
							<th scope="col"> ngay tra</th>							
							<th scope="col">Action</th>
						</tr> 
					</thead>
					<tbody>
						<c:forEach items="${lists}" var="o">
							<tr>
								<th scope="row">${o.maDH}</th>
								<td>${o.khachHang.maKH}</td>
							    <td>${o.khachHang.tenKH}</td>
							    <td>${o.khachHang.gioTinh}</td>
							    <td>${o.khachHang.sdt}</td>
								<td>${o.ngayDatMay}</td>
								<td>${o.ngayHenTra}</td>
								<td>${o.trangThaiThanhToan}</td>
								<td>${o.trangThaiDonHang}</td>
								<td>${o.ngayTra}</td>
								
								
								<td>  <a href="xemchitiet"> xem chi tiet</a></td>
								
								
								<td><a href="editphichungcu?id=${o.maDH}"><i
										class=" btn btn-primary fas fa-edit"></i></a> &nbsp;&nbsp;&nbsp; <a
									href="#" onclick="showMess('${o.maDH}')"><i
										class="btn btn-danger fas fa-trash"></i></a></td>
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