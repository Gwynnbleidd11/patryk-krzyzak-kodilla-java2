package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private final static String XPATH_COOKIES = "//div[contains(@class, '_4-i2 _pig _al5h _al7j _50f4')]/div[4]/button[2]";
    private final static String XPATH_ACCOUNT_CREATION = "//form[contains(@class, '_9vtf')]/div[5]/a";
    private final static String XPATH_DAY = "//form[@name = 'reg' and @id = 'reg']" +
            "/div/div[5]/div[2]/span/span/select[@id = 'day']";
    private final static String XPATH_MONTH = "//form[@name = 'reg' and @id = 'reg']" +
            "/div/div[5]/div[2]/span/span/select[@id = 'month']";
    private final static String XPATH_YEAR = "//form[@name = 'reg' and @id = 'reg']" +
            "/div/div[5]/div[2]/span/span/select[@id = 'year']";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_ACCOUNT_CREATION)).click();

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByValue("11");

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("11");

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1986");
    }
}
