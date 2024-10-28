package controlstatements;

public class nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=2;
		switch(count) {
		case 1:
			int target=1;
			switch(target) {
			case 0:
				System.out.println("target is zero");
				break;
			case 1:
				System.out.println("target is one");
				break;
			}
		case 2:
			int point=1;
			switch(point) {
			case 0:
				System.out.println("point is zero");
				break;
			case 1:
				System.out.println("point is one");
				break;
				default:
					System.out.println("point not valid");
					break;
			}
			default:
				System.out.println("not valid count");
			break;

	}
	}

}
