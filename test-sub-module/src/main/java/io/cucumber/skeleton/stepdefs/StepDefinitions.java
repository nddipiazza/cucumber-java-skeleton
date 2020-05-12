package io.cucumber.skeleton.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.skeleton.Belly;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
}
