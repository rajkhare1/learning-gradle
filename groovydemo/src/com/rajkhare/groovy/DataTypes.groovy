package com.rajkhare.groovy

float a = 10.24F

println a
println a.class

s = 'hello'
println s

name = "Raj"
s = "hello ${name}"
println s

s='''
All the power is with in you.
You can do anything and everything
'''
println s

emailPattern = /\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}/
println emailPattern.class
print "testgmail@.com"==~ emailPattern