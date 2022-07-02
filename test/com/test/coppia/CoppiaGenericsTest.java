package com.test.coppia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.coppia.CoppiaP;
import com.example.persona.Persona;

public class CoppiaGenericsTest {

	@Test
	public void testCoppiaDiPersone() {
		CoppiaP<Persona> coppia;
		Persona p1 = new Persona("pippo");
		Persona p2 = new Persona("Pluto");
		coppia = new CoppiaP<Persona>(p1,p2);
		assertSame(p1,coppia.getPrimo());
		assertSame(p2,coppia.getSecondo());
	}
	
	@Test
	public void testCheSmetteDiCompilare() {
		CoppiaP<Persona> coppia;
		String pippo = new String("pippo");
		String pluto = new String("pluto");
		Persona p1 = new Persona(pippo);
		Persona p2 = new Persona(pluto);
		coppia = new CoppiaP<Persona>();
		coppia.setPrimo(pippo);
		
	}

}
