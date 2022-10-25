package kage.dev.test.component;

import org.springframework.stereotype.Component;

@Component("Test02")
public class ComponentTest02 extends ComponentBase{
	
	@Override
	public int doComponent() {
		System.out.println("Thank you, Good bye!!");
		return 0;
	}

}
