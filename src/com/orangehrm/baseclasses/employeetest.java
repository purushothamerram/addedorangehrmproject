package com.orangehrm.baseclasses;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pom.Addemployeepage;
import com.orangehrm.pom.Menu;
import com.orangehrm.pom.employeelist;



public class employeetest extends constants{
@Test
public void employeetaestform() throws IOException
{
	Menu menu=PageFactory.initElements(driver, Menu.class);
	employeelist el=PageFactory.initElements(driver, employeelist.class);
	Addemployeepage ae=PageFactory.initElements(driver, Addemployeepage.class);
	String runmode=eo.getcelldata(dataenginepath, 0, 2, 2);
	if (runmode.equals("N")) {
		
		throw new SkipException("ggggg");
	}
	int rowcount=eo.rowcount(employeesearchpath, 0);
	for (int i = 1; i <=rowcount; i++) {
	menu.Pin();
	Row r=eo.getRow(employeesearchpath, 0, i);
	el.employeelistform(r);
	if (eo.getcelldata(employeesearchpath, 0, i, 7).contains("No Records Found")) {
		ae.Addemployee(r);
	}
	}
}
}
