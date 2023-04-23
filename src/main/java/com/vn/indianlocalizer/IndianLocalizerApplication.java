package com.vn.indianlocalizer;

import com.vn.indianlocalizer.localizer.IndianLocalizer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

@CrossOrigin
@SpringBootApplication
public class IndianLocalizerApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(IndianLocalizerApplication.class, args);
//		BufferedReader reader = new BufferedReader(
//				new InputStreamReader(System.in));
//		IndianLocalizer indianLocalizer = new IndianLocalizer();
//
//		System.out.println("Enter your name : \n");
//		String name = reader.readLine().toString();
//		String choice ="";
//		while(!choice.equals("4")){
//			System.out.println("Select a language : ");
//			System.out.println("1. Punjabi\n2. Marathi\n3.Kannada\n4.Exit");
//			choice = reader.readLine();
//			switch(choice){
//				case "1":
//					String language ="pun";
//					Locale punjabi = indianLocalizer.getProvidedLocales().stream().filter(lang ->
//							lang.getLanguage().equals(language)).findFirst().orElse(null);
//					String greet = indianLocalizer.getTranslation("HELLO",punjabi) + ", " + name;
//					System.out.println(greet);
//			}
//		}


	}

}
