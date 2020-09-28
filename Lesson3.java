import java.util.Scanner;
import java.util.Arrays;
public class Lesson3 {
    public static void main(String[] args){
    //Kiểm tra 1 số có nằm trong mảng không
        int dem, i, n, a[];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        i = input.nextInt();
        a = new int[i];
        System.out.println("Nhập các phần tử trong mảng:");
        for (dem = 0; dem < i; dem++)
            a[dem] = input.nextInt();
        System.out.println("Nhập số nguyên:");
        n = input.nextInt();
        for (dem = 0; dem < i; dem++)
        {
            if (a[dem] == n)
            {
                System.out.println(n+" có trong mảng.");
                break;
            }
        }
        if (dem == i)
            System.out.println(n + " không có trong mảng.");
    }
}
