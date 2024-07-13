<%@ page import="Bank.Model.Register" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Registered Users</title>
</head>
<body>
    <%
        List<Register> lst = (List<Register>) session.getAttribute("data");

        if (lst != null && !lst.isEmpty()) {
            for (Register reg : lst) {
    %>
                <p>
                    Register Number: <%= reg.getRegNo() %><br>
                    Customer Name: <%= reg.getCustName() %><br>
                    Account Balance: <%= reg.getAccBalance() %><br>
                    User Name: <%= reg.getUserName() %>
                </p>
    <%
            }
        } 
    
        
        // No need to manually invalidate the session here.
    %>
    <a href="DisplayAllController"></a>
</body>
</html>
