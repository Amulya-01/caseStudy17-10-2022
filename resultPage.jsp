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
<h1 style="color:red">
<u><i>Bill for Re-charge on mobile number ${offer.id} </i></u>
</h1>
<h2>

Transaction Id:${offer.transactionId}
<br/><br/>
Offer Id:${offer.id}
<br/><br/>
Valid for:${offer.days}
<br/><br/>
Talk Time Amount:${offer.talkTime}
<br/><br/>
Data Balance:${offer.data}
<br/><br/>
Amount Payable:${offer.price}
<br/><br/>

<a href="/index">Return</a>
 
  </h2>
  </div>
</body>
</html>