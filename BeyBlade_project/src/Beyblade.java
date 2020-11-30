
public class Beyblade {
    //ortak özellikler burada olacak
    //super class 
    private String beybladeci ;
    private int donusHızı ;
    private int SaldırıGucu ;

    public Beyblade(String beybladeci, int donusHızı, int SaldırıGucu) {
        this.beybladeci = beybladeci;
        this.donusHızı = donusHızı;
        this.SaldırıGucu = SaldırıGucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHızı() {
        return donusHızı;
    }

    public void setDonusHızı(int donusHızı) {
        this.donusHızı = donusHızı;
    }

    public int getSaldırıGucu() {
        return SaldırıGucu;
    }

    public void setSaldırıGucu(int SaldırıGucu) {
        this.SaldırıGucu = SaldırıGucu;
    }
    //ortak bir metod yazıyoruz diğer beybladeler için
    public void saldır(){
        System.out.println(beybladeci + " " + SaldırıGucu + " ve " + donusHızı + " ile saldırıyor.");
        
    }
    public void kutsalCanavarOrtayaCıkar(){
        System.out.println("Bu Beyblade'in Kutsal Canavarı Bulunmuyor.");
    }
    public void bilgileriGoster(){
        System.out.println("Beybladeci : " +beybladeci);
        System.out.println("Saldırı gucu : " +SaldırıGucu);
        System.out.println("Dönüş hızı : "+donusHızı);
        
    }
    
}
