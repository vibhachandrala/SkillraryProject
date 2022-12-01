package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {

	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	@FindBy(id="cartArea")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-twitter'])[2]")
	private WebElement twitter;
	
	public Testingpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void twitterlogo() {
		twitter.click();
	}

	public WebElement getTwitter() {
		return twitter;
	}

	public void setTwitter(WebElement twitter) {
		this.twitter = twitter;
	}

	public WebElement getCart() {
		return cart;
	}

	public void setCart(WebElement cart) {
		this.cart = cart;
	}

	public WebElement getseleniumtraining() {
		// TODO Auto-generated method stub
		return null;
	}
}
