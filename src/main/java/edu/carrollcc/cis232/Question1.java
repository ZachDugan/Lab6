package edu.carrollcc.cis232;
public class Question1 {
	public static void main(String[] args) throws IllegalArgumentException{
		int[] x = new int[]{4,8,15,16,23,42};
		System.out.println(maxElement(x));
	}
	public static int maxElement(int[] array) throws IllegalArgumentException{
		return maxElement(array, array.length-1);
	}
	public static int maxElement(int[] array, int counter) throws IllegalArgumentException{
	    if (counter > 0) {
	        return Math.max(array[counter], maxElement(array, counter-1));
	    } else{
		    return array[0];
	    }
	}
}
