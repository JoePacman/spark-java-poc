package com.ri;

import com.ri.utils.SparkUtils;

import org.apache.log4j.Logger;

import static spark.Spark.get;
import static spark.Spark.port;

public class App {

  public static void main(String[] args) {
    Logger logger = Logger.getLogger(App.class);
    SparkUtils.createServerWithRequestLog(logger);

    // config
    port(8081);

    // routes
    get("/hello", (request, response) -> "world");

  }

}