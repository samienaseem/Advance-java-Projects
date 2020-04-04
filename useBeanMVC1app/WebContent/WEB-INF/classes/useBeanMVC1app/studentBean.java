package useBeanMVC1app;

public class studentBean implements java.io.Serializable {
	private int rollNo;
	private String name;
	private float attendance;
	
	public studentBean() {
		
		System.out.println("Student Bean constructor");
	}
	
	public void setrollNo(int rollNo){
		this.rollNo=rollNo;
	}
	public int getrollNo(){
		return rollNo;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAttendance(float attendance){
		this.attendance=attendance;
	}
	public float getAttendance(){
		return attendance;
	}
	

}
