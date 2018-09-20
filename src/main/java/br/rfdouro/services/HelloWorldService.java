/*
https://www.baeldung.com/spark-framework-rest-api

http://sparkjava.com/
http://sparkjava.com/download

https://sparktutorials.github.io/
 */
package br.rfdouro.services;

import static spark.Spark.*;

/**
 *
 * @author romulo
 */
public class HelloWorldService {

 public static void main(String[] args) {
  
  port(4567);

  get("/hello", (req, res) -> "Hello, world");

  get("/hello/:name", (req, res) -> {
   return "Hello, " + req.params(":name");
  });
 }
}
