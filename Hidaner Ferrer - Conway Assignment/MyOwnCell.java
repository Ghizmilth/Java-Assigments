/**
Program created and submitted by Hidaner Ferrer
*/

public class MyOwnCell extends AbstractCell{

  public MyOwnCell(int r, int c, ConwayWorld w){
    super(r, c, w);
  }

  	public boolean willBeAliveInNextGeneration() {
  		int nc = neighborCount();

  		if (getIsAlive()) {
  			return nc == 2 || nc == 3 ;
  		} else {
  			return nc == 3;
  		}
  	}

  	public AbstractCell cellForNextGeneration() {
  		ConwayCell next = new ConwayCell(getRow(), getColumn(), world);

  		next.setIsAlive(willBeAliveInNextGeneration());

  		return next;
  	}

  	public int neighborCount() {
  		int count = 0;

  		int row = getRow();
  		int column = getColumn();

      for (int dr = -1; dr < row; dr++) {
  			for (int dc = -1; dc < column; dc++) {
  				if (world.isAlive(row + dr, column + dc)) {
  					count++;
  				}
  			}
  		}

  		return count;
  	}

  

}
