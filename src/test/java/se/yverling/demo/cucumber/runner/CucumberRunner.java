package se.yverling.demo.cucumber.runner;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
	features = {"classpath:features"},
	glue = {"se.yverling.demo.cucumber.stepdefs"},
	format = {"pretty", "html:build/cucumber-html-report"})
public class CucumberRunner {
}