import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index;
        System.out.print("Masukkan jumlah mahasiswa : ");
        index = sc.nextInt();
        int[] nilaiMhs = new int [index];
        double totalLulus = 0, totalTdkLulus = 0;
        double rata2Lulus, rata2TdkLulu;
        int lulus = 0, tdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if(nilaiMhs[i] > 70){
                lulus += 1;
                totalLulus += nilaiMhs[i];
            }else{
                tdkLulus += 1;
                totalTdkLulus += nilaiMhs[i];
            }
        }

        rata2Lulus = totalLulus / lulus;
        rata2TdkLulu = totalTdkLulus / tdkLulus;
        System.out.println("Rata-rata nilai lulus = "+rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2TdkLulu);

    }
}
