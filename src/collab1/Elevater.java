package collab1;

public class Elevater {
	
	Boolean status;
	Integer floor;
	//hello
	
	public Elevater(){
		status=false;
		floor=0;
	}
	
	void up(){
		floor++;
		
		System.out.println("Reached Floor "+this.floor);
	}
	
	
	void down(){
		
		floor--;
		System.out.println("Reached Floor "+this.floor);
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	

}
