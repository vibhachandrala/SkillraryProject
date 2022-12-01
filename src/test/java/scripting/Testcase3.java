package scripting;

import java.io.IOException;

import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.Test;

import generic.lib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.Skillaryloginpage;
import pomPages.Wishlistpage;

public class Testcase3 extends BaseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		
		Skillaryloginpage s1=new Skillaryloginpage(driver);
		s1.searchtextbox(pdata.getdata("coursename"));
		s1.searchbtn();
		
		CorejavaPage cp=new CorejavaPage(driver);
		cp.java();
		
		Wishlistpage wp=new Wishlistpage(driver);
		
		wp.cancelbutton();
		driverutilies.switchFrame(driver);
		wp.playbutton();
		Thread.sleep(5000);
		
		try {
			wp.pausebutton();
		}
		catch(ElementNotInteractableException e) {
			driverutilies.javascriptclick(driver, wp.getPausebtn());
			
		}
		 
		
		driverutilies.switchbackframe(driver);
		wp.addtowishlist();
		
		
	}
}
