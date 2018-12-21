package com.kiss.verticle;

import org.springframework.context.ApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kiss.service.ScreeningService;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;

public class SpringDemoVerticle extends AbstractVerticle {

	  public static final String ALL_SCREENING = "test.screening";


	  private final ObjectMapper mapper = Json.mapper;

	  private final ScreeningService screeningService;

	  public SpringDemoVerticle(final ApplicationContext context) {
		  screeningService =(ScreeningService) context.getBean("screeningService");
	  }

	  private Handler<Message<String>> allProductsHandler(ScreeningService screeningService) {
	   
		  
	    return msg -> vertx.<String>executeBlocking(future -> {
	          try {
	        	  future.complete(mapper.writeValueAsString(screeningService.findAllScreening()));

	          } catch (JsonProcessingException e) {
	            System.out.println("Failed to serialize result");
	            future.fail(e);
	          }
	        },
	        result -> {
	          if (result.succeeded()) {
	            msg.reply(result.result());
	          } else {
	        	  System.out.println("hello here");
	            msg.reply(result.cause().toString());
	          }
	        });
	  }

	  @Override
	  public void start() throws Exception {
	    super.start();
	    vertx.eventBus().<String>consumer(ALL_SCREENING).handler(allProductsHandler(screeningService));
	  }
	}
