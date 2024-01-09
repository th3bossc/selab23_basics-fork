package payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayrollApplication {

	public static void main(String... args) {
		System.out.println("Hello World! but changed");
		SpringApplication.run(PayrollApplication.class, args);
	}
}
