package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	static ObjectOutputStream oos = null;
	public static void main(String [] args){
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		try{
			oos = new ObjectOutputStream(new FileOutputStream("PrimeNumbers.bin"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			oos.writeObject(primes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
/*		
		int knownPrimes[][] = {{2,3,5,7,11,13,17,19,23,29},
					 		   {31,37,41,43,47,53,59,61,67,71},
					 		   {73,79,83,89,97,101,103,107,109,113},
					 		   {127,131,137,139,149,151,157,163,167,173},
					 		   {179,181,191,193,197,199,211,223,227,229},
					 		   {233,239,241,251,257,263,269,271,277,281},
					 		   {283,293,307,311,313,317,331,337,347,349},
					 		   {353,359,367,373,379,383,389,397,401,409},
					 		   {419,421,431,433,439,443,449,457,461,463},
					 		   {467,479,487,491,499,503,509,521,523,541}};
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> primes = new ArrayList(0);
		for(int i = 0; i < knownPrimes.length; i++ ){
			for(int j = 0; j < knownPrimes[i].length; j++ ){
				primes.add(knownPrimes[i][j]);
			}
		}
		
		do{
			System.out.println("input a number to calculate primeness below 547");
			int questionablePrime = s.nextInt();
			
			for(int i = 0; i < primes.size() + 1; i++){
				int mod = questionablePrime % primes.get(i);
				if(questionablePrime == 2){
					System.out.println("your number is the only even prime");
					break;
				}
				else if(mod == 0){
					System.out.println("your number is not prime. determined here:" + primes.get(i));
					break;
				}
				else if(mod != 0 && primes.get(i) > Math.sqrt(questionablePrime)){
					System.out.println("your number is prime. determined here:" + primes.get(i));
					break;
				}
			}
			
			System.out.println("cancel program, type 42. otherwise, type random numbers");
		
		}while(s.nextInt() != 42);
		
		
		s.close();
*/
	}
}
/*
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class Main extends Application{
*/
/*Button btn = new Button("Hi");

public static void main(String []args){
	Application.launch(args);
}

@Override
public void start(Stage arg0) throws Exception {
	Stage stage = new Stage();
			
	MyPane pane = new MyPane();
	pane.setPadding(new Insets(0));
	
	Scene scene = new Scene(pane, 300, 300);
	stage.setScene(scene);
	stage.show();
	

}
class MyPane extends StackPane{
	public MyPane(){
		btn.setStyle(
                "-fx-background-radius: 800em; " +
                "-fx-min-width: 30px; " +
                "-fx-min-height: 30px; " +
                "-fx-max-width: 30px; " +
                "-fx-max-height: 30px;" + 
                "-fx-body-color: #FFCD00;" + 
                "-fx-background-color: #FF0000;"
                
        );
		
		getChildren().add(btn);
	}
}
*/



