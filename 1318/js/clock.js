function digital() 
{
	var d = new Date(); /* d = 현재 시간 */
	var h = d.getHours(); /* h = 시간 */
    var m = d.getMinutes(); /* m = 분 */
    var s = d.getSeconds(); /* s = 초 */
    var t = (h > 12) ? " P.M." : " A.M."    /*오후 오전 구분*/
	
	var dh = ( h * 30 ) + ( m / 2 ); /* dh = 시침의 각도 */
	dh = parseInt( dh ); /* 시침의 각도를 정수형으로 변환 */
	var dm = m * 6; /* 분침의 각도 */
    var ds = s * 6; /* 초침의 각도 */

	/* 시침, 분침, 초침의 각도를 계산한 값으로 변경 */
	/* IE 10+, Firefox */
	document.getElementById("hour").style.transform = "rotate(" + dh + "deg)";
	document.getElementById("munite").style.transform = "rotate(" + dm + "deg)";
	document.getElementById("second").style.transform = "rotate(" + ds + "deg)";
	
	/* IE 9 */
	document.getElementById("hour").style.MsTransform = "rotate(" + dh + "deg)";
	document.getElementById("munite").style.MsTransform = "rotate(" + dm + "deg)";
	document.getElementById("second").style.MsTransform = "rotate(" + ds + "deg)";
	
	/* Opera, Chrome, Safari */
	document.getElementById("hour").style.WebkitTransform = "rotate(" + dh + "deg)";
	document.getElementById("munite").style.WebkitTransform = "rotate(" + dm + "deg)";
    document.getElementById("second").style.WebkitTransform = "rotate(" + ds + "deg)";

    m = ((m < 10) ? ":0" : ":") + m
    s = ((s < 10) ? ":0" : ":") + s

	document.getElementById("digital").innerHTML = "<font class=clock>" + h + m + s + t + "</font>" + "&nbsp&nbsp";
	
}

//매 1초마다 함수 digital()을 호출하도록 타이머 생성
var timer = setInterval( function(){ digital(); }, 1000);