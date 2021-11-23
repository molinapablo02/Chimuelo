import java.util.ArrayList;

public class Aldea {
	
	ArrayList<Vikingo>aldeanos=new ArrayList<>();
	
	public float empatiaPromedio() {
		int e=0;
		for(Vikingo v:aldeanos) {
			e+=v.empatia();
		}
		return e/aldeanos.size();
	}
	
	public ArrayList<Vikingo>losQuePuedenMontar(){
		ArrayList<Vikingo>jinetes=new ArrayList<>();
		for(Vikingo v:aldeanos) {
			if(v.puedeMontar()) {
				jinetes.add(v);
			}
		}
		return jinetes;
	}
	
}
