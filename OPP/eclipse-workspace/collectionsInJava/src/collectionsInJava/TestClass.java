package collectionsInJava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
		ProcessedFood processedFood1 = new ProcessedFood("Spaghetti Napoli");
		BasicFood spaghetti = new BasicFood("Spaghetti", 100);
		ProcessedFood processedFood2 = new ProcessedFood("Tomatensauce");
		BasicFood tomate = new BasicFood("Tomate", 10);
		BasicFood paprika = new BasicFood("Paprika", 12);
		BasicFood salz = new BasicFood("Salz", 0);
		BasicFood pfeffer = new BasicFood("Pfeffer", 2);
		BasicFood wasser = new BasicFood("Wasser", 0);
		
		List<Food> ingredients2 = new ArrayList<>();
		ingredients2.add(tomate);		
		ingredients2.add(paprika);	
		ingredients2.add(salz);	
		ingredients2.add(pfeffer);	
		ingredients2.add(wasser);	
		processedFood2.setIngredients(ingredients2);
		List<Food> ingredients1 = new ArrayList<>();
		ingredients1.add(spaghetti);
		ingredients1.add(processedFood2);
		
		processedFood1.setIngredients(ingredients1);
		
//		System.out.println(tomate.getCalories());
		
	//	System.out.println(processedFood1.toString());
		
//		Random random = new Random();
//		Stream.generate(random::nextInt).forEach(System.out::println);
		var random = new Random();
		
		long amount = Stream.generate(()-> random.nextBoolean())
				.limit(100).filter(x -> x)
				.count();
		System.out.println(amount);
		OptionalDouble x = IntStream.iterate(0, i -> i + 1).limit(100).average();
		x.ifPresent(System.out::println);
		
		try {
		//	FileOutputStream fout = new FileOutputStream("test.txt");
			FileInputStream fin = new FileInputStream("test.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while ((i=bin.read()) != -1) {
				System.out.print((char)i);
			}
//			fout.write(65);
//			BufferedOutputStream bout = new BufferedOutputStream(fout);
//			String s = "Just testing how it works.";
//			byte b[] = s.getBytes();
//			fout.write(b);
//			bout.flush();
//			bout.close();
//			fout.close();
			bin.close();
			fin.close();
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}