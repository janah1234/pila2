package cl.ubb.agil;

public class pila {
	int tope = -1;
	private int [] pila = new int [10];
	final int MAX = 9;
	
	public boolean vacia(){
		if(tope == -1){
			return true;
		}else{
			return false;
		}
		
	}
	
	public void push (int elem){
		tope++;
		pila [tope] = elem;
		
	}
}
