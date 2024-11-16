package basic.arrayexercises;

import basic.utilis.MyArray;

/*
 * Program that shifts 1 position to the right all elements of an entered
 * array
 */
public class Ex06 {

	public static void main(String[] args) {
        int[] array = MyArray.fill(15);
        int[] arrayRotado = MyArray.shift1El(array);
        System.out.println("Tu array rotado 1 posicion:");
        MyArray.display(arrayRotado);
	}
	
}