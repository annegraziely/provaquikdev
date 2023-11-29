package suporte;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class Web {

    public static WebDriver createChrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\anneg\\OneDrive\\Documentos\\selenium\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        navegador.get("C:\\Users\\anneg\\OneDrive\\Documentos\\selenium\\teste-3.html");

        return navegador;

    }
}