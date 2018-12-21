package com.kiss.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;

public class ServerVerticle extends AbstractVerticle {

	@Override
	public void start() throws Exception {
		super.start();
		HttpServer server = vertx.createHttpServer();
		server.requestHandler(req -> {
			if (req.method() == HttpMethod.GET) { 
				req.response().setChunked(true);

				if (req.path().equals("/screenings")) {
					
					vertx.eventBus().<String>send(SpringDemoVerticle.ALL_SCREENING, "", result -> {
						if (result.succeeded()) {
							req.response().setStatusCode(200).write(result.result().body()).end();
						} else {
							req.response().setStatusCode(500).write("error caught!!!").end();
						}
					});
				} else {
					req.response().setStatusCode(200).write("Hello from vert.x").end();
				}

			} else {
				// We only support GET for now
				req.response().setStatusCode(405).end();
			}
		});

		server.listen(8080);
	}
}