package zadacha5;

import java.util.*;

public class ClassMain {
	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String>();
		mnozestvo1.add("Ana");
		mnozestvo1.add("Eva");
		mnozestvo1.add("Sara");
		mnozestvo1.add("Mara");
		Set<String> mnozestvo2 = new TreeSet<String>();
		mnozestvo2.add("Ana");
		mnozestvo2.add("Eva");
		mnozestvo2.add("Kiko");
		mnozestvo2.add("Pece");
		// unija na dvete mnozestva
		Set<String> unija = new TreeSet<String>();
		System.out.println("Unija na dvete mnozestva:");
		unija.addAll(mnozestvo2);
		unija.addAll(mnozestvo1);
		System.out.println(unija);
		// presek na dvete mnozestva
		System.out.println("presek na dvete mnozestva:");
		mnozestvo1.retainAll(mnozestvo2);
		System.out.println(mnozestvo1);
	}
}
