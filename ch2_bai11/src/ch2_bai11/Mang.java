package ch2_bai11;

import java.util.Scanner;

public class Mang {

	public static void main(String[] args) {
		
		int n, sum = 0, tempSort;
		
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhập vào số phần tử của mảng: ");
	        n = scanner.nextInt();
	    } while (n < 0);
	         
	    
	    int array[] = new int[n];
	         
	    System.out.println("Nhập các phần tử cho mảng: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử thứ " + i + ": ");
	        array[i] = scanner.nextInt();
	    }
	         
	    
	    System.out.println("\nMảng ban đầu: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(array[i] + "\t");
	    }
	         
	   
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = i + 1; j <= n - 1; j++) {
	            if (array[i] > array[j]) {
	                tempSort = array[i];
	                array[i] = array[j];
	                array[j] = tempSort;
	            }
	        }
	    }
	    System.out.println("Mảng sau khi sắp xếp là: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(array[i] + "\t");
	    }
	         
	    
	   
	}
}

