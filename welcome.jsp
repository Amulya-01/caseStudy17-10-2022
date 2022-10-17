<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">

<form action="/recharge" method="post" methodAttribute="offerRecord">
<h3> 
Enter Mobile Number:<input type="text" name="mobileNumber"/>


<h1 style="color:red">
<u><i>Select Plan From Below</i></u>
</h1>
<h2>
<table border="2"  bgcolor="yellow">
  <tr>
    <th>PLAN ID</th>
    <th>DAYS</th>
    <th>TALKTIME</th>
    <th>DATA</th>
    <th>PRICE</th>
    <th>SELECT</th>
    
    </tr>
    <c:forEach  items="${offerList}" var="offer">
      <tr>
      <td>${offer.id}</td>
      <td>${offer.days}</td>
      <td>${offer.talkTime}</td>
      <td>${offer.data}</td>
      <td>${offer.price}</td></h3>
     <td><input type="radio" name="offerId" value="${offer.id}"/>
      </tr>
     </c:forEach>
  </table>
  <br/><br/>
 <button type="submit">Submit</button>
  </h2>

</div>
</body>
</html>