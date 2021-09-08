import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TesetGlad {

    @Test
public void  twer(){


        open("https://www.google.com/");
        closeWebDriver();
    }
}
