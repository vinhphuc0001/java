package N20DCVT038_OOP_TH1_01 ;
import java.util.Scanner;
public class Baitap1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều cao của tam giác: ");
		int height = scanner.nextInt();
		if (height <= 0) {
		System.out.println("Chiều cao phải là một số nguyên dương.");
		return;
		}

		System.out.println("Tam giác có chiều cao " + height + " như sau:");
		drawTriangle(height);
		scanner.close();
		}

		public static void drawTriangle(int height) {
		for (int i = 1; i <= height; i++) {
		for (int j = 1; j <= height - i; j++) {
		System.out.print(" ");
		}
		for (int k = 1; k <= 2 * i - 1; k++) {
		System.out.print("*");
		}
		System.out.println();
		}


	}

}
