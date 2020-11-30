
public class Draciel extends Beyblade{//sub class
     private String KutsalCanavar ;

    public Draciel(String beybladeci, int donusHızı, int SaldırıGucu,String KutsalCanavar) {
        super(beybladeci, donusHızı, SaldırıGucu);
        this.KutsalCanavar = KutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kutsal Canavar Adı : " +KutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {
       System.out.println(getBeybladeci() + " " + KutsalCanavar + " ı ortaya çıakrıyor.");
       System.out.println(getBeybladeci() + " gizli saldırısı Kale Savunması");
        
    }
    
}
