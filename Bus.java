package Project;

public class Bus {

	private int busno;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap){
		this.busno=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int cap) {
		capacity=cap;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean val) {
		ac=val;	
	}
	public int getBusno() {
		return busno;
	}
	public void displayBusInfo() {
		System.out.println("Busno:" +busno+"Ac:"+ ac +"Total capacity:"+capacity);
	}
	}


