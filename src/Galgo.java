
public class Galgo extends Thread{
	private String nombre;
	private int tiempo;
	
	
	

	public Galgo(String nombre) {
		super();
		this.nombre = nombre;
	}




	public Galgo(String nombre, int tiempo) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
	}




	public String getNombre() {
		return nombre;
	}




	public int getTiempo() {
		return tiempo;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}




	public void run() {
		try {
            System.out.printf("El galgo %s ha empezado a correr\n", nombre);
            Thread.sleep(tiempo * 1000); // Si le pongo un double casca
            System.out.printf("El galgo %s ha terminado de correr\n", nombre);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
