package com.example.groovy

class MyGroovy implements GroovyRunner {
	@Override
	public void run(String name) {
		println 'Hello '+name+'!'
	}
}
