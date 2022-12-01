package scripting;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import generic.lib.BaseClass;
import pomPages.Skillaryloginpage;
import pomPages.SkillraryDemoLogin;
import pomPages.Testingpage;

public class Testcase2 extends BaseClass{

	@Test
	public void tc2() throws IOException {
		
		Skillaryloginpage s=new Skillaryloginpage(driver);
		s.gearsbutton();
		s.skillrarydemoapp();
		
		driverutilies.switchtabs(driver);
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilies.dropdown(sd.getCourseadd(),pdata.getdata("dropdownopt"));
		sd.seleniumtrainingbtn();
		
		Testingpage tp=new Testingpage(driver);
		driverutilies.draganddrop(driver,tp.getseleniumtraining(),tp.getCart());
		
	   Point loc = tp.getTwitter().getLocation();
	   int x = loc.getX();
	   int y = loc.getY();
		
       driverutilies.scrollbar(driver,x,y);
		
		tp.twitterlogo();
	}
	
}
