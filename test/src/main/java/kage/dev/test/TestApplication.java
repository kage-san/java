package kage.dev.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import kage.dev.test.component.ComponentBase;

/*
 * テストアプリケーション
 */
@SpringBootApplication
public class TestApplication {
	
	/*
	 * Main.
	 */
	public static void main(String[] args) {
		System.exit(execute(args));
	}
	
	/*
	 * 実行.
	 */
	public static int execute(String[] args) {
		
		// SpringApplication実行
		ApplicationContext context = new SpringApplication(TestApplication.class).run(args);
		ComponentBase component = context.getBean(args[0], ComponentBase.class);
		
		// コンポーネント呼び出し
		return component.call(args);
	}

}
