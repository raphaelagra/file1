
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
//		int[] teste = { 5, 2, 8, 3, 6, 9, 4, 1, 7 };
		int[] teste = {2, 5, 6, 4, 13, 3, 12, 19, 8};
//		bubbleSortRecursive(teste, teste.length);
//		bubbleSortIterative(teste, teste.length);
		bubbleRecursive(teste, teste.length);
		System.out.println(Arrays.toString(teste));

	}

	/*
	 * METODO QUE FAZ O BUBBLE DO INICIO E DO FIM AO MESMO TEMPO NA FORMA ITERATIVA
	 */
	public static void bubbleIterative(int array[], int n) {
		int aux;
		
		for (int i = 0; i < n - 1; i++) {
		
			for (int j = i; j < n-1-i; j++) {
				aux = n-1-j;
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
				if (array[aux-1] > array[aux]) {
					swap(array, aux, aux-1);
				}
			}
		}
	}
	
	/*
	 * METODO QUE FAZ O BUBBLE DO INICIO E DO FIM AO MESMO TEMPO NA FORMA RECURSIVA
	 */
	public static void bubbleRecursive(int array[], int n) {
		if (n == 1) {
			return;
		}
		
		for (int i = ((array.length-1) - (n-1)), j = n-1; i < n-1; i++, j--) {
			if (array[i] > array[i+1]) {
				swap(array, i, i+1);
			}
			if (array[j-1] > array[j]) {
				swap(array, j, j-1);
			}
		}
		
		bubbleRecursive(array, n-1);
	}

	public static void bubbleSortIterative(int array[], int n) {

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	public static void bubbleSortRecursive(int array[], int n) {
		if (n == 1) {
			return;
		}

		for (int i = 0; i < n - 1; i++) {
			if (array[i] > array[i + 1]) {
				swap(array, i, i + 1);
			}
		}
		bubbleSortRecursive(array, n - 1);
	}

	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}
