$('p').each(function(){
	var pdata = $(this);
	pdata.html( pdata.text().replace(/(^\w+)/,'$1') );
});

$('p').css("fontSize", "25px");