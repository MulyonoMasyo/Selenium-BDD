package BelajarCucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/belajarBDD/GoogleSearch.feature",
		glue= {"BelajarCucumber"}
)
		
public class GoogleSearchTest {
	
}
