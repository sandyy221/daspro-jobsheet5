import java.util.Scanner;
public class PemilihanBilangan27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan sebuah angka: ");
        int angka = sc.nextInt();
        if (angka % 2 == 0)
        {
            System.out.println("Angka " + angka + " Termasuk bilangan genap ");
        }
        else
        {
            System.out.println("Angka " + angka + " Termasuk bilangan ganjil ");
        }
        
    }
}