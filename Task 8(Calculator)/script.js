let display = document.getElementById('result');

function appendToDisplay(value) {
    display.classList.remove('error');
    display.value += value;
}

function clearDisplay() {
    display.value = '';
    display.classList.remove('error');
}

function deleteLast() {
    display.value = display.value.slice(0, -1);
}

function calculate() {
    try {
        display.value = eval(display.value);
        display.classList.remove('error'); 
    } catch (e) {
        display.value = 'ERROR'; 
        display.classList.add('error'); 
    }
}

document.addEventListener('keydown', function (event) {
    const key = event.key;

    if (!isNaN(key)) {
        appendToDisplay(key);
    } 
    else {
        switch (key) {
            case 'Enter':
                calculate();
                break;
            case 'Backspace':
                deleteLast();
                break;
            case 'Escape':
                clearDisplay();
                break;
            case '/':
            case '*':
            case '-':
            case '+':
            case '%':
                appendToDisplay(key);
                break;
            default:
                display.value = 'Error';
                display.classList.add('error');
                break;
        }
    }
});
