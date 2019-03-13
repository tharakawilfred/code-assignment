package com.java.animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.java.animal.bird.Chicken;
import com.java.animal.bird.Duck;
import com.java.animal.bird.ParrotWithCat;
import com.java.animal.bird.ParrotWithDog;
import com.java.animal.bird.ParrotWithRooster;
import com.java.animal.bird.Rooster;
import com.java.animal.butterfly.Butterfly;
import com.java.animal.butterfly.Caterpillar;
import com.java.animal.fish.Clownfish;
import com.java.animal.fish.Dolphin;
import com.java.animal.fish.Shark;

/**
 * @author User - Main class
 */
public class Solution {

	public static void main(String[] args) {
		Animal[] animals = new Animal[] { new Duck(), new Chicken(), new Rooster(), new ParrotWithDog(),
				new ParrotWithCat(), new ParrotWithRooster(), new Shark(), new Clownfish(), new Dolphin(),
				new Butterfly(), new Caterpillar() };

		showMovements(animals);
		System.out.println("---------------");
		showPetSounds(animals);
	}

	public static void showMovements(Animal[] animals) {

		List<String> moves = new ArrayList<String>();

		for (int i = 0; i < animals.length; i++) {
			moves.add(animals[i].move());
		}

		Map<String, Integer> repeatationMap = new HashMap<String, Integer>();

		for (String str : moves) {

			if (repeatationMap.containsKey(str)) {
				repeatationMap.put(str, repeatationMap.get(str) + 1);
			} else {
				repeatationMap.put(str, 1);
			}
		}
		System.out.println();
		System.out.println("Number of Movement count : " + repeatationMap);
	}

	public static void showPetSounds(MakeSound[] petNoises) {

		List<String> sounds = new ArrayList<String>();

		for (int i = 0; i < petNoises.length; i++) {
			sounds.add(petNoises[i].sing());
		}
		while (sounds.remove(null)) {
		}

		System.out.println();
		System.out.println("Number of Sing count : " + sounds.size());
	}

}
