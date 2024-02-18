function init() {
	include("TemplateFunc.java");
	
	generate("return", [ "void", "boolean", "byte", "char", "short", "int", "float", "long", "double", "R" ]);
	generate("p1", [ "void", "boolean", "byte", "char", "short", "int", "float", "long", "double", "P1" ]);
	generate("p2", [ "void", "boolean", "byte", "char", "short", "int", "float", "long", "double", "P2" ]);
	generate("p3", [ "void", "boolean", "byte", "char", "short", "int", "float", "long", "double", "P3" ]);
	generate("throw", [ "void", "T extends Throwable" ]);
}

function loop() {
	var __return = get("return");
	var __returnName = long_name(__return);
	var __params = [ get("p1"), get("p2"), get("p3") ];
	var __paramNames = [ long_name(__params[0]), long_name(__params[1]), long_name(__params[2]) ];
	var __paramCount = getParamCount(__params);
	var __throw = get("throw");
	if (__paramCount == -1) {
		destination(null);
		return;
	}
	
	var generics = getGenerics(__return, __params, __throw);
	define("generics", generics);
	define("exception", __throw != "void" ? " throws T" : "");
	define("parameters", getParameters(__params, __paramCount));
	
	var className = getClassName(__returnName, __paramNames, __paramCount, __throw);
	var pkg = "";
	var path = "";
	for (let i = 0; i < __paramCount; i++) {
		let p = isObj(__params[i]) ? "obj" : "_" + __params[i];
		pkg += `.${p}`;
		path += `/${p}`;
	}
	
	replace("fluff.functions.template", `fluff.functions.gen${pkg}`);
	replace("TemplateFunc", className);
	
	destination(`gen${path}`);
	
	print(className + generics);
}

function getClassName(__returnName, __paramNames, __paramCount, __throw) {
	var className = "";
	if (__throw != "void") className += "T";
	if (__returnName != "Obj") className += __returnName;
	className += "Func";
	if (__paramCount != 0) className += __paramCount;
	
	var add = false;
	for (let i = 0; i < __paramCount; i++) {
		if (__paramNames[i] != "Obj") {
			add = true;
			break;
		}
	}
	
	if (add) {
		for (let i = 0; i < __paramCount; i++) {
			className += __paramNames[i];
		}
	}
	return className;
}

function getGenerics(__return, __params, __throw) {
	var genericsArray = [ __return, __params[0], __params[1], __params[2], __throw ];
	var prev = false;
	var generics = "";
	for (var i in genericsArray) {
		if (isObj(genericsArray[i])) {
			generics += (prev ? ", " : "<") + genericsArray[i];
			prev = true;
		}
	}
	if (generics != "") generics += ">";
	return generics;
}

function getParameters(__params, __paramCount) {
	var parameterNames = [ "p1", "p2", "p3" ];
	var parameters = "";
	for (let i = 0; i < __paramCount; i++) {
		parameters += `${parameters != "" ? ", " : ""}${__params[i]} ${parameterNames[i]}`;
	}
	return parameters;
}

function getParamCount(__params) {
	if (__params[2] != "void") {
		return __params[1] != "void" && __params[0] != "void" ? 3 : -1;
	} else if (__params[1] != "void") {
		return __params[0] != "void" ? 2 : -1;
	} else if (__params[0] != "void") {
		return 1;
	}
	return 0;
}

function long_name(str) {
	if (isObj(str)) return "Obj";
	return str.charAt(0).toUpperCase() + str.slice(1);
}

function isObj(str) {
	return str == "R" || str == "P1" || str == "P2" || str == "P3" || str == "T extends Throwable";
}