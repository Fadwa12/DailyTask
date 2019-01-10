

var password = document.getElementById("password")
  , repassword = document.getElementById("repassword");

function validatePassword(){
  if(password.value != repassword.value) {
    repassword.setCustomValidity("Vos mots de passes ne sont pas identiques ");
  } else {
    repassword.setCustomValidity('');
  }
}


password.onchange = validatePassword;
repassword.onkeyup = validatePassword;




var firstname=document.getElementById("firstname");


function test(){
	if((firstname.value.length < 2) || (firstname.value.length > 15 )  ){
		firstname.setCustomValidity(" Verifier la longueur");
	}
	 else {
		    firstname.setCustomValidity('');
		  }
	
}
firstname.onchange= test;



