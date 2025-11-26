const prompt = require('prompt-sync')();

let names = [];
//const names = ["Emma","Samuel","Solomon","Fred","Anank","paul","Yomi","Collins"];

for(let name = 0; name < 6; name++){
	check = prompt('Enter friends name: ');
	names.push(check);
	console.log("hi")
	
}

friendNames = names.filter((check) => check.length == 4);

console.log(friendNames);

