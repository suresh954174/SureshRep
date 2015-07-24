<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"    "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add User</title>
 <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
 <script type="text/javascript" src="./js/script.js"></script>
 <link rel="stylesheet" type="text/css" href="./css/demo.css" />
   
 <script  type ="text/javascript">
 
 $( document ).ready(function() {
	    
	    $( "#submit" ).click(function() {
	    	validateAndSubmit();
	    });
	});

</script>
    </head>
   
    <body>
    
    <form:form id = "userId" name="userForm" method="post" modelAttribute="item">
    <input name="userId" type="hidden" value="userId">
        <div align="center">
            <h1>OUA User Registration</h1>
            <table border="1">
           
                <%-- <tr>
                       <th>User Name</th>   <td> <input name="user_name" value="${item.user_name}"></td>
                             
                </tr> --%>
                
                 <tr>
  			 	 <td><label for="userName">User Name:</label></td>
  				  <td><div class="input-container"><input name="userName" id="userName" type="text" /></div><div id="errormsg">&nbsp;</div></td>
  				</tr>
  				<tr>
  			 	 <td><label for="designation">Designation:</label></td>
  				  <td><div class="input-container"><input name="designation" id="designation" type="text" /></div><div id="errormsg">&nbsp;</div></td>
  				</tr>
  				<tr>
  			 	 <td><label for="company">Company:</label></td>
  				  <td><div class="input-container"><input name="company" id="company" type="text" /></div><div id="errormsg">&nbsp;</div></td>
  				</tr>
  					<tr>
  			 	 <td><label for="city">City:</label></td>
  				  <td><div class="input-container"><input name="city" id="city" type="text" /></div><div id="errormsg">&nbsp;</div></td>
  				</tr>
  					<tr>
  			 	 <td><label for="pincode">Pin Code:</label></td>
  				  <td><div class="input-container"><input name="pincode" id="pincode" type="text" /></div><div id="errormsg">&nbsp;</div></td>
  				</tr>
                <tr>
                       <th> <input id="submit" type="submit" value="Add New User">   </th>  
                       <th>   <input type="button" value="Update"  onclick="./script/update()"/> 
                       <input type="button" value="List"  onclick="./script/list()"/></th> 
                             
                </tr>
            </table>
        </div>

        </form:form>
        
         <div align="center">
            <h1>User List</h1>
            <table border="1">
            <tr>
                <th>User id</th>
                <th>User Name</th>
                <th>Designation</th>
                <th>Company</th>
                <th>City</th>
                <th>Pin Code</th>
                <th>Created On</th>
                <th>Action</th>
                <th>Action</th>
             </tr>
                <c:forEach var="item" items="${itemList}" varStatus="status">
                <tr>
                <td>${item.userId}</td>
                    <td>${item.userName}</td>
                    <td>${item.designation}</td>
                    <td>${item.company}</td>
                    <td>${item.city}</td>
                    <td>${item.pincode}</td>
                    <td>${item.createdOn}</td>
                    <td><a href="edit.do?id=${item.userId}">Edit</a></td>  
    				<td><a href="delete.do?id=${item.userId}">Delete</a></td>  
                             
                </tr>
                </c:forEach>             
            </table>
        </div>             
<!--         <div id="errormsg">
	&nbsp;
</div> -->
    </body>
</html>