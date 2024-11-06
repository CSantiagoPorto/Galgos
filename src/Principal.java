import java.util.Scanner;

public class Principal {
/*Haz un programa que use hilos independientes. Todos los galgos correrán un tiempo determinado por el usuario 
* (dato recogido por teclado).

Debes de comprobar el orden de llegada de cada galgo.

Tú decides cuántos galgos participan en la carrera.

Debes de hacer el ejercicio con herencia y con interfaz.*/
	

	public static void main(String[] args) {
		int tiempoA=0;
		int tiempoB=0;
		int tiempoC=0;
		Galgo a =new Galgo("Pequeño Ayudante");
		Galgo b=new Galgo("Veloz");
		Galgo c=new Galgo("Chispita");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Dime el tiempo de Pequeño Ayudante");
		tiempoA= sc.nextInt() ;
		a.setTiempo(tiempoA);
		System.out.println("Dime el tiempo de Veloz");
		tiempoB= sc.nextInt();
		b.setTiempo(tiempoB);
		System.out.println("Dime el tiempo de Chispita");
		tiempoC= sc.nextInt();
		c.setTiempo(tiempoC);
		a.start();
		b.start();
		c.start();
		
		
		
	}//CIERRA EL MAIN
	
}
