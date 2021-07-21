package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

 public static void main(String[] args) {
	
 System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");//clique droit sur chromedriver.exe-propreties et copier
 WebDriver driver = new ChromeDriver();//une instance du navigateur chrome,
 //ChromeDriver driver2 = new ChromeDriver(); driver2 de type chrome uniquement
 driver.get("https://opensource-demo.orangehrmlive.com/");// methode get pour aller chercher un site web
 
 driver.manage().window().maximize();// maximiser l'affichage de la fenetre
 
 String titlepage = driver.getTitle();
 
System.out.println("Le titre est: "+titlepage);
 
if (titlepage.equals("OrangeHRM")) {
System.out.println("Le test  title est réussi");
	}else {
		System.out.println("Le test à échoué");
		
	}	
		String urlPage = driver.getCurrentUrl();//récuperer l'url de la page
		 
		System.out.println("L'url de la page est: "+urlPage);
		if (urlPage.equals("https://opensource-demo.orangehrmlive.com/")) {
			System.out.println("Le test url est réussi");
				}else {
					System.out.println("Le test url à échoué"); 
 
 
 
 }
 
 
 
 


	
	
	
	
}
 
 

 }
 
 
 
 
 
 
	 
	 
	
 	

