package collab1;

public class Controller {
	 Elevater el;
	 Integer floorlimit;
	public void start(Integer flimit){
		
		el=new Elevater();
		this.floorlimit=flimit;
		
	}
	public void stop(){
		this.floorlimit=0;
		
		
	}
	
	
	public void up(){
		
		if(el.getFloor()<this.floorlimit){
			
			el.up();
		}
		else{
			
		System.out.println("Last Floor Reached");	
		}
		
		
	}
	
	
    public void down(){
	
    	if(el.getFloor()>0){
			
			el.down();
		}
		else{
			
		System.out.println("Ground Floor Reached");	
		}
		
		
		
	}
	

}
