package com.example;

public class Greeter {

  public Greeter() {

  }

  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}

