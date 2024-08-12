package com.Target.genericUtility.seleniumUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriver_Utility {

	//implicit wait
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	//explicit wait
	public void waitForElementToBeVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitForElementToBeClickable(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitForElementToBeSelected(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	//maximize
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	//minimize
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	//fullscreen
	public void fullScreen(WebDriver driver)
	{
		driver.manage().window().fullscreen();
	}
	//window handles
	public void windowsHandle(WebDriver driver,String PartialTitle)
	{
		
		Set<String> allWinIds = driver.getWindowHandles();
		for(String winID: allWinIds)
		{
			String actTitle= driver.switchTo().window(winID).getTitle();
			if(actTitle.contains(PartialTitle))
			{
				break;
			}
		}
	}
	public void windowsHandleOnURL(WebDriver driver,String expPartialURL)
	{
		Set<String> allWinIds = driver.getWindowHandles();
		for(String winID: allWinIds)
		{
			String actUrl= driver.switchTo().window(winID).getCurrentUrl();
			if(actUrl.contains(expPartialURL))
			{
				break;
			}
		}
	}
	//switch Frames
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String name)
	{
		driver.switchTo().frame(name);
	}
	public void switchToFrame(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void switchToParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	public void switchToFrameWithDafaultContent(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	//alert
	public void switchToAlertAndAccept(WebDriver driver) 
	{
	    driver.switchTo().alert().accept();	
	}
	public void switchToAlertAndCancel(WebDriver driver) 
	{
	    driver.switchTo().alert().dismiss();	
	}
	public String getAlertText(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	public void switchToAlertAndSendkeys(WebDriver driver,String text) 
	{
		driver.switchTo().alert().sendKeys(text);
	}
	//dropdown
	public void handleDropDown(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
		
	}
	public void handleDropDown(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void handleDropDown(String text ,WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	//Actions
	public void mouseOverAction(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void rightClickAction(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	public void doubleClickAction(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	public void dragAndDropAction(WebDriver driver,WebElement srcEle,WebElement destEle)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(srcEle, destEle).perform();
	}
	public void scrollToElement(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}
	public void sendKeys(WebDriver driver,WebElement element,String text)
	{
		Actions act = new Actions(driver);
		act.sendKeys(element, text);
	}
	//screenShot
	public void getScreenShot(WebDriver driver,String screenShotName) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots"+screenShotName+".png");
		FileHandler.copy(src, dest);
		//return dest.getAbsolutePath();
	}
	//JSExecutor
	public void scrollUntilElementToBeVisible(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int y= element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")");
	}
	public void scrollUpAction(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500);"); // java script snippet
		
	}
	public void scrollDownAction(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);"); // java script snippet
		
	}
	
	
}
