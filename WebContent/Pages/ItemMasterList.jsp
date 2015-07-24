<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div align="center">
            <h1>User List</h1>
            <table border="1">
            <tr>
                <th>S.No.</th>
                <th>User Name</th>
                <th>Designation</th>
                <th>Company</th>
                <th>City</th>
                <th>Pin Code</th>
                 <th>Created On</th>
              </tr>  
                 
                <c:forEach var="item" items="${itemList}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${item.user_id}</td>
                    <td>${item.user_name}</td>
                    <td>${item.designation}</td>
                    <td>${item.city}</td>
                     <td>${item.pin_code}</td>
                    <td>${item.createdOn}</td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>