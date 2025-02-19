package Repaso_Array;

public class Ejercicio_4 {
	
	static int num (int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1[] = {2,4,2,4,8};
		
		int num2[] = {1,3,4,6,7};
		
		for (int i = 0; i < num1.length;i++) {
			System.out.println(num(num1[i],num2[i]));
		}

	}

}
