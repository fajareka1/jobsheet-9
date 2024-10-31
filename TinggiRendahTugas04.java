import java.util.Scanner;

public class TinggiRendahTugas04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int key, hasil = 0, index, total = 0, min = 100, max = 0; 

        double rata;
        System.out.print("Masukkan jumlah mahasiswa : ");
        index = sc.nextInt();
        int[] arrNilai = new int [index];

        for (int i = 0; i < arrNilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
            total += arrNilai[i];
            if(arrNilai[i] > max){
                max = arrNilai[i];
            }
            if(arrNilai[i] < min){
                min = arrNilai[i];
            }
        }
        rata = total/ arrNilai.length;
        System.out.println("Rata-rata dari seluruh nilai mahasiswa adalah : "+rata);
        System.out.println("Nilai tertinggi dari seluruh nilai mahasiswa adalah : "+max);
        System.out.println("Nilai terendah dari seluruh nilai mahasiswa adalah : "+min);
    }
}
