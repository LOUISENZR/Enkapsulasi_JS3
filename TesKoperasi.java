public class TesKoperasi {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("111333444","Donny",5000000);

        System.out.println("Nama Anggota: "+ anggota1.getNama());
        System.out.println("Limit Pinjaman: "+ anggota1.getLimit());

        System.out.println("\nMeminjam uang 10.000.000...");
        anggota1.setJmlPinjam(10000000);
        System.out.println("Jumlah Pinjaman Saat Ini: "+ anggota1.getJmlPinjam());

        System.out.println("\nMeminjam uang 4.000.000...");
        anggota1.setJmlPinjam(4000000);
        System.out.println("Jumlah Pinjaman Saat Ini: "+ anggota1.getJmlPinjam());

        System.out.println("\nMembayar angsuran 50.000");
        anggota1.angsur(50000);
        System.out.println("Jumlah Pinjaman Saat Ini: "+ anggota1.getJmlPinjam());

        System.out.println("\nMembayar angsuran 3.000.000");
        anggota1.angsur(3000000);
        System.out.println("Jumlah Pinjaman Saat Ini: "+ anggota1.getJmlPinjam());
    }
}
