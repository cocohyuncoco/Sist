/**
 * 
 */
 
 $(function () {
    
    //초기이미지
    $("#myimg").attr("src", "../image/f20.png");
    
    //hover 이벤트
    $("#myimg").hover(function () {
    	$(this).attr("src", "../image/f18.png");    	
	}, function () {
    	$(this).attr("src", "../image/f20.png");
	});
    
})