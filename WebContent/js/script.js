var uname;
var desig;
var cmp;
var cit;
var pin;

function validateAndSubmit()
{
	uname = $("#userName").val();
	desig = $("#designation").val();
	cmp = $("#company").val();
	cit = $("#city").val();
	pin = $("#pincode").val();
	submitRegistForm();
}
/*
function validateForm(fieldValue, fieldName)
{
	 if( fieldValue.length == 0 ) {
		 error(1,"Required "+fieldName);
		 return false;
	 }
	 return true;
}



function hideshow(el,act)
{
	if(act) $('#'+el).css('visibility','visible');
	else $('#'+el).css('visibility','hidden');
}

function error(act,txt)
{
	var modified = "<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
					"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+
			"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='red'>"+txt+"</font>";
	$('#errormsg').html(modified);
}
*/
function submitRegistForm()
{

	$.ajax({
	   	type: 'GET',
	    url: 'save.do',
	    async: false,
	    contentType: "application/json",
	    data  : {
	    user_name:uname,
	     designation:desig,
	     company:cmp,
	     city:cit,
	     pincode:pin
	    },		  	    
	  success: function(jsonResp) {
		  
		  console.log(jsonResp);
		  alert(jsonResp.message);
		  document.getElementById("prodId").reset();
		  $('#errormsg').html("");
		},
    	error: function(e) {
    	}
	});
	return true;
 
   function update()
		{
		document.productForm.action="update.do";
		document.productForm.submit();
		}

  function list()
		{
		document.productForm.action="list.do";
		document.productForm.submit();
		}
	   
}