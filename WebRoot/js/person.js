function Person() {
	var name = "";
	var price = new Number();
	var perNoType = "";
	var perNo = "";
	var insurancePrice = new Number();

	this.getName = function() {
		return name;
	}

	this.setName = function(_name) {
		name = _name;
	}

	this.getPrice = function() {
		return price;
	}

	this.setPrice = function(_price) {
		name = _name;
	}
	this.getPerNoType = function() {
		return perNoType;
	}

	this.setPerNoType = function(_perNoType) {
		perNoType = _perNoType;
	}
	this.getPerNo = function() {
		return perNo;
	}

	this.setPerNo = function(_perNo) {
		perNo = _perNo;
	}
	this.getIsInsurance = function() {
		return isInsurance;
	}

	this.setIsInsurance = function(_isInsurance) {
		isInsurance = _isInsurance;
	}
}