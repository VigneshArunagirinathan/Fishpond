package Maven;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PojoClass1 extends BaseClass{
	public PojoClass1() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[text()='Sign in'])[3]")
	private WebElement sign;
	@FindBy(xpath="(//a[@class='item-middle__image-wrapper'])[9]")
	private WebElement watch;
	
public WebElement getWatch() {
		return watch;
	}
@FindBy(xpath="//input[@type='text']")
private WebElement search;
@FindBy(id="email_address")
private WebElement text;
@FindBy(id="password")
private WebElement pasw;
@FindBy(xpath="//button[@title='Search']")
private WebElement icon;
@FindBy(xpath=("(//a[@class='item-middle__image-wrapper'])[1]"))
private WebElement select;
@FindBy(xpath="//button[text()='Add to Cart']")
private WebElement cart;
@FindBy(xpath="//span[text()='Checkout']")
private WebElement chck;
@FindBy(xpath="//div[@class='fp-header__logo']")
private WebElement back;

public WebElement getBack() {
	return back;
}
public WebElement getChck() {
	return chck;
}
public WebElement getCart() {
	return cart;
}
public WebElement getSelect() {
	return select;
}
public WebElement getSearch() {
	return search;
}
public WebElement getIcon() {
	return icon;
}
public WebElement getSign() {
	return sign;
}
public WebElement getText() {
	return text;
}
public WebElement getPasw() {
	return pasw;
}
}