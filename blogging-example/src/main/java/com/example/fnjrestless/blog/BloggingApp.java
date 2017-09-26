package com.example.fnjrestless.blog;

import com.fnproject.fn.jrestless.FnFeature;
import com.fnproject.fn.jrestless.FnRequestHandler;

import org.glassfish.jersey.server.ResourceConfig;

public class BloggingApp extends FnRequestHandler {

    public BloggingApp() {

        ResourceConfig config = new ResourceConfig();
        config.packages("com.oracle.faas.jrestlessexample.blog");
        config.register(FnFeature.class);

        init(config);

        start();
    }
}
