package com.luciancarlos.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/HTMLReports/report.html"},
		features = "src/test/resources/",
		//tags = "@buscaCredenciado",
		//tags = {"@buscaBlog"},
		tags = {"@buscaCredenciado"},		
		//tags = "@blog",		
		glue = {"com.luciancarlos.steps"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)
public class SOCTestRunner {

}
