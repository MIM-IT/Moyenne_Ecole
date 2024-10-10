package moyenne_ecole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("tesst   ");
		calcul();
		
	}


	public static double moyenneGenerale(List<Double> notes) {
		double somme = 0;
		for (double note :notes) {
			somme += note; 
		}
		return somme/notes.size();//sur les listes c'est size et non length
	}
	
	public static void calcul() {
		Map<String, List<Double>> map = new HashMap<>();
		map.put("Olive", new ArrayList<Double>(Arrays.asList(new Double[] {1d,12d})));
		map.put("Oliv", new ArrayList<Double>(Arrays.asList(new Double[] {13d,12d})));
		map.put("Oli", new ArrayList<Double>(Arrays.asList(new Double[] {20d,20d})));
		map.put("Ol", new ArrayList<Double>(Arrays.asList(new Double[] {13d,12d})));
		map.put("O", new ArrayList<Double>(Arrays.asList(new Double[] {20d,20d})));
		
		System.out.println(map);

		double sum = 0;
		for(Map.Entry<String,List<Double>> entry: map.entrySet()) {
			String nom = entry.getKey();
			List<Double> notes = entry.getValue();
			sum += moyenneGenerale(notes);
		}
		
		double moyenne = sum / map.size();
		System.out.println("La moyenne de la classe est "+ moyenne);
	}

}
