package stepdefinitions;

import io.cucumber.java.en.*;
import pages.AutomationPage;

public class AutomationExerciseStepdefinitions {

    AutomationPage automationPage = new AutomationPage();

    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {

        automationPage.signUpLinki.click();

    }


    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {

    }

    @Given("user kisiel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisiel_bilgilerini_ve_iletisim_bilgilerini_girer() {

    }

    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {

    }

    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {

    }


    @And("user Create and account bolumune email adresi girer")
    public void userCreateAndAccountBolumuneEmailAdresiGirer() {
    }
}

// 2:05