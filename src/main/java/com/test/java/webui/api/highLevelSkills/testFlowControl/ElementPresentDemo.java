package com.test.java.webui.api.highLevelSkills.testFlowControl;

import com.test.java.webui.api.base.AbstractAccessBaidu;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by beigui on 2016/4/5.
 * 功能：自己封装了一个方法，用于立即判断元素是否存在
 */
public class ElementPresentDemo extends AbstractAccessBaidu {
    @Test
    public void isElementPresentTest() {
        driver.findElement(By.id("kw")).sendKeys("selenium");
        //判断搜索按钮是否存在
        if (isElementPresent(By.id("su1"))) {
            //点击按钮
            driver.findElement(By.id("su")).click();
        } else {
            Assert.fail("元素不存在");
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
