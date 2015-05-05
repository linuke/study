package com.example.groovy;

import java.io.File;

import org.junit.Test;

import groovy.lang.GroovyClassLoader;

/**
 * 
 * @author linuke
 *
 */
public class InvokeGroovyTest {
	
	@SuppressWarnings("resource")
	@Test
	public void groovyClassLoaderTest() throws Exception {
		ClassLoader parent = ClassLoader.getSystemClassLoader();
		GroovyClassLoader loader = new GroovyClassLoader(parent);
		Class<?> clazz = loader.parseClass(new File(InvokeGroovyTest.class.getResource("/").getPath()+"groovy/MyGroovy.groovy"));
		try {
			GroovyRunner gr = (GroovyRunner) clazz.newInstance();
			gr.run("张三");
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	

}
