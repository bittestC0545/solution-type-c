package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static int gugudan = 10;
	public static int randomNumber = new Random().nextInt(gugudan);
	
	public static void main(String[] args) {
		double time = 0.0;
		int count =0;
		Scanner scanner = new Scanner(System.in);
		for(int j=0;j<2;j++) {	
			for(int i=1;i<=9;i++) {
				int gob = randomNumber * i;
				System.out.print(randomNumber+ "단 \n" + i + " x " + randomNumber + "= ");
				time = System.currentTimeMillis();
				int comfile = scanner.nextInt();
				if(gob == comfile) {
					System.out.println("정답" + " 걸린시간 : " + time);
					count++;
				}
				else {
					System.out.println("오답");
				}
			
			}
		}

	}
}