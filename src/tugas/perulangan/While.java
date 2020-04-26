package tugas.perulangan;


public class While {
    public static void main(String[] args) {
        int tabungan = 0;
        int penuh = 500  ;

        System.out.println( "Tabungan Lebaran Sekarang : " + "Rp." + tabungan );
        System.out.println( "Target Jumlah Tabungann : " + "Rp." + penuh );
        System.out.println();

        while (tabungan != penuh) {
            tabungan++;
            tabungan=tabungan+19;
            System.out.println("Sedang Proses Menabung..");
            System.out.println("Tabungan Sekarang : " + "Rp." + tabungan);
        }


        System.out.println();
        System.out.println("Tabungan Mencukupi Selamat Berbelanja");
    }
}
