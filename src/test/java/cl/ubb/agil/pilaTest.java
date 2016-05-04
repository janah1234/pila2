package cl.ubb.agil;

import org.junit.Test;
import cl.ubb.agil.pila; 
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class pilaTest {
	
	private pila pila;
	
	@Test
	public void laPilaEstaVacia(){
		pila = new pila();
		
		boolean estado = pila.vacia();
		
		assertThat(estado,is(true));
	}
	
	@Test
	public void agregarUnoNoEstaVacia(){
		
		pila = new pila();
		pila.push(1);
		
		boolean estado = pila.vacia();		
	
		assertThat(estado,is(false));
	}
	
	public void agregarUnoYDosNoEstaVacia(){
		
		pila = new pila();
		
		pila.push(1);
		pila.push(2);
		
		boolean estado = pila.vacia();
		
		assertThat(estado,is(false));
	}
}
