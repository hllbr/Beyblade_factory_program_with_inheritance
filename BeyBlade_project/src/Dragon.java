
public class Dragon extends Beyblade{//sub class 
  private String KutsalCanavar;
  private String gizliYetenk ;

    public Dragon(String beybladeci, int donusHızı, int SaldırıGucu,String KutsalCanavar,String gizliYetenk) {
        super(beybladeci, donusHızı, SaldırıGucu);
        this.KutsalCanavar =KutsalCanavar ;
        this.gizliYetenk = gizliYetenk ;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kutsal Canavar Adı : " +KutsalCanavar);
        System.out.println("GİZLİ YETENEK : " +gizliYetenk);

    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {
        System.out.println(getBeybladeci() + " " + KutsalCanavar + " ı ortaya çıakrıyor.");
        System.out.println(getBeybladeci() + " gizli saldırısı Hayalet Kasırgası");
        
    }
  
}
