package com.luxoft;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/luxoft/feature/",
        glue = "com/luxoft/steps/",
        plugin = {"json:target/cucumber.json"}
)
public class AppTest {


}
