package com.optoons;

import java.util.Map;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/feature", glue = { "stepDefination" },dryRun=true)
public class TestRunner {

}

