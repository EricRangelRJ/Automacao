package br.com.alho.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/RealizarLogin.feature",
		glue = "br.com.alho.steps",
//		tags = "~@ignore",
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE, 
		dryRun = false,
		publish = false
)

public class Runner {

}
