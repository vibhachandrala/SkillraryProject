package generic.lib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
     
	//dropdown action
	//all these methods are non-static methods. hence we have created object
	public void dropdown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	//mousehover action
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//rightclick action
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//doubleclick action
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void draganddrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src,dest).perform();
	}
	
	//switch to frame
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	//switch back from frame
	public void switchbackframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	//alert popup
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	//switchtabs
	public void switchtabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for( String b:child) {
			driver.switchTo().window(b);
		}
	}
	
	//scrollbar action
	public void scrollbar(WebDriver driver, int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrolBy("+x+","+y+")");
		
	}
	
	public void javascriptclick(WebDriver driver,WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",ele);
		
	}
	
}

