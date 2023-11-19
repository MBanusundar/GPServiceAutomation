package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createAppointment {
    WebDriver driver;
    public static By clickOnDoctors = By.xpath("//a[text()=\"SEE A DOCTOR \"]/span");
    public static By selectTime = By.xpath("//button[@class = 'btn slot-item-btn'][1]");
    public static By complaint = By.id("presentingComplaint");
    public static By postalcode = By.name("postcode");
    public static By findPharmacy = By.xpath("//button[text()=\" Find Pharmacies \"]");
    public static By selectPharmacy = By.xpath("//*[text()=\"Select a pharmacy\"]/parent::div/ul/li[1]");
    public static By confirmAppointment = By.xpath("//button[text()=\" Confirm Appointment \"]");
        public static By verifyMessage = By.xpath("//div/p[contains(text(),\"Please check your order details below\")]");



}
