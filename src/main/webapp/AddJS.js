/**
 * 
 */

function add(){
	var a = document.getElementById("fnum").value;
	var b = document.getElementById("snum").value;
	
	var xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function() {

		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("Result") = this.responseText;
		}
	};
	
	xhr.open("GET", "/add", true);
	xhr.send();
	
}