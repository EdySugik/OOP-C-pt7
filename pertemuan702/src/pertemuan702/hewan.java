package pertemuan702;

/**
 *
 * @author Edy
 * TGL : 8 Mei 2025
 */
public class hewan {
    private String nama="";
    private String suara="Apaaaa!!!";
    
    protected void setNama(String nm){
        this.nama = nm;
    }
    public String getNama(){
        return this.nama;
    }
    public void setSuara(String su){
        this.suara = su;
    }
    public String getSuara(){
        return this.suara;
    }
}
