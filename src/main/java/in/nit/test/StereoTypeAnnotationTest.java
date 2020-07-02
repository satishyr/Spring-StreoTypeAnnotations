package in.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nit.beans.Vechicle;

public class StereoTypeAnnotationTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Vechicle vehicle = null, vehicle1 = null;
		// create IOC container
		ctx = new ClassPathXmlApplicationContext("in/nit/cfgs/applicationContext.xml");
		// get Bean
		vehicle = ctx.getBean("vechicle", Vechicle.class);
		// invoke method
		vehicle.jounery("hyd", "goa");

		vehicle1 = ctx.getBean("vechicle", Vechicle.class);
		System.out.println(vehicle.hashCode() + "  " + vehicle1.hashCode());

		// close container
		((AbstractApplicationContext) ctx).close();

	}// main

}// class
