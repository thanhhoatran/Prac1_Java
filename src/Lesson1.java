import java.util.Scanner;
public class Lesson1 {
    public static void main(String[] args){
        //Tính tổng số nguyên

        int n, d, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        n = scanner.nextInt();
        while (n > 0) {
            d = n % 10;
            n = n / 10;
            sum += d;
        }
        System.out.println("Tổng = " + sum);
    }
}
