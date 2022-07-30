/**
 * SinifiGecmeDurumu
 */
import java.util.Scanner;

import javax.security.auth.kerberos.KerberosCredMessage;

public class SinifiGecmeDurumu {

    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Turkce notunuzu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Muzik notunuzu giriniz : ");
        muzik = input.nextInt();

        
        
        if ((0 <= mat && mat <= 100) && (0 <= fizik && fizik <= 100) && (0 <= kimya && kimya <= 100) && (0 <= turkce && turkce <= 100) && (0 <= muzik && muzik <= 100)){

            double  avarage = (mat + fizik + kimya + turkce + muzik)/5;

            if (avarage <= 55){
                System.out.println("Tebrikler sınıfta kaldınız :D seneye gorusuruz kenks !!");
                System.out.println("Ortalaman da : " + avarage + " bu cok kasmamissin anlasilan ahahahahsd");
            }else {
                System.out.println("Hic beklemezdim kenks GECMISSIN helal valla \n" + "Ortalaman da " + avarage + " Sasirtiyosun valla" );
            }

        }else {
            System.out.println("Kenks ne girdin sen ? \nBu not degil tekrar gir istersen \nBiliyoruz ki 100 ile 0 arası olmalı \nDegil mi kenks ");
        }



    }
}