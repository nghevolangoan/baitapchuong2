package ch2_bai8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NhapDaySoTinhTrungBinhCong {

	public static void main(String[] args) {
		
		int n, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);
         
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
         
        System.out.println("Nhập vào số lượng n số trong dãy mà bạn muốn : ");
        n = scanner.nextInt();
         
        
        for (int count = 1; count <=n; count++) {
            System.out.println(" số thứ " + count + ": ");
            number = scanner.nextInt();
            sum += number;
        }
         
        avgNumber = (float) sum / n;
        System.out.println("Trung bình cộng = " + decimalFormat.format(avgNumber));
    }

}
