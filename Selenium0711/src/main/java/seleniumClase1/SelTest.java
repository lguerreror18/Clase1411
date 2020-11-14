package seleniumClase1;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest {

	public static void main(String[] args) {

			System.out.println("Test");
			
			// Seteando el Path de nuestro driver, donde esta guardado
			String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;
			
			// Identificando el .exe para driver
			System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
			
			// Creación en tiempo de ejecucion
			WebDriver driver = new ChromeDriver();
			
			// Abriendo con la URL especificada
			driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java");
			
		
	}

}
