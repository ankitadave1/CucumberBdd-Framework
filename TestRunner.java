package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



        @RunWith(Cucumber.class)
        @CucumberOptions(
                features = "C:\\Users\\hetal\\IdeaProjects\\JavaLearning\\" +
                        "CucumberBddFramework\\src\\test\\java\\feature\\Register.feature",
              glue = {"stepdefinitions"},

               dryRun = false,
                format = {"pretty","html:htmlReport","json:json/cucumber.json","junit:junit/cucumber.xml"}
                //  dryRun = false


        )

        public class TestRunner {

        }





