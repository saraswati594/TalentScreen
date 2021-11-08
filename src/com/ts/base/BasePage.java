package com.ts.base;

import com.ts.utils.web.PageDriver;
import org.apache.log4j.Logger;

/**
 * Created by svelupula on 8/14/2015.
 */
public abstract class BasePage {

    public Logger _logger;
    public PageDriver driver;

    public BasePage(PageDriver driver) {
        _logger = Logger.getLogger(BaseTest.class);
        this.driver = driver;
    }
}
