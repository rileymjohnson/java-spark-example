# Java Spark Example
This is an example of using Java and Spark to create basic web applications

## Let's start with the hello world example
We'll go line by line

This line imports the Spark library that is the basis of the application\s
```package spark.examples.hello;```

This line imports the the Spark get request method that allows us to make HTTP get requests\s
```import static spark.Spark.get;```

This line creates our HelloWorld class which is the fundamental controller of our application\s
```public class HelloWorld {```

This line creates our main method which handles all of the requests\s
```public static void main(String[] args) {```

This line creates a HTTP get request for "/hello". When a user visits "/hello", the screen will display "Hello World!"\s
```get("/hello", (request, response) -> "Hello World!");```
