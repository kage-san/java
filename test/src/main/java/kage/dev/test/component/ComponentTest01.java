package kage.dev.test.component;

import org.springframework.stereotype.Component;

@Component("Test01")
public class ComponentTest01 extends ComponentBase{
	
	@Override
	public int doComponent() {
		System.out.println("Hello World!!");
		return 0;
	}

}
