package scripting;

import org.testng.annotations.Test;

import generic.lib.BaseClass;
import pomPages.Addtocartpage;
import pomPages.Skillaryloginpage;
import pomPages.SkillraryDemoLogin;

public class Testcase1 extends BaseClass{

	@Test
	public void tc1() {
		Skillaryloginpage s1=new Skillaryloginpage(driver);
		s1.gearsbutton();
		s1.skillrarydemoapp();
		
		driverutilies.switchtabs(driver);
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilies.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		Addtocartpage ad=new Addtocartpage(driver);
		driverutilies.doubleClick(driver,ad.getPlus());
		ad.cartbutton();
		
		driverutilies.alertpopup(driver);
	}
}
