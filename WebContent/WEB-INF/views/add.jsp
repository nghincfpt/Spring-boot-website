<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 

  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  
 <!DOCTYPE html> 
 <style type="text/css">
 <%@include file="/css/bootstrap.min.css"%>
 </style>   
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div  class="container" style="padding-top: 20px">
<nav>
<div class="shadow-lg p-3 mb-5 bg-body rounded" >
<h3> ADD  Don Hang</h3>
<form:form action="saveDonHang" method="post" modelAttribute="boot">

  
   <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Ma don Hang</label>
    <div class="col-5">
      <form:input type="text" class="form-control" id="colFormLabel" placeholder="maDH" path="maDH"/>
        <form:errors path="maDH" cssClass="text-danger"></form:errors>
    </div> 
  </div>
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Ma khach hang</label>
    
    
     <form:select type="text" class="form-control"  path="khachHang.maKH">
      <form:options items="${listMakh}" itemLabel="maKH" itemValue="maKH"></form:options>
      </form:select>
   
    
 
  </div>
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Ma chi tiet don hang</label>
    <div class="col-5">
      <form:input type="text" class="form-control" id="colFormLabel" placeholder="maCTDH" path="maCTDH"/>
     <form:errors path="maCTDH" cssClass="text-danger"></form:errors>
    </div>
  </div>
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">ngay dat may</label>
    <div class="col-5">
      <form:input type="date" class="form-control" id="colFormLabel" placeholder="ngayDatMay" path="ngayDatMay"/>
     <form:errors path="ngayDatMay" cssClass="text-danger"></form:errors>
    </div>
  </div>
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">trangThaiThanhToan</label>
    <div class="col-5">
      <form:input type="text" class="form-control" id="colFormLabel" placeholder="trangThaiThanhToan " path="trangThaiThanhToan"/>
     <form:errors path="trangThaiThanhToan" cssClass="text-danger"></form:errors>
    </div>
  </div>
  
    <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">ngayHenTra</label>
    <div class="col-5">
      <form:input type="date" class="form-control" id="colFormLabel" placeholder=" ngayHenTra" path="ngayHenTra"/>
     <form:errors path="ngayHenTra" cssClass="text-danger"></form:errors>
    </div>
  </div>
  
      <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Ten sp</label>
    <div class="col-5">
      <form:input type="text" class="form-control" id="colFormLabel" placeholder=" TEN SP" path="tenSP"/>
     <form:errors path="tenSP" cssClass="text-danger"></form:errors>
    </div>
  </div>
  
      <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">so Tien</label>
    <div class="col-5">
      <form:input type="text" class="form-control" id="colFormLabel" placeholder=" so tien" path="soTien"/>
     <form:errors path="soTien" cssClass="text-danger"></form:errors>
    </div>
  </div>
        <div class="form-group row" style="justify-content: center;">
    <label for="colFormLabel" class="col-sm-2 col-form-label">ghi chu</label>
    <div class="col-5">
      <form:input type="text" class="form-control" id="colFormLabel" placeholder=" ghiChu" path="ghiChu"/>
     <form:errors path="ghiChu" cssClass="text-danger"></form:errors>
    </div>
  </div>
    <div class="d-flex justify-content-center">
     <button type="submit" class="btn btn-outline-success"  >Submit</button>
    </div>
</form:form>
</div>
</nav>
</div>
</body>
</html>