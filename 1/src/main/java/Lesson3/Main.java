package Lesson3;

import Lesson4.TriangleFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("==headless");

        TriangleFunction triangleFunction = new TriangleFunction(3, 4, 5);
        System.out.println("ОНООООООООО");
        triangleFunction.triangleArea();
        System.out.println("ОНООООООООО");


       WebDriver driver = new ChromeDriver();
// 1 сценарий - проверка фильтра новинок в катологе
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().fullscreen();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[@title='Women']")).click();
        driver.manage().window().fullscreen();
        Thread.sleep(5000);

        driver.findElement(By.id("layered_condition_new")).click();
        driver.manage().window().fullscreen();
        Thread.sleep(10000);

        Thread.sleep(5000);
        driver.quit();

// 2 сценарий - проверка фильтра доставки товара до 2 дней

        WebDriver driver1 = new ChromeDriver();

        driver1.get("https://www.ozon.ru/category/audiotehnika-15543/");
        driver1.manage().window().fullscreen();


        driver1.findElement(By.xpath("//span[.='До 2 дней']")).click();
        driver1.manage().window().fullscreen();

        Thread.sleep(5000);
        driver1.quit();
//







    }
}
