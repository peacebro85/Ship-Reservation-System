<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Ship List</h1>  

<style>  
table, th, td {  
    border: 1px solid black;  
    border-collapse: collapse;  
}  
th, td {  
    padding: 10px;  
}  
table#alter tr:nth-child(even) {  
    background-color: #eee;  
}  
table#alter tr:nth-child(odd) {  
    background-color: #fff;  
}  
table#alter th {  
    color: white;  
    background-color: gray;  
}  
body {
	background-image:
		url('https://www.marineinsight.com/wp-content/uploads/2019/08/Cruise-ships-1.png');
	height: 100%;
	background-repeat: no-repeat;
	background-size: 1366px 625px;
}
</style>  
<table border="1"  id="alter" width="100%" cellpadding="2">
  
<tr><th>ShipId</th><th>ShipName</th><th>SeatingCapacity</th><th>ReservationCapacity</th><th>Edit</th><th>Delete</th></tr>  
    <c:forEach var="ship" items="${list}">   
   <tr>  
   <td>${ship.shipId }</td>  
   <td>${ship.shipName }</td>  
   <td>${ship.seatingCapacity }</td>  
   <td>${ship.reservationCapacity }</td>  
   <td><a href="editShip/${ship.shipId }">Edit</a></td>  
   <td><a href="deleteShip/${ship.shipId }">Delete</a></td>  
   </tr>  
   </c:forEach> 
   </table>  
   <br/>  
   <a href="Shipform" style="color:cyan;"><b>Add Ship Details</b></a><br><br>
   <a href="Admin.jsp" style="color:cyan;"><b>Admin Page</b></a>
   