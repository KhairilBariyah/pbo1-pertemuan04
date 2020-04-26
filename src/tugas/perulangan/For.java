package tugas.perulangan;

public class For {
    public static void main(String[] args) {
        int tabungan = 0;
        int penuh = 500  ;

        System.out.println( "Tabungan Lebaran Sekarang : " + "Rp." +tabungan );
        System.out.println( "Target Jumlah Tabungan : " + "Rp." + penuh );
        System.out.println();

        for (tabungan=0; tabungan <= penuh; tabungan++){
            System.out.println("Sedang Proses Menabung..");
            System.out.println("Tabungan Sekarang :  " + tabungan);
            tabungan=tabungan+19;
        }
        System.out.println();
        System.out.println("Tabungan Mencukupi Selamat Berbelanja");
    }
}
