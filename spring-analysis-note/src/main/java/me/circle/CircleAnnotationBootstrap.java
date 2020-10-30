package me.circle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class CircleAnnotationBootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CircleConfiguration.class);
		ComponentA bean = (ComponentA) context.getBean("componentA");
		System.out.println(bean);
	}
}
