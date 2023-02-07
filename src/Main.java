import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		
		for(int i=0; i<b; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			
			a = a - (price * num);
		}
		
		if(a == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
