import java.util.Scanner;
public class tugas2Absen27 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Masukkan usia Anda: ");
            int usia;
            String kategori;
            if (scanner.hasNextInt()) {
                usia = scanner.nextInt();
                
                if (usia < 0) {
                    System.out.println("Usia tidak boleh negatif. Silakan masukkan angka positif.");
                    return; 
                }
                if (usia >= 0 && usia <= 12) {
                    kategori = "Anak";
                } else if (usia >= 13 && usia <= 19) {
                    kategori = "Remaja";
                } else if (usia >= 20 && usia <= 64) {
                    kategori = "Dewasa";
                } else {
                    kategori = "Lansia";
                }
                System.out.println("Kategori usia: " + kategori);
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka positif.");
            }
    
        }
    }
