import java.util.Scanner;
public class PemilihanHariDenganIf27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan sebuah angka: ");
        int weekday = sc.nextInt();
        if (weekday >= 1 && weekday <= 5)
        {
            System.out.println("Today is weekday buddy");
        }
        else if (weekday == 6 || weekday == 7) {
            System.out.println("Today is weekend buddy");
        }
        else 
        {
          System.out.println("Invalid number");
        }
    }
    
}
