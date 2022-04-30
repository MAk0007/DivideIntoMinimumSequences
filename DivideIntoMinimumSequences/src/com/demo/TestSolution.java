package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestSolution {

	public static void main(String[] args) {
//		int n=5;
//		int k=5;
//		int[] ar = 
//			{5,4,1,7,6};
//		int n=1;
//		int k=4;
//		int[] ar = 
//			{5};
		int n = 2;
		int k = 2;
		int[] ar = { 4, 5 };

		int minNum = checkMinimumSequence(n, k, ar);
		System.out.println("The minimum number of sequences are: " + minNum);

	}

	private static int checkMinimumSequence(int n, int k, int[] ar) {
		ArrayList<Integer> arr = (ArrayList<Integer>) Arrays.stream(ar).boxed().collect(Collectors.toList());
		int l = arr.size();
		ArrayList<Integer> idToRemove = new ArrayList<>();
		ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
		for (int i = 0; i < l; i++) {
			if (arr.get(i) % k == 0) {
				ArrayList<Integer> e = new ArrayList<>();
				e.add(arr.get(i));
				lst.add(e);
				idToRemove.add(arr.get(i));
			}
		}

		removeFromArr(arr, idToRemove);
		idToRemove.clear();

		boolean stat = checkDivisibility(arr);
		if (stat == true) {
			lst.add(arr);
		} else {
			int count = 0;
			for (int i = 0; i < arr.size(); i++) {
				@SuppressWarnings("unchecked")
				ArrayList<Integer> toSend = (ArrayList<Integer>) arr.clone();
				if (i == count) {
					toSend.remove(i);
					boolean sta = checkDivisibility(toSend);
					if (sta == true) {
						lst.add(toSend);
						idToRemove.addAll(toSend);
						break;
					}
				}
				count++;
			}
			removeFromArr(arr, idToRemove);
			idToRemove.clear();

			while (arr.size() > 0) {
				for (int i = 0; i < arr.size(); i++) {
					ArrayList<Integer> ne = new ArrayList<>();
					ne.add(arr.get(i));
					lst.add(ne);
					idToRemove.add(arr.get(i));
					removeFromArr(arr, idToRemove);
					break;
				}
			}

		}
		System.out.println("samples : " + lst.toString());
		return lst.size();
	}

	private static boolean checkDivisibility(ArrayList<Integer> arr) {
		boolean stat = false;
		Collections.sort(arr);
		for (int i = 0; i < arr.size() - 1; i++) {
			if ((arr.get(i) + arr.get(i + 1)) % 5 != 0) {
				stat = false;
				break;
			} else {
				stat = true;
			}
		}
		return stat;
	}

	private static void removeFromArr(ArrayList<Integer> arr, ArrayList<Integer> idToRemove) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < idToRemove.size(); j++) {
				if (arr.get(i) == idToRemove.get(j)) {
					arr.remove(i);
					i--;
					break;
				}
			}
		}

	}

}
