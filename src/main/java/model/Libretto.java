package model;

import java.util.LinkedList;

public class Libretto {
	
	LinkedList<Voto> voti = new LinkedList<Voto>();

	public void add(Voto voto) {
		voti.add(voto);
	}

	public String toString() {
		String s = "";
		for(Voto v : voti) {
			s += v.getNome() + v.getVoto() + v.getData() + "\n"; 
		}
		return s;
	}
}
