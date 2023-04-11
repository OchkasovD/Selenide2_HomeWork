package com.github;

import com.codeborne.selenide.Selectors;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestSolutions extends TestBase {
    @org.junit.jupiter.api.Test
    void findEnterprises() {
        open("https://github.com/");
        $(Selectors.byTagAndText("button", "Solutions")).hover();
        $(Selectors.byTagAndText("a", "Enterprise")).click();
        $("h4.h6-mktg").shouldHave(text("GitHub for enterprises"));

    }
}
