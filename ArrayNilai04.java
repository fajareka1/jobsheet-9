import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        for(int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for(int i = 0; i < nilaiAkhir.length; i++){
            System.out.println("Nilai akhir ke-"+i+" : "+" adalah "+nilaiAkhir[i]);
        }
        for(int i = 0; i < nilaiAkhir.length; i++){
            if(nilaiAkhir[i] < 69 ){
                System.out.println("Siswa ke-"+i+" tidak lulus!");
            }else{
                System.out.println("Siswa ke-"+i+" lulus!");
            }
        }
    }
}
