/**
Program submitted by Hidaner Ferrer
*/

public class GridWriterProgram {

	public static void main(String[] args) {
		GridWriter gw = new GridWriter(40, 50);

		gw.add(new MyCircle(10, 10, 9));
		gw.add(new MyRectangle(25, 25, 20, 15));

		GridItem i = gw.get(1);


		gw.display();
	}

}
