function pop_init(title,content,enddate) {
	//取当前浏览器窗口大小
	var windowWidth=$(document).width();
	var windowHeight=$(document).height();
	//弹窗的大小
	var weight=320;
	var height=240;
	$("body").append(
	"<div id='pop_div'style='background:white;display:none;position:absolute;border:1px solid #3C8DBC;z-index:99;width:"+weight+"px;height:"+height+"px;top:"+(windowHeight-height-10)+"px;left:"+(windowWidth-weight-10)+"px'>"+
		"<div style='line-height:32px;background:#3C8DBC;border-bottom:1px solid #e0e0e0;font-size:14px;padding:0 0 0 10px;'>" +
			"<div style='float:left;'><b>"+title+"</b></div><div style='float:right;cursor:pointer;'><b onclick='pop_close()'>×</b></div>" +
			"<div style='clear:both'></div>"+
		"</div>" +
		"<div id='content'>" +
			 content+
		"</div>"+
	"</div>"
	);
	if(getNowFormatDate()<=enddate)$('#pop_div').fadeIn(400);
}
function pop_close(){
	$('#pop_div').fadeOut(400);
}

function getNowFormatDate() {
    var date = new Date();
    var seperator1 = "";
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = year + seperator1 + month + seperator1 + strDate;
    return currentdate;
}