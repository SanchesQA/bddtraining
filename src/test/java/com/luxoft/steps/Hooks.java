package com.luxoft.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before
    public  void firstBeforeHook(){
        System.out.println("Before hook");
    }
    @After
    public  void firstAfterHook(){
        System.out.println("After hook");
    }
}
