 package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3  {

 public static void main(String[] args) {
	
 System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");//clique droit sur chromedriver.exe-propreties et copier
 WebDriver driver = new ChromeDriver();//une instance du navigateur chrome,
 //ChromeDriver driver2 = new ChromeDriver(); driver2 de type chrome uniquement
 driver.get("https://opensource-demo.orangehrmlive.com/");// methode get pour aller chercher un site web
 
 driver.manage().window().maximize();// maximiser l'affichage de la fenetre
 
 WebElement  username = driver.findElement(By.id("txtUsername"));//identification element web
 username.sendKeys("admin");// pour envoyer du test
 //driver.findElement(By.id("txtUsername")).sendKeys("admin");
  
 
 
 WebElement password = driver.findElement(By.name("txtPassword"));
 password.sendKeys("admin123");
   
 
 WebElement btnLogin = driver.findElement(By.id ("btnLogin"));
 btnLogin.click();
 
 WebElement Lienwelcome = driver.findElement(By.id ("welcome"));
 Lienwelcome.click();
 
 WebElement logoutlink = driver.findElement(By.linkText("logout"));
 logoutlink.click();
  
 
   

 	}
 
 }
 