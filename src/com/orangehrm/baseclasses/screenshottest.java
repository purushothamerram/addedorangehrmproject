package com.orangehrm.baseclasses;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class screenshottest extends constants{
@Test
public void screen(String path,Row r) throws IOException
{
String runmode=eo.getcelldata(dataenginepath, 0, 3, 2);	
if (runmode.equals("N")) {
	r.createCell(3).setCellValue("blocked");
throw new SkipException("skip screenshot test");
	
}
ss.screenshot(driver, sc, "orange");
}
}
