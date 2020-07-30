package com.serenitydojo;

import org.junit.Test;

public class CallHelloworld {

    @Test
    public void callHello(){
        HelloWorld Hello = new HelloWorld();
        Hello.greeting();
    }

}
