<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
    body {
        background-color: rgb(212, 212, 212); /* grey color */
        font-family: Arial, sans-serif;
    }

    .container {
        max-width: 600px;
        margin: 0 auto;
        margin-top: 150px; /* Adjusted to center the box vertically */
        text-align: center; /* Center the contents within the container */
    }

    .form-group {
        margin-bottom: 25px;
    }
    
    label {
		font-weight: bold;
		
	}

    .my-box {
        box-shadow: 5px 5px 5px hsl(0, 2%, 64%);
        padding: 20px; /* Reduced padding for a cleaner look */
        background-color: rgb(255, 255, 255);
        border-radius: 5px; /* Added border-radius for rounded corners */
        text-align: left; /* Align form content to the left */
    }

    .my-box table {
        width: 100%; /* Make the table width 100% */
    }

    .my-box td {
        padding: 10px; /* Added padding to table cells for spacing */
    }

    .my-box input[type="text"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    .my-box .btn {
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    .my-box .btn-primary {
        background-color: #3498db;
        color: #fff;
    }

    .my-box .btn-primary:hover {
        background-color: #2376b4;
    }

    .my-box a {
        text-decoration: none;
        color: #3498db;
    }

    .my-box a:hover {
        text-decoration: underline;
    }

    /* Added CSS to style the form layout */
    .form-table td {
        padding: 10px 0; /* Adjusted padding for table cells */
    }
</style>
</head>
<body>

<div class="container">
    <div class="my-box">
        <form action="LoginController">
            <table class="form-table">
                <tr>
                    <td>
                        <label for="regNo">REGISTER NUMBER</label>
                        <input type="text" name="regNo">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="password">PASSWORD</label>
                        <input type="text" name="password">
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" class="btn btn-primary" value="Login">
                        
                    </td>
                </tr>
            </table>
        </form>
        <%!String str=null; %>
	<%
		if(!session.isNew())
		{
			str=(String)session.getAttribute("msg");
			out.print(str);
			session.invalidate();
		}
	%>
    </div>
</div>

</body>
</html>
