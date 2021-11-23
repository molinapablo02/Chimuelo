public class Reformista extends Vikingo {
	
	private int tibieza;

	public int getTibieza() {
		return tibieza;
	}

	public void setTibieza(int tibieza) {
		this.tibieza = tibieza;
	}
	
	public float empatia() {
		return getTibieza()/2;
	}
	
	public boolean puedeMontar() {
		return (100-getPeso()-getEdad()>70);
	}

}
