package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static void captureScreenshot(
            WebDriver driver,
            String testName) {

        try {

            File srcFile =
                    ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            String path =
                    System.getProperty("user.dir")
                    + "\\Screenshots\\"
                    + testName + ".png";

            File destFile =
                    new File(path);

            FileUtils.copyFile(srcFile, destFile);

            System.out.println(
                    "Screenshot saved successfully");

            System.out.println(path);

        } catch (IOException e) {

            System.out.println(
                    "Screenshot failed");

            e.printStackTrace();
        }
    }
}