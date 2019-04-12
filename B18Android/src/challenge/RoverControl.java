package challenge;

class Point{
	public int x;
	public int y;
	public Point(int x,int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
}


public class RoverControl {
	
	//left:i:keep still j:-1
	public static Point goLeft(Point curPos) {
		//0 means roverPos[0].length
		if (curPos.y == 0) {
			//stay original Point
			System.out.println("You've reached Left Boundary, So I Can't move Left.\n");
			return curPos;
		}else {
			Point ans = curPos;
			//change index
			//record into ans return it back to user.
			ans.y = ans.y - 1;
			return ans;
		}
		//update initialLocation
		
	}
	//right:i:keep still j:+1
	public static Point goRight(Point curPos) {
		if (curPos.y == 3) {
			//stay original Point
			System.out.println("You've reached Right Boundary, So I Can't move Right.\n");
			return curPos;
		}else {
			Point ans = curPos;
			//change index
			//record into ans return it back to user.
			ans.y = ans.y + 1;
			return ans;
		}
	}
	//up:i:-1 j:keep still
	public static Point goUp(Point curPos) {
		if (curPos.x == 0) {
			//stay original Point
			System.out.println("You've reached Upper Boundary, So I Can't move Up.\n");
			return curPos;
		}else {
			Point ans = curPos;
			//change index
			//record into ans return it back to user.
			ans.x = ans.x - 1;
			return ans;
		}
	}
	//down:i:+1 j:keep still
	public static Point goDown(Point curPos) {
		if (curPos.x == 3) {
			//stay original Point
			System.out.println("You've reached Lower Boundary, So I Can't move Down.\n");
			return curPos;
		}else {
			Point ans = curPos;
			//change index
			//record into ans return it back to user.
			ans.x = ans.x + 1;
			return ans;
		}
	}

	

	public static void main(String[] args) {
		//create square matrix
		int[][] roverPos = new int[4][4];
		int startP = 1;
		for (int i = 0; i < roverPos.length; i++) {
			for (int j = 0; j < roverPos.length; j++) {
				roverPos[i][j] = startP;
				startP++;
			}
		}
		
		//1   2   3   4
		//5   6   7   8
		//9   10   11   12
		//13   14   15   16
		//left,top,down,down,right,right,right,right--12
		
		//record StartLocation:
		Point initialLocation = new Point(0, 0);
		
		//show my initial Location value：
		System.out.println("Your initial position is " + roverPos[initialLocation.x][initialLocation.y]);
		System.out.println();
		//expect 1
		
		//Command/Action: move and record Location Again
		//go left
		//goLeft(initialLocation);
		//update the Current Location:
		Point curLocation = goRight(goRight(goRight(goRight(goDown(goDown(goUp(goLeft(initialLocation))))))));
		//goLeft(goUp(goDown(goDown(goRight(goRight(goRight(goRight(initialLocation))))))));
		
		//show my current Location value：
		System.out.println("Your current position is " + roverPos[curLocation.x][curLocation.y]);
		//expect 12
		
		//update my initialLocation
		
	}
}


//check my matrix value

//for (int i = 0; i < roverPos.length; i++) {
//	for (int j = 0; j < roverPos.length; j++) {
//		if (j == 3) {
//			System.out.print(roverPos[i][j]);
//			System.out.print("\n");
//		}else {
//			System.out.print(roverPos[i][j] + "   ");
//		}
//	}
//}

