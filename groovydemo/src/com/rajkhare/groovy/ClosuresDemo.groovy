package com.rajkhare.groovy

c={ n=2 ->
	println n%2==0?"even":"odd"	
}

c.call()

4.times { n-> print n}
println ""
4.times { print it }