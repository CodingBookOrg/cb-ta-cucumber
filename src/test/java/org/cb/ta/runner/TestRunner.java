package org.cb.ta.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/java/org/cb/ta/features"}, //feature files folder
        glue = {"org.cb.ta.testSteps"} //full package name
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
