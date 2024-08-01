package banke2etreinamentos.ui.methods;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import banke2etreinamentos.ui.drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void escrever(By element, String text) {
		try {
			driver.findElement(element).sendKeys(text);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}

	public void clicar(By element) {
		try {
			driver.findElement(element).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void validarTexto(By element, String text) {
		try {
			assertTrue(driver.findElement(element).getText().contains(text));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
