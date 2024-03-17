package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class Exercise_2 {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Abir");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Arshad");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("abirarshad0@gmail.com");


        WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
        radioButton.click();

        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1718333267");

        driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();



        String OptionToSelect = "English";
        driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("English");
        Thread.sleep(3000);
        List<WebElement> optionList = driver.findElements(By.xpath("//*[@id=\"subjectsContainer\"]/div"));
        for (WebElement ele : optionList) {
            String currentOption = ele.getText();

            if (currentOption.contains(OptionToSelect)) {
                ele.click();
                break;
            }
        }
        Thread.sleep(3000);

        WebElement checkbox= driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        checkbox.click();

        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Mohakhali,Dhaka");

            WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[2]/div"));
            Select select = new Select(dropdown);
            select.selectByVisibleText("Option 1");

        WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"city\"]/div"));
        Select select1 = new Select(dropdown);
        select.selectByVisibleText("Option 1");

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        }

           }












