package gluecode;

import org.openqa.selenium.remote.RemoteWebDriver;//hi

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.GooglePage;

public class Shared
{
	//declare common objects
	public RemoteWebDriver driver;
	public GooglePage obj;
	public Scenario s; //to customize results file
	
	@Before
	public void method(Scenario x)
	{
		s=x; //define scenario object to a scenario, which is coming into execution for next
	}
}
