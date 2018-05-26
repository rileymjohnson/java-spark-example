package spark.examples.hello;

import static spark.Spark.get;

public class HelloWorld {
	public static void main(String[] args) {
		get("/hello", (request, response) -> "Hello World!");
	}
}
