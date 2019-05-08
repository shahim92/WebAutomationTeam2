package regression;

import base.CommonAPI;

public class HomePage extends CommonAPI {

    public void clickAccount() {
        //click on account
        System.out.println(driver.getCurrentUrl());
    }

    public void writeUsername(String userName) {
        //user
        //parameterize
    }

    public void writePass() {
        //pass
        //parameterize
    }
}
