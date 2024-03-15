package view;

import lib.Sorting.Sorting;
import java.util.Arrays;

public class Principal 
{
	public static void main(String[] args)
	{
		int[] ex1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] ex2 = {44, 43, 42, 41, 40, 39, 38};
		int[] ex3 = {31, 32, 33, 34, 99, 98, 97, 96};
		Sorting sort = new Sorting();
		
		//Exercício 1
		System.out.println("Exercício 1:");
		System.out.println("Original -> " + Arrays.toString(ex1));
		ex1 = sort.quickSort(ex1);
		System.out.println("Ordenado -> " + Arrays.toString(ex1) + "\n");
		
		//Exercício 2
		System.out.println("Exercício 2:");
		System.out.println("Original -> " + Arrays.toString(ex2));
		ex2 = sort.quickSort(ex2);
		System.out.println("Ordenado -> " + Arrays.toString(ex2) + "\n");
		
		//Exercício 3
		System.out.println("Exercício 3:");
		System.out.println("Original -> " + Arrays.toString(ex3));
		ex3 = sort.quickSort(ex3);
		System.out.println("Ordenado -> " + Arrays.toString(ex3) + "\n");
	}
}