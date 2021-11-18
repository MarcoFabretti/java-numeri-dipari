package org.generation.italy.cicli;
import java.util.Scanner;
public class StampaNumeriDispari {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("quanti numeri vuoi nell'array?");
		int n=a.nextInt();
		int numeri[];
		numeri = new int [n];
		for(int i = 0; i < n; i++) {
			numeri[i]=(int)(Math.random()*99);
		}
		
		
		for(int i = 0; i < n; i++) {
			if((numeri[i]%2)!=0)
				System.out.println("il numero "+numeri[i]+" è disparo, in posizione: " + i);
		}
		

	}

}
