package com.demo.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ={"src/test/java/features/AddToCart.feature"},
			dryRun = !true,
			glue = "steps",
			monochrome = true,
			snippets = SnippetType.CAMELCASE,
			plugin = {"html:Reports/HTMLREPORT.html",
					   "json:Reports/JSONREPORT.json",
					   "junit:Reports/JUNITREPORT.xml"
			}
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
