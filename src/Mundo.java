import java.util.ArrayList;

public class Mundo {
	
	ArrayList<Aldea>aldeas=new ArrayList<>();
	
	public ArrayList<Aldea>lasMenosProbables(){
		ArrayList<Aldea>greenpeace=new ArrayList<>();
		for(Aldea a:aldeas) {
			if(a.empatiaPromedio()>50) {
				greenpeace.add(a);
			}
		}
		return greenpeace;
	}
	
	public boolean despertarDeChimuelo() {
		boolean b = false;
		for(Aldea a:aldeas) {
			if(a.empatiaPromedio()==0) {
				b=true;
			}
		}
		return b;
	}
	
}