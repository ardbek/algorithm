
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt(); // 0 0 1
		int num2 = sc.nextInt(); // 0 1 0 
		int num3 = sc.nextInt(); // 1 0 0
		int result = 0;
		
		// 세 숫자가 모두 같은경우 
		if(num1 == num2 && num2 == num3) {
			result = 10000+(num1*1000);
		}
		// 두개의 숫자가 같고, 한개가 다른 경우 
		 else if((num1 == num2 && num2 != num3)){
			result = 1000+(num1*100);
		}else if(num1 == num3 && num2 != num1){
			result = 1000+(num1*100);
		}else if(num2 == num3 && num1 != num2) {
			result = 1000+(num2*100);
		}
		// 세개의 숫자가 모두 다른경우 
		else if(num1 != num2 && num2 != num3 && num1 != num3) {
			
			// num1이 제일 큰 숫자인경우 
			if(num1> num2 && num1 > num3) {
				result = num1*100;
			}
			// num2가 제일 큰 숫자인경우
			else if(num2 > num1 && num2 > num3) {
				result = num2*100;
			}
			// num3가 제일 큰 숫자인경우
			else if(num3 > num1 && num3 > num2) {
				result = num3*100;
			}
		}
		System.out.println(result);
	}
}
