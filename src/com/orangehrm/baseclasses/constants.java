package com.orangehrm.baseclasses;

import org.openqa.selenium.WebDriver;

import com.orangehrm.utility.Exceloperations;
import com.orangehrm.utility.screenshots;

public class constants {
static WebDriver driver=null;
screenshots ss=new screenshots();
Exceloperations eo=new Exceloperations();
String employeelistpath="C:\\Users\\admin\\Downloads\\extenorangehrmprojectwithoutgrid-master\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
String dataenginepath="C:\\Users\\admin\\Downloads\\extenorangehrmprojectwithoutgrid-master\\src\\com\\orangehrm\\excelfiles\\DataEngine.xlsx";
String sc="C:\\Users\\admin\\Downloads\\extenorangehrmprojectwithoutgrid-master\\src\\com\\orangehrm\\screenshots"; 
String employeesearchpath="C:\\Users\\admin\\Downloads\\extenorangehrmprojectwithoutgrid-master\\src\\com\\orangehrm\\excelfiles\\searchemployee.xlsx";
}
