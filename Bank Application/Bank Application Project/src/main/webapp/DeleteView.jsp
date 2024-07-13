<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    /* Define your CSS styles here */
    body {
        background-color: rgb(212, 212, 212); /* Grey color */
        font-family: Arial, sans-serif;
    }

    .container {
        max-width: 600px;
        margin: 0 auto;
        margin-top: 200px; /* Adjusted to center the box vertically */
        text-align: center; /* Center the contents within the container */
        padding:20px;
    }

    .form-box {
        box-shadow: 5px 5px 5px hsl(0, 2%, 64%);
        padding: 20px;
        background-color: rgb(255, 255, 255);
        border-radius: 5px;
        text-align: left;
        margin-top: 20px;
    }

    input[type="text"] {
        width: 90%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        
        
    }

    input[type="submit"] {
        background-color:  #3498db;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    p {
        margin: 10px 0;
    }

    p.success {
        color: green;
    }

    p.error {
        color: red;
    }
</style>
</head>
<body>
<div class="container">
    <div class="form-box">
        <form action="DeleteController">
            <input type="text" name="regno" placeholder="Register Number">
            <input type="submit" value="Delete">
        </form>
    </div>
    
    <%
        String message = (String) session.getAttribute("message");
        String error = (String) session.getAttribute("error");
        
        if (message != null) {
    %>
            <p class="success"><%= message %></p>
    <%
        }
        if (error != null) {
    %>
            <p class="error"><%= error %></p>
    <%
        }
        
        // Clear the session attributes after displaying the message
        session.removeAttribute("message");
        session.removeAttribute("error");
    %>
</div>
</body>
</html>
