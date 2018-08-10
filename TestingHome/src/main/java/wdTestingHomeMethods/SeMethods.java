package wdTestingHomeMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import testingHomeUtils.Report;



public class SeMethods extends Report implements WdMethods {
	public RemoteWebDriver driver;

	public void StartApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Driver not found");
		throw new RuntimeException();
		}
		
	}

	public WebElement LocateElement(String locator, String locValue) {
		try {
			switch(locator){
			case"id":return driver.findElementById(locValue);
			case"name":return driver.findElementByName(locValue);
			case"class":return driver.findElementByClassName(locValue);
			case"xpath":return driver.findElementByXPath(locValue);
			case"linkText":return driver.findElementByLinkText(locValue);
			}
		} catch (NoSuchElementException e) {
			reportStep("The element with locator "+locator+" not found.","FAIL");
			e.printStackTrace();
		}catch (Exception e) {
			reportStep("Unknown exception occured while finding "+locator+" with the value "+locValue, "FAIL");
		}
		return null;
	}

	public WebElement LocateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public void type(WebElement ele, String Data){
		try {
			ele.clear();
			ele.sendKeys(Data);
			//System.out.println("The data is successfully loacted"+ele);
			takesnap();
			reportStep("The data is successfully loacted\"+ele", "PASS");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("The data is coud'nt successfully loacted\"+ele", "FAIL");
		}
		
	}

	public void click(WebElement ele) {
	try {
		ele.click();
		System.out.println("The Element is clicked successfully");
		takesnap();
		reportStep("The Element is clicked successfully", "PASS");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		reportStep("The Element is could'nt clicked successfully", "FAIL");
	}
		
	}

	public void ClickWithoutSnap(WebElement ele) {
		ele.click();
		System.out.println("The Element is clicked successfully");
		
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	public void SelectDropDownUsingText(WebElement ele, String Value) {
		// TODO Auto-generated method stub
		
	}

	public void SelectDropDownUsingIndex(WebElement ele, int Index) {
		// TODO Auto-generated method stub
		
	}

	public boolean varifyTitle(String ExpectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String ExpectedValue) {
		// TODO Auto-generated method stub
		
	}

	public void varifyPartialText(WebElement ele, String ExpectedValue) {
		// TODO Auto-generated method stub
		
	}

	public void varifyExtactAttributes(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void varifyPartialAttributes(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void varifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void varifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	public String getAlertText() {
		driver.switchTo().alert().getText();
		return null;
	}

	
	int i= 1;
	public void takesnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dec = new File("./snaps/guru"+i+".png");
		try {
			FileUtils.copyFile(src, dec);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

	public void closebrowser() {
		// TODO Auto-generated method stub
		
	}

	public void closeAllbrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		return 0;
	}

}
