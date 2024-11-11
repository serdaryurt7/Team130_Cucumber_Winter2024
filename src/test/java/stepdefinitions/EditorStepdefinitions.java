package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.dnd.DragGestureEvent;

public class EditorStepdefinitions {

    EditorPage editorPage = new EditorPage();
    String firstName;

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButonu.click();

    }

    @Then("tum bilgileri girer")
    public void tum_bilgileri_girer() {
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        firstName = faker.name().firstName();
        ReusableMethods.bekle(1);
        actions.sendKeys(firstName)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().title())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys("-")
                .sendKeys(Keys.TAB)
                .sendKeys("2024-02-10")
                .sendKeys(Keys.TAB)
                .sendKeys("45000")
                .perform();

        ReusableMethods.bekle(1);

    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.createButonu.click();

    }

    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
        editorPage.searchKutusu.sendKeys(firstName);

    }

    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {
        String tablodakiIlkIsimSoyisim = editorPage.ilkIsimElementi.getText();
        Assert.assertTrue(tablodakiIlkIsimSoyisim.contains(firstName));
    }

}
