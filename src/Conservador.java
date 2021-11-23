public class Conservador extends Vikingo {
	
	public float empatia() {
		return 0;
	}
	
	public boolean puedeMontar() {
		return (100-getPeso()>70);
	}
	
}
