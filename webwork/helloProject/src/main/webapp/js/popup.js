/**
 * 
 */

function pop1() {
    window.open('../popup/popup1_1.jpg','팝업','width=500, height=500, scrollbars=yes');
}

function pop3() {
    window.open('../popup/popup3.jpg','팝업','width=430, height=430');
}

newWin = window.open('../popup/popup4.jpg','팝업','width=430, height=430');
setTimeout('newWin.close()',5000);

/* 
    window.setTimeOut(function(){},밀리초);
*/