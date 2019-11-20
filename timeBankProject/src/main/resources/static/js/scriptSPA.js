

$('input[type="submit"]').mousedown(function () {
  $(this).css('background', '#2ecc71');
});
$('input[type="submit"]').mouseup(function () {
  $(this).css('background', '#1abc9c');
});

$('#aboutform').click(function () {
  $(".cont_carrusel").hide();
  $('.about').fadeToggle('slow');
  $(this).toggleClass('green');
});

$('#loginform').click(function () {
  $(".cont_carrusel").hide();
  $('.login').fadeToggle('slow');
  $(this).toggleClass('green');
});

$('#registerform').click(function () {
  $(".cont_carrusel").hide();
  $('.cont_register').fadeToggle('slow');
  $(this).toggleClass('green');
});

$('#selecService').click(function () {
  $(".cont_carrusel").hide();
  $('#cont_servicios').fadeToggle('slow');
  $(this).toggleClass('green');
});

$('#jobsUserform').click(function () {
	  $(".cont_carrusel").hide();
	  $('.cont_addjobs').fadeToggle('slow');
	  $(this).toggleClass('green');
	});


$(document).mouseup(function (e) {
  var container1 = $(".login");
  var container2 = $(".cont_register");
  var container3 = $("#cont_servicios");
  var container4 = $(".about"); 
  var container5 = $(".cont_addjobs");
  var container6 = $(".cont_carrusel");
  

  var checkC1 = false;
  var checkC2 = false;
  var checkC3 = false;
  var checkC4 = false;
  var checkC5 = false;
  
  
  if (!container1.is(e.target) && container1.has(e.target).length === 0) {
    container1.hide();
    $('#loginform').removeClass('green');
    checkC1=true;
  }else{
    checkC1=false;
  }

  if (!container2.is(e.target) && container2.has(e.target).length === 0) {
    container2.hide();
    $('#registerform').removeClass('green');
    checkC2=true;
  }else{
    checkC2=false;
  }

  if (!container3.is(e.target) && container3.has(e.target).length === 0) {
    container3.hide();
    $('#selecService').removeClass('green');
    checkC3=true;
  }else{
    checkC3=false;
  }
  if (!container4.is(e.target) && container4.has(e.target).length === 0) {
    container4.hide();
    $('#aboutform').removeClass('green');
    checkC4=true;
  }else{
    checkC4=false;
  }
  
  if (!container5.is(e.target) && container5.has(e.target).length === 0) {
	    container5.hide();
	    $('#jobsUserform').removeClass('green');
	    checkC5=true;
	  }else{
	    checkC5=false;
	  }

  if (checkC1 == true & checkC2==true && checkC3==true && checkC4==true && checkC5==true) {
	    container6.show();
	  } else {
	    container6.hide();
	  }
 

});