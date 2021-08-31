package Myhcllistener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreports {
	static ExtentReports extent;
    

	 


    public static ExtentReports CreateTest()
    
    {
    
        ExtentSparkReporter reporter = new ExtentSparkReporter("./ItimeReport.html");
        
        reporter.config().setReportName("Itime");
        
        reporter.config().setDocumentTitle("To Save the timesheet");
        
        extent = new ExtentReports();
 


        extent.attachReporter(reporter);
        
        extent.setSystemInfo("Test Engineer", "Mounika");
        
        return extent;
        

 

}

}
