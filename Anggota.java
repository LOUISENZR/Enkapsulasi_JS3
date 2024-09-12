public class Anggota {
    private String nama, noKtp;
    private int limPeminjaman, jmlPinjaman;
    
    public Anggota(String noKtp, String nama, int limPeminjaman){
        this.nama=nama;
        this.noKtp=noKtp;
        this.limPeminjaman=limPeminjaman;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setNoKtp(String noKtp){
        this.noKtp=noKtp;
    }
    public String getNoKtp(){
        return noKtp;
    }
    public void setLimit(int limPeminjaman){
        this.limPeminjaman=limPeminjaman;
    }
    public  int getLimit(){
        return limPeminjaman;
    }
    public void setJmlPinjam(int jml){
        if(jml <= limPeminjaman){
            jmlPinjaman += jml;
        }else{
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }
    public int getJmlPinjam(){
        return jmlPinjaman;
    }
    public void angsur(int jmlAngsur){
        if(jmlAngsur >= (0.1*jmlPinjaman)){
            jmlPinjaman -= jmlAngsur;
        }else{
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
    }  
}