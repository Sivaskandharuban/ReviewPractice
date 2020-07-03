/**
 * 
 */

function add(){
	var first = document.getElementById("fnum").value;
	var second = document.getElementById("snum").value;
	var param = "first=" +first + "&second=" +second;
	
	var xhr = new XMLHttpRequest();
	
	
	xhr.onload = function() {
		
		if (this.readyState == 4 && this.status == 200) {
			console.log(this.responseText);
			document.getElementById("Result").innerHTML = this.responseText;
		}
	};
	
	xhr.open("GET", "/add"+"?" +param, true);
	xhr.setRequestHeader("Content-Type", "application/json");
	xhr.send();
	
}

function sub(){
	var first = document.getElementById("fnum").value;
	var second = document.getElementById("snum").value;
	var param = "first=" +first + "&second=" +second;
	
	var xhr = new XMLHttpRequest();
	
	
	xhr.onload = function() {
		
		if (this.readyState == 4 && this.status == 200) {
			console.log(this.responseText);
			document.getElementById("Result").innerHTML = this.responseText;
		}
	};
	
	xhr.open("GET", "/sub"+"?" +param, true);
	xhr.setRequestHeader("Content-Type", "application/json");
	xhr.send();
	
}

function mul(){
	var first = document.getElementById("fnum").value;
	var second = document.getElementById("snum").value;
	var param = "first=" +first + "&second=" +second;
	
	var xhr = new XMLHttpRequest();
	
	
	xhr.onload = function() {
		
		if (this.readyState == 4 && this.status == 200) {
			console.log(this.responseText);
			document.getElementById("Result").innerHTML = this.responseText;
		}
	};
	
	xhr.open("GET", "/mul"+"?" +param, true);
	xhr.setRequestHeader("Content-Type", "application/json");
	xhr.send();
	
}

function div(){
	var first = document.getElementById("fnum").value;
	var second = document.getElementById("snum").value;
	var param = "first=" +first + "&second=" +second;
	
	var xhr = new XMLHttpRequest();
	
	
	xhr.onload = function() {
		
		if (this.readyState == 4 && this.status == 200) {
			console.log(this.responseText);
			document.getElementById("Result").innerHTML = this.responseText;
		}
	};
	
	xhr.open("GET", "/div"+"?" +param, true);
	xhr.setRequestHeader("Content-Type", "application/json");
	xhr.send();
	
}