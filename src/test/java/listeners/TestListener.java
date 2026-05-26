package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseClass;
import utils.ScreenshotUtil;

public class TestListener
        extends BaseClass
        implements ITestListener {

    @Override
    public void onTestFailure(
            ITestResult result) {

        System.out.println(
                "TEST FAILED");

        ScreenshotUtil.captureScreenshot(
                driver,
                result.getName());
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

        System.out.println(
                "TEST PASSED");
    }

    @Override
    public void onFinish(
            ITestContext context) {

        System.out.println(
                "EXECUTION COMPLETED");
    }
}