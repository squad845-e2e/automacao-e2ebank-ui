package banke2etreinamentos.ui.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import banke2etreinamentos.ui.drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "banke2etreinamentos.ui.steps",
		tags = "@positive",
		monochrome = true,
		dryRun = false,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/report-cucumber.html"}
		
		)
public class Executa extends DriversFactory{

	public static void startTest(String ambiente) {
		driver = new ChromeDriver();
		driver.get(ambiente);
		driver.manage().window().maximize();
	}
	
	public static void finishTest() {
		driver.quit();
	}
	
}
