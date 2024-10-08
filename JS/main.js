let randomNumber = Math.floor(Math.random() * 100) + 1;
let guessCount = 0;

document.getElementById('submitGuess').addEventListener('click', function() {
    console.log("Submit button clicked."); // Add this line to see if the click event is firing
    let userGuess = parseInt(document.getElementById('guess').value);
    guessCount++;

    if (userGuess === randomNumber) {
        document.getElementById('resultMessage').textContent = `Congratulations! You guessed the number in ${guessCount} attempts.`;
        document.getElementById('guessCount').textContent = '';
    } else if (userGuess > randomNumber) {
        document.getElementById('resultMessage').textContent = 'Too high! Try again.';
        document.getElementById('guessCount').textContent = `Guess count: ${guessCount}`;
    } else {
        document.getElementById('resultMessage').textContent = 'Too low! Try again.';
        document.getElementById('guessCount').textContent = `Guess count: ${guessCount}`;
    }
});

// JavaScript to handle the color inversion
document.getElementById('invertButton').addEventListener('click', function() {
    document.body.classList.toggle('invert-colors');
});