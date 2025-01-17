package com.lambdatest.cucumber;

import com.lambdatest.LambdaTestSerenityTest;
import io.cucumber.junit.*;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/single.feature")
public class ParallelSafariTest extends LambdaTestSerenityTest {
}
