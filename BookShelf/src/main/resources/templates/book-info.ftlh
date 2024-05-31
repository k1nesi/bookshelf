
<!DOCTYPE html>
<html>
<head>
    <title>BOOKSHELF</title>
</head>
<body>
<h1>BOOKSHELF</h1>
<h4>Подробная информация о книге</h4>
<b>Название книги:</b>${book.nameBook}<br>
<b>Автор:</b>${book.author}<br>
<b>Год выпуска:</b>${book.year_of_release}<br>
<b>Описание книги:</b>${book.description}<br>
<b>Имя пользователя:</b>${book.user}<br>
<hr>

<form action="/book/delete/${book.id}" method="post">

    <input type="submit" value="Удалить книгу"/>
</form>
</body>
</html>