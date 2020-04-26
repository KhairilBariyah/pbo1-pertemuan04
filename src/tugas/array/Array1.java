package tugas.array;

public class Array1 {
    public static void main(String[] args) {
        String[][]kodePenerbangan={{"AHMAD","11568","Maluku"},{"YAHYA","11569","Jakarta"},{"ASKA","11570","Malaysia"}};

        for (int i=0; i <kodePenerbangan.length; i++){
            System.out.println("Nama                : " +kodePenerbangan[i][0]);
            System.out.println("Kode Penerbangan    : " +kodePenerbangan[i][1]);
            System.out.println("Tujuan              : " +kodePenerbangan[i][2]);
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        }
    }
}
