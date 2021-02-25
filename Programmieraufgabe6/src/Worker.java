
public class Worker implements Comparable<Worker>{
	
	private int id;
	private String ln; 
	
	public Worker (int id, String ln) {
		
		this.id = id; 
		this.ln = ln;
		
	}
	
	public String toString() {
		return "ID: "+this.id+" Nachname: "+ln;
	}

	@Override
	public int compareTo(Worker o) {
		// TODO Auto-generated method stub
		if(o instanceof Worker) {
			Worker other = (Worker) o;
			
			if(this.ln.substring(0,1).compareTo(other.ln.substring(0, 1))!= 0) {
				System.out.println("nicht gleiche vornamen");
				return this.ln.substring(0,1).compareTo(other.ln);
			}
			
			else{//if(other.ln.substring(0, 1).compareTo(this.ln.substring(0, 1))==0) {
				if(this.id > other.id) {
					return 1;
				}
				if(this.id<other.id) {
					return -1;
				}
				
			}
		}
		return 0;
	}
	

}
