import java.util.Scanner;

public class SearchNilai04 {
    public static void main(String[] args) {
        int key, hasil = 0; 

        Scanner sc = new Scanner(System.in);
        int index;
        System.out.print("Masukkan jumlah mahasiswa : ");
        index = sc.nextInt();
        int[] arrNilai = new int [index];

        for (int i = 0; i < arrNilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++){
            if(key == arrNilai[i]){
                hasil = arrNilai[i];
                System.out.println("Nilai "+ hasil + ", merupakan nilai mahasiswa ke-" + i);
                break;
            }
        }
        if (hasil == 0 ){
            System.out.println("Nilai tidak ditemukan");

        }
    }
}
