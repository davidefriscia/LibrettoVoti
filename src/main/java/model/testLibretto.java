package model;

import java.time.LocalDate;

public class testLibretto {

	public static void main (String[] args) {
		
		Libretto libretto = new Libretto();
		
		Voto voto1 = new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 20));
		Voto voto2 = new Voto("Informatica", 25, LocalDate.of(2019, 1, 29));
		libretto.add(voto1);
		libretto.add(voto2);
		System.out.println(libretto);
	}
}
