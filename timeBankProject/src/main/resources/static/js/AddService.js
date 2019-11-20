var j=0;
function cont(j){
    j=j;
return j;
}

function arrangeSno() {
    cont(j--);
    $('#pTable tr').each(function () {
        $(this).find(".sNo").html(i);
    });
}

$(document).ready(function () {

    $('#addButId').click(function () {
   
   if(cont(j)>=10){
       cont(j);
     return;
 }else{
    cont(j++);
 }
        var sno = $('#pTable td').length;
        trow = "<tr>td class='sNo' class='re_left, text-dark'>" + sno + "</td>"
            + "<td><select name='servicio' required>"
            + "<option value='carpinteria' >Carpinteria</option>"
            + "<option value='construccion'>Construccion</option>"
            + "<option value='educacion'>Educacion</option>"
            + "<option value='electricista'>Electricista</option>"
            + "<option value='fontanero'>Fontanero</option>"
            + "<option value='mecanico'>Mecanico</option>"
            + "<option value='reparaciones'>Reparaciones</option>"
            + "<option value='domesticos'>S.Domesticos</option>"
            + "</select></td>"
            + "<td><input name='descripcion ' type='text' required></td>"
            + "<td><input name='disponibilidad ' type='text' required></td>"
            + "<td><button type='button' class='rButton'>Borrar </button></td></tr>";
        $('#pTable').append(trow);
    });
});

$(document).on('click', 'button.rButton', function () {
    $(this).closest('tr').remove();
    arrangeSno();
    return false;

});
