package com.fruits;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fruitsList {

	public static void main(String args[]) {
		List<FruitsPojo> fruitsList = new ArrayList<>();
		fruitsList.add(new FruitsPojo("yellow", "Banana", 50, 250));
		fruitsList.add(new FruitsPojo("red", "grapes", 70, 250));
		fruitsList.add(new FruitsPojo("Green", "Apple", 40, 250));
		fruitsList.add(new FruitsPojo("green", "Banana", 80, 250));

		Stream<FruitsPojo> stream1 = fruitsList.stream();

		List<FruitsPojo> fruitsFilter = stream1
				.filter(fruitsLists -> (fruitsLists.getName() == "Apple" && fruitsLists.getWeight() >= 250))
				.collect(Collectors.toList());
		System.out.println("filtered list " + fruitsFilter);

		List<FruitsPojo> fruitsSort = fruitsList.stream().sorted(Comparator.comparing(FruitsPojo::getName))
				.collect(Collectors.toList());
		System.out.println("fruits order " + fruitsSort);
		List<FruitsPojo> fruitsAsPerPrice = fruitsList.stream().sorted(Comparator.comparing(FruitsPojo::getPrice)).collect(Collectors.toList());
		System.out.println("fruits acc to Price "+ fruitsAsPerPrice);
		List<FruitsPojo> fruitsSortDesc = fruitsList.stream().sorted(Comparator.comparing(FruitsPojo::getName).reversed())
				.collect(Collectors.toList());
		System.out.println("fruits reverse order " + fruitsSortDesc);
	}

}
