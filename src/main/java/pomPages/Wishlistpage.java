package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage {

	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playbtn;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement cancelbtn;
	
	public Wishlistpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playbutton() {
		playbtn.click();
	}
	
	public void pausebutton() {
		pausebtn.click();
	}
	
	
	public WebElement getPausebtn() {
		return pausebtn;
	}

	public void addtowishlist() {
		addtowishlist.click();
	}
    
	public void cancelbutton() {
		cancelbtn.click();
	}
	
}
