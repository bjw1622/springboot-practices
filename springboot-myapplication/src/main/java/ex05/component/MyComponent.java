package ex05.component;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyComponent implements ApplicationRunner {
	public void printHelloWorld() {
		System.out.println("Hello World");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("test");
	}
}