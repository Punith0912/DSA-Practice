package basicMath;

public class ArmStrongNum {

	public static void main(String[] args) {
		
		int num =371;
		
		
		int checkNum = num;
		int armStrongNum=0;
		while(num>0) {
			
			int rem = num%10;
			
			int cube = rem * rem * rem;
			armStrongNum+=cube;
			
			num/=10;
		}
		
		if(armStrongNum == checkNum)
			System.out.println(checkNum + " is a ArmStrongNum " + armStrongNum);
		else
			System.out.println(checkNum + " is not a ArmStrongNum "+ armStrongNum);
	}
}
