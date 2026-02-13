<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
<h1>Registration Page</h1>
<form action="<%=request.getContextPath()%>/RegisterServlet"
			method="post">

<!--
 
@Pratik Patel
@Tuesday, February 17, 2026
 
Description - Here is the form, where the User will enter all information, such as 
			  the User ID, Password, etc. This code redirects to another page after correct inputs.
			  The code uses form validation to make sure correct information is being
			  added and to stop SQL injection into the data. 


-->

	
	<table style="width: 40%; border-collapse: collapse;">
	
		<!-- Required to enter User ID with 5 to 12 characters -->
		<tr style="margin-top: 20px;">
			<td>User ID:</td>
			<td><input type="text" name="user_id" pattern=".{5,12}" required /></td>
			
		</tr>
		
			
		<!-- Required to enter password with 7 to 12 characters -->
		<tr>
			<td>Password:</td>
				<td><input type="password" name="password" pattern=".{7,12}" required /></td>
		</tr>
		
		
		<!-- Required to reenter the password -->
		<tr style="margin-top: 30px;">
			<td>ReType Password:</td>
				<td><input type="password" name="retype_password" pattern=".{7,12}" required /></td>
		</tr>	
		
		
		<!-- Required to enter a mobile number in ###-###-#### format -->
		<tr>
    			<td>Mobile Number:</td>
    			<td><input type="tel" name="mobile" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" placeholder="123-456-7890" required /></td>
		</tr>
	
		
		<!-- Required to enter a email in standard email format -->
		<tr>
			<td>Email:</td>
			<td><input type="email" name="email" required /></td>
					
		</tr>
		
		<tr>
			<td></td>
			<td><img src="captcha.png" alt="Captcha" width="200" height="150"></td>
		</tr>
		
		<tr>
    			<td>Enter Captcha Image:</td>
   
    			<td>
    				<input type="text" name="captcha" placeholder="Enter code above" required/>
    			</td>
		</tr>
		
			
			
			
	</table>
	
	
	<input type="submit" value="Submit"/>





</form>




</body>
</html>


















