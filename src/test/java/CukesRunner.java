import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(glue = "classpath:steps", plugin = {"pretty"})
public class CukesRunner {}
