
/*
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını
 ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV
 oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner okuyucu = new Scanner(System.in);
        double tutar,kdvli,kdv;
        System.out.println("Bir tutar giriniz--> ");
        tutar = okuyucu.nextDouble();
        if(tutar>=0 && tutar<1000)
        {
            kdvli = tutar * 1.18;
            kdv = tutar * 0.18;
        }

        else
        {
            kdvli = tutar * 1.08;
            kdv = tutar * 0.08;
        }
        System.out.println("Kdvli:" + kdvli +"\n"+"kdv:"+kdv);

    }
}