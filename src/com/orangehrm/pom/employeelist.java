package com.orangehrm.pom;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class employeelist {
@FindBy(id="menu_pim_viewEmployeeList")
WebElement employeelist;
@FindBy(id="empsearch_employee_name_empName")
WebElement employeename;
@FindBy(id="empsearch_id")
WebElement employeeid;
@FindBy(id="empsearch_employee_status")
WebElement status;
@FindBy(id="empsearch_termination")
WebElement include;
@FindBy(id="empsearch_supervisor_name")
WebElement supervisor;
@FindBy(id="empsearch_job_title")
WebElement jobtitle;
@FindBy(id="empsearch_sub_unit")
WebElement subunit;
@FindBy(id="searchBtn")
WebElement search;
@FindBy(xpath=".//*[@id='resultTable']/tbody/tr/td")
WebElement message;
public void employeelistform(Row r)
{
	employeelist.click();
	employeename.sendKeys(r.getCell(0).getStringCellValue());
	employeeid.sendKeys(r.getCell(1).getStringCellValue());
	status.sendKeys(r.getCell(2).getStringCellValue());
	include.sendKeys(r.getCell(3).getStringCellValue());
	supervisor.sendKeys(r.getCell(4).getStringCellValue());
	jobtitle.sendKeys(r.getCell(5).getStringCellValue());
	subunit.sendKeys(r.getCell(6).getStringCellValue());
	search.click();
	
}
}
