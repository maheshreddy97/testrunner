package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\1.feature",glue="org.stepdefinition",plugin="json:target/cucumber-reports/cucumber.json",tags="@tag1")

public class Testrunner {

}
