package com.rajkhare.groovy

class Patient {
	def firstName,lastName,age
	static hospitalCode = "Best Hospital"
	
	void setLastName(lastName) {
		if(lastName==null) {
			throw IllegalArgumentException("Last Name can not be null")
		}
		this.lastName=lastName
	}
	
	static void display() {
		println hospitalCode
	}
}

p=new Patient(firstName:'Raj', lastName:'Khare', age: 40)
p.setLastName("Srivastava")
println p.firstName+" "+p.lastName+" "+p.age

Patient.display()
