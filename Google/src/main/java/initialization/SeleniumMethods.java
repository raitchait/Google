package initialization;

import  org.openqa.selenium.By;


public class SeleniumMethods extends Setup {
    public static void main(String[] args) {
       SetupDriver("windows","https://www.ebay.com/","chrome");

        String title = driver.getTitle(); // it gives the title of whatever page is opened
        String expectedTitle = "https://www.ebay.com/";

        if(title.equalsIgnoreCase(expectedTitle)) {
            System.out.println("PassedTitle");
        }else System.out.println("FailedTitle");

        //System.out.println(title);


        driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("Java Books");
        driver.findElement(By.xpath("//*[@id='gh-btn']")).click();



        String actualURL = driver.getCurrentUrl(); // returns the url of the current page
        String expectedURL = "https://www.ebay.com/";

        //System.out.println(actualURL);
        //String expectedURl = expectedURL;


        if(actualURL.equalsIgnoreCase(expectedURL)) {
            System.out.println("Passed");
        }else System.out.println("Failed");


        String pageSource = driver.getPageSource();
        System.out.println(pageSource); // whole page source of that page

        driver.navigate().back(); //it went to that page and comes back to the previous page
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("https://www.yahoo.com"); // it goes to another browser when we have a previous browser setup


        try {
            Thread.sleep(5000);
        }catch(Exception ee){

        }
        driver.manage().deleteAllCookies();// it clears all the memory space added as value in the RAM

        driver.close(); // it will just close the instance of browser
        driver.quit(); // it will quit it fully browser

    }


}

