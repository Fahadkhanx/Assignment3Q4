//1
public class Assignment3Q4 {
 public static void main(String args[]) {
 int rows = 5;
 for (int c = 1; c <= rows; c++) {
 for (int d = 1; d <= c; d++) {
 System.out.print("*");
 }
 System.out.println();
 }
 //2
 for (int e = 1; e <= rows; e++) {
 for (int space = 1; space <= rows - e; space++) {
 System.out.print(" ");
 }
 for (int f = 1; f <= e; f++) {
 System.out.print("*");
 }
 System.out.println();
 }
 //3
 for (int g = 1; g <= rows; g++) {
 for (int space = 1; space <= rows - g; space++) {
 System.out.print(" ");
 }
 for (int h = 1; h <= 2 * g - 1; h++) {
 System.out.print("*");
 }
 System.out.println();
}
//4
 for (int i = 1;i <= rows; i++) {
 for (int space = 1; space <= rows - i; space++) {
 System.out.print(" ");
 }
 for (int j = 1; j <= 2 * i - 1; j++) {
 System.out.print(i);
 }
 System.out.println();
}
//5
 for (int k = 1; k <= rows; k++) {
 for (int space = 1; space <= rows - k; space++) {
 System.out.print(" ");
 }
 for (int l = k; l >= 1; l--) {
 System.out.print(l);
 }
 for (int l= 2; l <= k; l++) {
 System.out.print(l);
 }
 System.out.println();
 }
 }
}