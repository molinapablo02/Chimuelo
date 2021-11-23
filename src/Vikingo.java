public abstract class Vikingo {
	
	private float peso;
	private int edad;

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public abstract float empatia();
	
	public abstract boolean puedeMontar();
	
}
