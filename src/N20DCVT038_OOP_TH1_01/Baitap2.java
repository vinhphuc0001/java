package N20DCVT038_OOP_TH1_01;
import java.util.Scanner;
public class Baitap2 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Nhập số n: ");
int n = sc.nextInt();
int tong = 0;
if (n % 2 == 0) { 
for (int i = 2; i <= n; i += 2) {
tong += i;
}
} else { 
for (int i = 1; i <= n; i += 2) {
tong += i;
}
}
System.out.println("Tổng của dãy số là: " + tong);
}

}




