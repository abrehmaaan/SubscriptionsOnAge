
public class Problem2 {
	public static void main(String[]args) {
		int age = 20;
		boolean vip = true;
		boolean accompanyingPerson = true;
		if(age>=18) {
			System.out.println("Green Wirstband");
		}
		else if(age<18 && age>=16) {
			System.out.println("Yellow Ribbon (You can only consume light alcoholic beverages).");
		}
		else if(age<16 && age>=4) {
			if(accompanyingPerson) {
				System.out.println("Red Wirstband");
			}
		}
		else {
			System.out.println("You are not allowed to enter");
			System.exit(0);
		}
		if(vip) {
			System.out.println("Golden Ribbon (You can go to backstage area).");
		}
	}
}
