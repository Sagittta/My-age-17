function fireit(){
    var theone=Math.floor(Math.random()*6)

    if (theone<=document.fire.bullets.value-1) {
        var audio = new Audio('audio/ak74-fire.wav');
        audio.play();
        alert("탕~~~! 당신은 죽었습니다..고인의 명복을")
    }
    else{
        var audio = new Audio('audio/spas12-reload.wav');
        audio.play();
        document.fire.message.value="어휴!! 운이 좋군..."
        setTimeout("document.fire.message.value='방아쇠를 당깁니다..'",500)
    }
}