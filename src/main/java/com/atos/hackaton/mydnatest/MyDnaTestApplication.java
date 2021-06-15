package com.atos.hackaton.mydnatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyDnaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDnaTestApplication.class, args);
	
		ArrayList<String> strs = new ArrayList<String>();
        ArrayList<Double> occurences = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);

        for (int t = 0; t < 6; t++) {
            strs.add(sc.next());
        }
        for (int t = 0; t < 6; t++) {
            occurences.add(sc.nextDouble());
        }
	}

}
