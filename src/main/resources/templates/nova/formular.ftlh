[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>List of business cards: append new business card</title>
    <link rel="stylesheet" href="/style.css"/>
</head>
<body>
<div class="container">
    <form action="/nova" method="post">
        <h1>Fill in information for a new business card</h1>

        <label for="name" class="radek">Name:</label>
        [@spring.formInput path="form.name" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="company" class="radek">Company:</label>
        [@spring.formInput path="form.company" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="street" class="radek">Street:</label>
        [@spring.formInput path="form.street" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="cityZipCode" class="radek">City, ZIP:</label>
        [@spring.formInput path="form.cityZipCode" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="email" class="radek">E-mail:</label>
        [@spring.formInput path="form.email" fieldType="email" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="telephone" class="radek">Telephone:</label>
        [@spring.formInput path="form.telephone" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="webAddress" class="radek">Web:</label>
        [@spring.formInput path="form.webAddress" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <div class="radek controls">
            <button type="submit">Add</button>
        </div>
    </form>
</div>
</body>
</html>
