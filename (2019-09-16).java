
public class Hello {

	public static void main(String[] args) {
		
		//����� 72�� �� �ϳ��� ���
//		int cnt = 0;
//		for(int dan = 1; dan < 10; dan++) {
//			if(cnt == 1) {
//				break;
//			}
//			for(int add = 1; add < 10; add++) {
//				if(dan * add == 72) {
//					System.out.println(dan + " X " + add +  " = " + dan * add);
//					cnt++;
//					break;
//				}
//			}
//		}
		
		
		//AB + BA�� ������ ���ϱ�
		/*int ab;
		int ba;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				ab = (10 * i) + j;
				ba = (10 * j) + i;
				if(ab + ba == 99) {
					System.out.println("A : " + i + "    B : " + j);
				}
			}
		}*/
		
		
		
		//��Ģ����
		//add(3, 5);
		
		
		//�Ҽ����� �ƴ��� �Ǻ�
		System.out.println(sosu(3));
	}
	public static void add(int num1, int num2) { //��Ģ����
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
		
	}
	public static boolean sosu(int input) { //�Ҽ����� �ƴ��� �Ǻ�
		int cnt = 0;
		for(int i=1;i<=input;i++) {
			if(input % i == 0) {
				cnt++;
			}
		}
		if(cnt == 2 || cnt == 1) {
			return true;
		}
		else {
			return false;
		}
	}
}
