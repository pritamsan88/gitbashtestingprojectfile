package pom;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pom {
	
	WebDriver driver;
	JavascriptExecutor js;

	By searchfield =By.className("search_btn");
	By searchbaritem=By.name("q");
	By searchioconclickafterproductname= By.id("search");
	By sortbyelement=By.id("SortBy");
	By productcount=By.id("ProductCountDesktop");
	By productgrid=By.xpath("//ul[@role='list']/li");
	public pom(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchclick()
	{
		driver.findElement(searchfield).click();
	}
	public void searchbaritem(String product)
	{
		driver.findElement(searchbaritem).sendKeys(product);
	}
	public void afterclickproductname()
	{
		driver.findElement(searchioconclickafterproductname).click();
	}
	public void sortfunctionality() throws InterruptedException
	{
		Select dropdown=new Select(driver.findElement(sortbyelement));
		Thread.sleep(5000);
		dropdown.selectByVisibleText("Price, high to low");
		Thread.sleep(5000);
		
	}
	public void productcount()
	{
		String count=driver.findElement(productcount).getText();
		System.out.println(count);
	}
	public void productverify()
	{
		List<WebElement> allresults=driver.findElements(productgrid);
		System.out.println(allresults);
		for(int i=0;i< allresults.size();i++)
		{
			System.out.println(allresults.size());
			js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
		}
		
		
	}
}
