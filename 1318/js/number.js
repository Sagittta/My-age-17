var MinNum = "1";
var MaxNum = "100";
var NumberOfGuesses = 0;
var GuessedNum;
var response;
var GotIt;

function Random() {
    var ran = (parseInt(Math.random() * MaxNum + 1));
    return ran;
}

function GuessNum() {
    GuessedNum = parseInt(document.forms[0].guess.value);
    document.forms[0].guess.value = GuessedNum;

    if (GuessedNum < myGuessedNumber) response = "아마도 그것보다 높을걸요!";
    if (GuessedNum > myGuessedNumber) response = "아마도 그것보다 낮을걸요!";
    if ((!GuessedNum) || (GuessedNum < MinNum) || (GuessedNum > MaxNum)) {
        document.forms[0].guess.value = "";
        response = "Re-enter number";
        NumberOfGuesses--;
    }
    if (GuessedNum == myGuessedNumber) {
        response = "드디어 맞았어요!";
        document.write("<a href='breaktime.html'><img src='image/폭죽.gif' width=100%>" + "<font size=10 color=rainbow>축하합니다~!!</font></a>");
        if (GotIt != 1) NumberOfGuesses++;
        GotIt = 1;
    }
    else {
        GotIt = 0;
        NumberOfGuesses ++;
    }
    document.forms[1].result.value = response;
    document.forms[1].guesses.value = NumberOfGuesses;
    document.forms[0].guess.focus();
    document.forms[0].guess.select();
    return true;
}

// 새게임 시작할때 숫자가 무작위 선택 되어진다.
function NewGame() {
    document.forms[0].guess.focus();
    document.forms[0].guess.select();
    myGuessedNumber = Random();
    NumberOfGuesses = 0;
}