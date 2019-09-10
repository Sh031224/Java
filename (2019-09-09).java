
public class Hello {

	public static void main(String[] args) {
//		int num = 120;
//		if(num > 0 && num % 2 == 0) {
//			System.out.println("양수이면서 짝수");
//		}
		
		
//		int num1 = 50;
//		int num2 = 100;
//		int big;
//		int diff;
//		
//		if (num1 > num2) {
//			big = num1;
//		} else {
//			big = num2;
//		}
//		System.out.println("큰 수 :" + big);
//		
//		if (num1 > num2) {
//			diff = num1 - num2;
//		} else {
//			diff = num2 - num1;
//		}
//		System.out.println("절댓값 :" + diff);
		
		
//		int n = 3;
//		if (n == 1) {
//			System.out.println("Simple Java");
//			System.out.println("Funny Java");
//			System.out.println("Fantastic Java");
//			System.out.println("The best programming language");
//		} else if (n == 2) {
//			System.out.println("Funny Java");
//			System.out.println("Fantastic Java");
//			System.out.println("The best programming language");
//		} else if (n == 3) {
//			System.out.println("Fantastic Java");
//			System.out.println("The best programming language");
//		} else {
//			System.out.println("The best programming language");
//		}
//		System.out.println("Do you like Java?");
		
		
		//2의 배수이자 7의 배수들을 출력하고 합을 구하기
//		int num = 1;
//		int sum = 0;
//		while (num <= 100) {
//			if (num % 2 == 0 && num % 7 == 0) {
//				System.out.print(num + " ");
//				sum += num;
//			}
//			num ++;
//		}
//		System.out.println("\n" + sum);
		
		
		//1부터 100까지 출력 후 거꾸로 출력하기
//		int num = 1;
//		do {
//			System.out.print(num++ + " ");
//		} while(num <= 100);
//		System.out.print("\n");
//		do {
//			System.out.print(--num + " ");
//		} while(num > 1);
		
		
		//5의 배수 또는 7의 배수의 개수 출력
//		int num = 0;
//		int count = 0;
//		while((num++) < 100) {
//			if(((num % 5) != 0) && ((num % 7) != 0)) {
//				continue;
//			}
//			System.out.println(num);
//			count++;
//		}
//		System.out.println("count: " + count);
		
		//2~9단 출력
//		for(int dan=2;dan<10;dan++) {
//			for(int unit = 1;unit<10;unit++) {
//				System.out.println(dan + " X " + unit + " = " + dan*unit);
//			}
//			System.out.print("\n");
//		}
		
		
		//4가 들어가는 계산 제외
//		for(int dan=2;dan<10;dan++) {
//			for(int unit = 1;unit<10;unit++) {
//				if(unit == 4 || dan == 4) {
//					continue;
//				}
//				System.out.println(dan + " X " + unit + " = " + dan*unit);
//			}
//			System.out.print("\n");
//		}
		
		
		//곱하는 뒤에 숫자를 3까지만 출력
		for(int dan=2;dan<10;dan++) {
			for(int unit = 1;unit<4;unit++) {
				System.out.println(dan + " X " + unit + " = " + dan*unit);
			}
			System.out.print("\n");
		}
	}
}
