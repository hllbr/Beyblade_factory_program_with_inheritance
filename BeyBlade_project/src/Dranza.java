
public class Dranza extends Beyblade{//sub class
    private String KutsalCanavar ;

    public Dranza(String beybladeci, int donusHızı, int SaldırıGucu,String KutsalCanavar) {
        super(beybladeci, donusHızı, SaldırıGucu);
        this.KutsalCanavar = KutsalCanavar;
    }
//sadece bilgilerigöster ve kutsalcanavarıortayacıkar override etmek bizim için yeterli bu yüzden diğerlerini override etmedik.Farklılıklar bu methodlarda olacak
    
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kutsal canavar adı : " +KutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {
        System.out.println(getBeybladeci() + " " + KutsalCanavar + " ı ortaya çıakrıyor.");
        System.out.println(getBeybladeci() + " gizli saldırısı Alev Kılıcı");

    }
    
    
}
