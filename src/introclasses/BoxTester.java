package introclasses;

public class BoxTester {

	public static void main(String[] args) {
		double volumeofBox;
		// Named constants for firstBox object
		final double FIRSTBOX_WIDTH=10;
		final double FIRSTBOX_HEIGHT=20;
		final double FIRSTBOX_DEPTH=30;
		
		// Named constants for secondBox object
		final double SECONDBOX_WIDTH=-3;
		final double SECONDBOX_HEIGHT=6;
		final double SECONDBOX_DEPTH=9;
		
		
		volumeofBox=FIRSTBOX_WIDTH*FIRSTBOX_HEIGHT*FIRSTBOX_DEPTH;

		System.out.println("Volume of first box "+volumeofBox);
		
		volumeofBox=SECONDBOX_WIDTH*SECONDBOX_HEIGHT*SECONDBOX_DEPTH;
		
		System.out.println("Volume of second box "+volumeofBox);

	}

}
