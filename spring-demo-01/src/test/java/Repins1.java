import MyTest1.UserComponent;
import org.junit.jupiter.api.Test;

public class Repins1 {
	@Test
	public void t1(){
		UserComponent userComponent = new UserComponent();
		System.out.println("test"+userComponent.getClass());
	}
}
