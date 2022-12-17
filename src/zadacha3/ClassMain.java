package zadacha3;

import java.util.*;

public class ClassMain {
	public static void main (String[] args) {
		List<SportskiKlub> list = new ArrayList<SportskiKlub>();
		list.add(new SportskiKlub("NewCastle", "Fudbal", 16));
		list.add(new SportskiKlub("Man City", "Fudbal", 16));
		list.add(new SportskiKlub("Napoli", "Fudbal", 16));
		Collections.sort(list);
		for (SportskiKlub a: list) {
			System.out.println(a.getIme());
			System.out.println(a.getSport());
			System.out.println(a.getBrChlenovi());
			System.out.println("");
		}
	}
}
