<%--
  Created by IntelliJ IDEA.
  User: zhouzhengyi
  Date: 2021/3/4
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
 <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="pahe-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>

        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bookID" value="${book.getBookID()}"/>
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text" name="bookName" class="form-control" id="bookName" value="${book.getBookID()}" required>
        </div>
        <div class="form-group">
            <label for="b2">书籍数量</label>
            <input type="text" name="bookCounts" class="form-control" id="b2" value="${book.getBookCounts()}" required>
        </div>
        <div class="form-group">
            <label for="b3" >书籍描述</label>
            <input type="text" name="detail" class="form-control" id="b3"  value="${book.getDetail()}" required>
        </div>
        <div class="form-group" >
            <input type="submit" class="form-control" style="background-color:blanchedalmond" value="修改">
        </div>

    </form>
</div>
</body>
</html>
