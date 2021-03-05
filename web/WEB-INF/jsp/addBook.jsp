<%--
  Created by IntelliJ IDEA.
  User: zhouzhengyi
  Date: 2021/3/3
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="pahe-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>

        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text" name="bookName" class="form-control" id="bookName" required>
        </div>
        <div class="form-group">
            <label for="b2">书籍数量</label>
            <input type="text" name="bookCounts" class="form-control" id="b2" required>
        </div>
        <div class="form-group">
            <label for="b3" >书籍描述</label>
            <input type="text" name="detail" class="form-control" id="b3"  required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" style="background-color:blanchedalmond"  value="添加">
        </div>

    </form>
</div>
</body>
</html>
