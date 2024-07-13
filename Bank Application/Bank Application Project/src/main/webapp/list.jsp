<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>List of Employees</h3>

<c:if test="${requestScope.message !=null}">
	NOTE : ${message}
</c:if>

<c:if test="${requestScope.empList !=null and
 not empty requestScope.empList}">
 <table border="1" cellpadding="3">
	<tr>
		<td>Reg No</td>
		<td>Customer Name</td>
		<td>User Name</td>
		<td>Password</td>
		<td>Account Balance</td>
		<td>&nbsp;</td>
	</tr>
	
<c:forEach items="${requestScope.empList}" var="e"> 
  <tr>
 	<td>${e.regNo}</td>
 	<td>${e.custName}</td>
 	<td>${e.userName}</td>
 	<td>${e.password}</td>
 	<td>${e.accBalance}</td>
</tr>
	</c:forEach>
</table>
</c:if>

</body>
</html>