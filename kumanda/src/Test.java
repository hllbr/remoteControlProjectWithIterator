
import java.util.Scanner;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Kumanda Programına Hoşgeldiniz");
        System.out.println("İşlemleriniz gerçekleştiriliyor Lütfen Bekleyiniz....");
        Thread.sleep(3000);
        Scanner scn = new Scanner(System.in);
        String islemler = "islemler ...\n"
                + "1. islem kanalları göster\n"
                + "2. islem Kanal Ekle\n"
                + "3. işlem Kanal Sil\n"
                + "4. işlem Kanal Sayısı Öğren\n"
                + "q'ya basarak çıkabilirsiniz\n"
                + "5. islem listeyi tekrar göster";
        Kumanda kumanda = new Kumanda();
        
        while(true){
            System.out.println("**********************************************");
            System.out.println(islemler);
             System.out.println("**********************************************");
            System.out.println("Lütfen yapmak istediğiniz işlemi tuşlayınız ...");
            
            String islem = scn.nextLine();
            if(islem.equals("1")){
                kanallariGoster(kumanda);
            }else if(islem.equals("2")){
                System.out.println("Eklemek istediğiniz kanalın ismini giriniz = ");
                String isim = scn.nextLine();
                kumanda.kanalEkle(isim);
            }else if(islem.equals("3")){
                System.out.println("silmek istediğiniz kanalı yazınız : ");
                String isim = scn.nextLine();
                kumanda.kanalSil(isim);
            }else if(islem.equals("4")){
                System.out.println(kumanda.kanalSayisi());
            }else if(islem.equals("5")){
                System.out.println(islemler);
            }else if(islem.equals("q") || islem.equals("Q")){
                System.out.println("Çıkış talebiniz alınmıştır Lütfen bekleyiniz Çıkış işlemleri gerçekleştiriliyor.");
                Thread.sleep(3000);
                System.out.println("Çıkış İşlemi gerçekleştirildi.\niyi günler dileriz....");
                break;
            }else{
                System.out.println("Yanlış yada hatalı bir tuşlama yaptınız ...");
            }
        }
    }
      public static void kanallariGoster(Kumanda kumanda) {
        
        if (kumanda.kanalSayisi()== 0) {
            System.out.println("Şu anda hiçbir kanal bulunmuyor...");
        }
        else {
            for (String kanal : kumanda) {
                System.out.println("Kanal : " + kanal);
                
            }
            
        }
    

      }}