<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title> 
</head> 
<body> 
  <c:if test="${empty user}">
    <form action="register.jhtml" method="post">
  </c:if> 
  <c:if test="${not empty user}">
    <form action="updateUser.jhtml" method="post">
      <input type="hidden" value="${user.id}" name="id">
  </c:if> 
            <table> 
               <tr> 
                   <td>用户名：</td> 
                   <td><input type="text" name="username" value="${user.username}"></td>
               </tr> 
               <tr> 
                   <td>密码：</td> 
                   <td><input type="password" name="password" value="${user.password}"></td>
               </tr> 
               <tr> 
                  <td>邮件：</td> 
                  <td><input type="text" name="email" value="${user.email}"></td>
               </tr> 
               <tr> 
                   <td>电话：</td> 
                   <td><input type="text" name="phone" value="${user.phone}"></td>
               </tr> 
               <tr> 
                   <td colspan="2" align="center"><input type="submit" value="提交"></td>
               </tr> 
            </table> 
    </form> 
</body> 
</html>