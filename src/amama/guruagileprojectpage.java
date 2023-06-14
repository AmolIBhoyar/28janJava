package amama;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guruagileprojectpage
{
	@FindBy(xpath="//a[text()='Agile Project']")private WebElement agile;
	@FindBy(xpath="//div[@aria-label='Close ad']")private WebElement close;
	
	public guruagileprojectpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickguruagileprojectpageagile()
	{
		agile.click();
	}
	public void Clickguruagileprojectpageclose()
	{
		close.click();
	}
	

}
