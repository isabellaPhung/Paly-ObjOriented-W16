//Isabella Phung
//Period 2
//Chapter 10.2
//no expected inputs; constructor class

class Elipse{
	int centerX; //data fields
	int centerY;
	boolean orientation;
	int majorAxis;
	int minorAxis; 
	static int numOfElipses=0; //keeps track of elipses
	
	Elipse(){ //default elipse
		centerX=0;
		centerY=0;
		orientation=true;
		majorAxis=1;
		minorAxis=1;
		numOfElipses++;
	}
	
	//user Elipse constructor
	Elipse(int centerX, int centerY, boolean ifHorizontal, int majorAxisLength, int minorAxisLength) {
		this.centerX=centerX;
		this.centerY=centerY;
		orientation=ifHorizontal;
		majorAxis=majorAxisLength;
		minorAxis=minorAxisLength;
		numOfElipses++;
	}

	//getters
	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public boolean isOrientation() {
		return orientation;
	}

	public int getMajorAxis() {
		return majorAxis;
	}

	public int getMinorAxis() {
		return minorAxis;
	}

	public static int getNumOfElipses() {
		return numOfElipses;
	}
	
	//setters
	public void setMinorAxis(int minorAxis) {
		this.minorAxis = minorAxis;
	}
	
	public void setMajorAxis(int majorAxis) {
		this.majorAxis = majorAxis;
	}
	
	public void setOrientation(boolean orientation) {
		this.orientation = orientation;
	}
	
	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	
	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}
}