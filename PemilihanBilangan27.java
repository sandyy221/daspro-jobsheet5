import java.util.Scanner;
public class PemilihanBilangan27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan sebuah angka: ");
        int angka = sc.nextInt();
        
        String hasil = angka % 2 == 0 ? "Bilangan genap " : "Bilangan ganjil ";
        System.out.println(hasil);
    }
}