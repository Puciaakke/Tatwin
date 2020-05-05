package strona;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.markuputils.ExtentColor;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class cw4 {
	public ExtentHtmlReporter htmlReport;
    public ExtentReports extent;
    public ExtentTest testPositive;
    public ExtentTest testNegative;
    public ExtentTest testSkipped;
  @BeforeTest
  public void beforeTest() {
	  htmlReport = new ExtentHtmlReporter("test-output//TestZadanie.html");
      htmlReport.config().setDocumentTitle("zadanie 4");
      htmlReport.config().setReportName("Automatic reports generation");
      htmlReport.config().setTestViewChartLocation(ChartLocation.TOP);
      htmlReport.config().setTheme(Theme.STANDARD);

      extent = new ExtentReports();
      extent.attachReporter(htmlReport);
      extent.setSystemInfo("UserName", "Wojciech Nowak");
  }
	
  @Test
  public void f() {
	  Assert.assertTrue(true);
  }
  
  @Test
  public void g() {
	  throw new SkipException("skip");
  }
  
  @Test
  public void h() {
	  Assert.assertTrue(false);
  }
  
  @AfterMethod
  public void afterMethod() {
	  
  }

  @AfterTest
  public void afterTest() {
	ExtentTest logger;
	logger = extent.createTest("xd") ;
	logger.log(Status.FAIL, MarkupHelper.createLabel ("Nazwa testu - status", ExtentColor.RED));
	ExtentTest logger1;
	logger1 = extent.createTest("xd1") ;
	logger1.log(Status.PASS, MarkupHelper.createLabel ("Nazwa testu - status", ExtentColor.GREEN));
	ExtentTest logger2;
	logger2 = extent.createTest("xd2") ;
	logger2.log(Status.SKIP, MarkupHelper.createLabel ("Nazwa testu - status", ExtentColor.BLUE));
	
	extent.flush();
  }

}
