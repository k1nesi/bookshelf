<!DOCTYPE html>
<html>
<head>
    <title>BOOKSHELF</title>
</head>
<body>
<h1>BOOKSHELF</h1><hr>
<h4>Российские книги</h4>
<#list books as book>
    <div>
        <p><b>${book.author}</b>${book.nameBook}  |  <a href="/book/${book.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Добавить новую книгу</h3>
<form action="/book/create"method="post">
    Название книги:<input type="text" name="nameBook"/><br><br>
    Автор книги:<input type="text" name="author"/><br><br>
    Год выпуска:<input type="text" name="year_of_release"/><br><br>
    Описание книги:<input type="text" name="description"/><br><br>
    Имя пользователя:<input type="text" name="user"/><br><br>
    <input type="submit" value="Добавить книгу"/>
</form>
</body>
</html>