<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>用户注册</title>
</head>
<body>
<center>
  <h1>用户注册表单</h1>
  <form action="register" method="post">
    用户名：<input type="text" name="username" required><br><br>
    密码：<input type="password" name="password" required><br><br>
    邮箱：<input type="email" name="email" required><br><br>
    性别：
    <input type="radio" name="gender" value="男" checked>男
    <input type="radio" name="gender" value="女">女<br><br>
    出生日期：<input type="date" name="birthdate" required><br><br>
    爱好（多选）：
    <input type="checkbox" name="hobby" value="读书">读书
    <input type="checkbox" name="hobby" value="运动">运动
    <input type="checkbox" name="hobby" value="编程">编程<br><br>
    <input type="submit" value="注册">
    <input type="reset" value="重置">
  </form>
</center>
</body>
</html>