
import java.util.Scanner;


public class Test {
    /*
    inhertance ile bir beyblade oluşturma programı yazıyoruz.(mustafa murat coskun umdey java eğitimi içerinden örnektir.)
    //Source = Mustafa Murat COŞKUN / UDEMY referans alınarak geliştirilmiştir..
    
    */
    public static void main(String[] args) {
        System.out.println("Beyblade Fabrika Programına hoşgeldiniz.");
        System.out.println("Çıkış için q ya basınız..");
        Scanner scn = new Scanner(System.in);
        while (true) {   
            System.out.println("Hangi beyblade türünden bir tane istediğinizi seçiniz ve isimini yazınız.");
            String islem = scn.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }else{
                BeybladeFabrikası beybladeFabrikası = new BeybladeFabrikası();
                Beyblade beyblade = beybladeFabrikası.beybladeuret(islem);//çok biçimliliği bu şekilde sağlayabiliyoruz.
                //burada Dranza Dragon,Draciel,Drayga dönebiliriz.
                if(beyblade ==null){
                    System.out.println("Lütfen Üretimi Mümkün bir Beyblade Seçiniz.");
                }else{
                    beyblade.bilgileriGoster();
                    beyblade.saldır();
                    beyblade.kutsalCanavarOrtayaCıkar();
                }
            }
            
        }
    }
}
