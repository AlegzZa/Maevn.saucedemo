package TestClasses;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import components.Header;
import components.Menu;
import pages.BackToProductsPage;
import pages.CheckoutCompletePage;
import pages.CheckoutOverviewPage;
import pages.CheckoutYourInformationPage;
import pages.LoginPage;
import test.data.OrderDetailsFinal;
import test.data.Products;
import test.data.URL;
import test.data.Users;
import pages.ProductsPage;
import pages.YourCartPage;

public class BaseTest {
	    //Object declaration
	static WebDriver driver;
	public static LoginPage loginpage;
	public static ProductsPage productspage;
	public static Menu menu;
	public static Header header;
	public static BackToProductsPage backtoproductspage;
	public static YourCartPage yourcartpage;
	public static CheckoutYourInformationPage checkoutYourInformationPage;
	public static CheckoutOverviewPage checkoutoverviewpage;
	public static CheckoutCompletePage checkoutcompletepage;
	
	    //Object instantiation - data management
	public Users adminuser = new Users("adminuser");
	public Users client= new Users("client");
	public Products product= new Products("product");
	public OrderDetailsFinal orderdetails=new OrderDetailsFinal("orderDetails");
	
	@Before
	public void before() {
		
		//ChromeDriver setup;
	System.setProperty("webdriver.chorme.driver","C:\\Users\\zuzum\\eclipse-workspace\\maven.proiect.final\\Drivers");
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	    //Object instantiation - pages;
    loginpage= new LoginPage(driver);
	productspage= new ProductsPage(driver);
	menu= new Menu(driver);
	backtoproductspage= new BackToProductsPage(driver);
	header=new Header(driver);
	yourcartpage= new YourCartPage(driver);
	checkoutYourInformationPage= new CheckoutYourInformationPage(driver);
	checkoutoverviewpage= new CheckoutOverviewPage(driver);
	checkoutcompletepage=new CheckoutCompletePage(driver);
	
	   //Navigate to Login Page
	driver.navigate().to(URL.LOGIN);

	}
	
	@After
	public void after() {
		//driver.close();
	    driver.quit();
	}
	
}
