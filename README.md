# Java Spark Example
This is an example of using Java and Spark to create basic web applications

## Let's start with the hello world example
We'll go line by line

This line imports the Spark library that is the basis of the application.     
```package spark.examples.hello;```

This line imports the the Spark get request method that allows us to make HTTP get requests.     
```import static spark.Spark.get;```

This line creates our HelloWorld class which is the fundamental controller of our application.     
```public class HelloWorld {```

This line creates our main method which handles all of the requests.     
```public static void main(String[] args) {```

This line creates a HTTP get request for "/hello". When a user visits "/hello", the screen will display "Hello World!".     
```get("/hello", (request, response) -> "Hello World!");```

## What are some other things that Spark can do?
This line creates a HTTP post request. This type of request is used for submitting or modifying resources. This site explains the different type of HTTP requests: [HTTP Request Types](http://www.restapitutorial.com/lessons/httpmethods.html).          
```post("/goodbye", (request, response) -> "Goodbye World!");```
