# davidwrow.github.io
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CVC Flashcard App</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>

    <div class="flashcard">
        <h1 id="cvc-word">cat</h1>
        <button id="show-picture">Show Picture</button>
        <button id="next-word">Next Word</button>
        <div id="picture"></div>
    </div>

    <script src="script.js"></script>
</body>
</html>
body {
    font-family: Arial, sans-serif;
    text-align: center;
    padding: 30px;
    background-color: #f0f0f0;
}

.flashcard {
    background-color: white;
    padding: 40px;
    border-radius: 10px;
    box-shadow: 2px 2px 10px rgba(0,0,0,0.1);
    display: inline-block;
}

button {
    margin: 10px;
    padding: 10px 20px;
    font-size: 16px;
}

#picture {
    margin-top: 20px;
}
