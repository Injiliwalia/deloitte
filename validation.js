function checkValidation()
{
var ele=document.getElementById("tandc");

if(ele.checked)
{
 document.getElementById("t&c").innerHTML="";
   return true;
   }
   else{
   document.getElementById("t&c").innerHTML="Please agree to terms and conditions.";
   return false;
}}
   
function  mainValidation()
{
	var a=checkValidation();
	if(a)
		return true;
	else
    return false;
}