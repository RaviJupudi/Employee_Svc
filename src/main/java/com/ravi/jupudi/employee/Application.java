package com.ravi.jupudi.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Ravi Jupudi
 *
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println(" _________________________________  \n" +
        		" |    _____   _____   ____   ______          | \n" +
        		" |   |  ___| |     \\/     | |   _  \\        | \n" +
        		" |===| |___  |  |\\   / |  | |  |_| || ====== | \n" +
        		" |   |  ___| |  | |  | |  | |   ___//        | \n" +
        		" |===| |___  |  | |  | |  | |  |      ====== | \n" +
        		" |   |_____| |__| \\_/  |__| |__|      _______| \n" +
        		" |                                    | \n" +
        		" |____________________________________| \n" +
        		" |    Employee Service  -  (v1.0.0)   | \n" +
        		" |____________________________________| \n" +
        		" |    Powered by Ravi Jupudi          | \n" +
        		" |____________________________________| \n");
	}
}
