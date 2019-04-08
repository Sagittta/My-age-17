function cle(val) {
    document.getElementById("d").value=val;
}
function v(val) {
    document.getElementById("d").value+=val;
}
function cal() {
    try {
        cle(eval(document.getElementById("d").value))
    }
    catch(cal) {
        cle('Error')
    }
}
function back() {
    document.getElementById("d").value = document.getElementById("d").value.slice(0, document.getElementById("d").value.length-1);
}