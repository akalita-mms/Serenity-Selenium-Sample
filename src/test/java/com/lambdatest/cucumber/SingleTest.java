package com.lambdatest.cucumber;

import com.lambdatest.LambdaTestSerenityTest;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/single.feature")
public class SingleTest extends LambdaTestSerenityTest {
}
