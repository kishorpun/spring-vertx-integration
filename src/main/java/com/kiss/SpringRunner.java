package com.kiss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kiss.context.SpringConfiguration;
import com.kiss.verticle.ServerVerticle;
import com.kiss.verticle.SpringDemoVerticle;

import io.vertx.core.Vertx;

public class SpringRunner {
	public static void main( String[] args ) {
	    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	    final Vertx vertx = Vertx.vertx();
	    vertx.deployVerticle(new SpringDemoVerticle(context));
	    vertx.deployVerticle(new ServerVerticle());
	    System.out.println("Deployment done");
	  }

}
