package E2E_Tests;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

public class RegresTest {
    @Step("Проверка шаг 1 qweqweqwe")
    public void someLogic(){
        System.out.println("консоль");
    }

    @Test
    void test(){
        someLogic();
    }
}
