
public class Hello {

	public static void main(String[] args) {
//		int num = 120;
//		if(num > 0 && num % 2 == 0) {
//			System.out.println("����̸鼭 ¦��");
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
//		System.out.println("ū �� :" + big);
//		
//		if (num1 > num2) {
//			diff = num1 - num2;
//		} else {
//			diff = num2 - num1;
//		}
//		System.out.println("���� :" + diff);
		
		
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
		
		
		//2�� ������� 7�� ������� ����ϰ� ���� ���ϱ�
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
		
		
		//1���� 100���� ��� �� �Ųٷ� ����ϱ�
//		int num = 1;
//		do {
//			System.out.print(num++ + " ");
//		} while(num <= 100);
//		System.out.print("\n");
//		do {
//			System.out.print(--num + " ");
//		} while(num > 1);
		
		
		//5�� ��� �Ǵ� 7�� ����� ���� ���
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
		
		//2~9�� ���
//		for(int dan=2;dan<10;dan++) {
//			for(int unit = 1;unit<10;unit++) {
//				System.out.println(dan + " X " + unit + " = " + dan*unit);
//			}
//			System.out.print("\n");
//		}
		
		
		//4�� ���� ��� ����
//		for(int dan=2;dan<10;dan++) {
//			for(int unit = 1;unit<10;unit++) {
//				if(unit == 4 || dan == 4) {
//					continue;
//				}
//				System.out.println(dan + " X " + unit + " = " + dan*unit);
//			}
//			System.out.print("\n");
//		}
		
		
		//���ϴ� �ڿ� ���ڸ� 3������ ���
		for(int dan=2;dan<10;dan++) {
			for(int unit = 1;unit<4;unit++) {
				System.out.println(dan + " X " + unit + " = " + dan*unit);
			}
			System.out.print("\n");
		}
	}
}
