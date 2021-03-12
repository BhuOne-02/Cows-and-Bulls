package randomnumber;

import java.util.Arrays;
import java.util.Scanner;

public class cowsandbulls {

	public static void main(String[] args) {
		int bulls;
		int cows;
		// TODO Auto-generated method stub
		int max=9;
		int min=1;
		int k=0;
		int [ ] array =new int[3];
		
		random(max, min, k, array);
		//System.out.println(array[0]+""+array[1]+""+array[2]);
		int n=1;
		while(n != 0) {
			cows=0;
			bulls=0;
	int[ ] array2 =new int[3];
	System.out.println("Enter number: ");
	Scanner scan =new Scanner(System.in);

		int number1=scan.nextInt();
		int b=2;
		while(number1 != 0) {
		int rem = number1 %10;
		array2[b]=rem;
		b--;
		number1 /=10;
		}
		
		
		System.out.println("Your number :"+array2[0]+""+array2[1]+""+array2[2]);
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(array[i]==array2[j]) {
				if(i==j)
					cows++;
				else
					bulls++;
			}
		}
	}
	
	if(Arrays.equals(array, array2)) {
		System.out.println("congrats");
		n=0;
	}
	System.out.println("Cows:"+cows +"    Bulls:" +bulls);
		}
	}

	private static void random(int max, int min, int k, int[] array) {
		while(k<3) {
			int Number =(int)(Math.random() * (max-min+1)+min);
			int count=0;
			for(int i=0;i<3;i++) {
				if(Number ==array[i]) {
					count++;
				}
			}
			if(count==0) {
				array[k]=Number;
				k++;
			}
		}
	}
}
