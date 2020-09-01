package demo.stepdefs;

import com.beeb.myspringboot.MyspringbootApplication;
import com.beeb.myspringboot.model.User;
import com.beeb.myspringboot.service.UserService;
import cucumber.api.java8.En;
import demo.CucumberSpringApplicationTests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = CucumberSpringApplicationTests.class)
@ContextConfiguration(classes = MyspringbootApplication.class)
public class FooStepDefinition implements En {

	@Autowired
	private UserService userService;

	public FooStepDefinition() {
		Given("one", () -> {
			User user=userService.getOne(17);
			System.out.println(user.getName());
		});
		Then("two",()->{
			System.out.println("finish");
		});

	}

}
