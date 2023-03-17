package Q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		QueueX mainQueue = new QueueX(5);
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		
		for(i=0;i<5;i++) {
			System.out.println("Enter Transtaction ID "+(i+1)+": ");
			int queue = scanner.nextInt();
			mainQueue.Insert(queue);
			
		}
		
		
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		while(!mainQueue.isEmpty()) {
			
			int val = mainQueue.remove();
			
			if(val%2==0) {
				evenQueue.Insert(val);
			}
			else {
				oddQueue.Insert(val);
			}
			
		}
		
		System.out.println("PC1");
		while(!evenQueue.isEmpty()) {
			int even = evenQueue.remove();
			System.out.println("Transaction "+even);			
		}
		
		System.out.println("PC2");
		while(!oddQueue.isEmpty()) {
			int odd = oddQueue.remove();
			System.out.println("Transaction "+odd);			
		}
		


	}

}
