const words = [
    { word: "cat", picture: "🐱" },
    { word: "dog", picture: "🐶" },
    { word: "sun", picture: "☀️" },
    { word: "bat", picture: "🦇" },
    { word: "pen", picture: "🖊️" }
];

let currentIndex = 0;

const wordElement = document.getElementById("cvc-word");
const pictureElement = document.getElementById("picture");
const nextButton = document.getElementById("next-word");
const showPictureButton = document.getElementById("show-picture");

showPictureButton.addEventListener("click", function() {
    pictureElement.textContent = words[currentIndex].picture;
});

nextButton.addEventListener("click", function() {
    currentIndex = (currentIndex + 1) % words.length;
    wordElement.textContent = words[currentIndex].word;
    pictureElement.textContent = "";
});
