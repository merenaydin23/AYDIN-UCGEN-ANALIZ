import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fa,fb,fc,a,b,c,usa,usb,usc,cosb,cosc,alan,acia,acib,acic,cosa;
        int i=0,kon,kon1,kon2,kon3,kon4;
        Scanner klavye=new Scanner(System.in);
System.out.println("Aydın üçgen inceleme programına hoş geldiniz");
        do {
            System.out.println("Ücgenin kenarlarını girin."+"sıarsıyla a,b,c");
            a = klavye.nextDouble();
            b = klavye.nextDouble();
            c = klavye.nextDouble();
            fa = b - c;
            fb = a - c;
            fc = a - b;

            do {
                if (b + c > a && a > Math.abs(fa)) {
                    i++;
                } else if (a + c > b && b > Math.abs(fb)) {
                    i++;
                } else if (a + b > c && c > Math.abs(fc)) {
                    i++;
                } else if (i != 3) {
                    System.out.println("Girilen kenarlar ücgen oluşturmaz.");
                    break;
                }
            } while (i != 3);
        }while (i!=3);

        System.out.println("Üçgenin açılarının isimlendirilmesi karşısındaki kenarın adı esas alınarak yapılmıştır.");

        do {
    System.out.println("Üçgenin kenar uzunluklarına göre türünü öğrenmek ister misiniz?" + " Yanıtınız evetse 1i hayırsa 2yi tuşlayın");
     kon = klavye.nextInt();
   }while (kon!=1&&kon!=2);
   if (kon==1){
        if (a==b&&b==c){
            System.out.println("Eş kenar ücgendir.");
        }
        else if (a!=b&&a!=c&&b!=c) {
            System.out.println("Üçgen çeşit kenar üçgendir.");
        }
        else {
            System.out.println("Üçgen ikizkenar üçgendir.");
        }
    }
   else if (kon==2){
    System.out.println("İsteğiniz üzere üçgenin kenar uzunluklarına göre türü incelenmemiştir.");
    }
  do {
    System.out.println("Üçgenin yaklaşık olarak açılarını öğrenmek ister misin?"+"Yanıtınız evetse 1i hayırsa 2yi tuşla");
  kon4=klavye.nextInt();
  }while (kon4!=1&&kon4!=2);
     cosa=  (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c) ;
     cosb = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
     cosc = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
  if (kon4==1){
  acia=Math.toDegrees(Math.acos(cosa));
  System.out.println("A açısı="+acia+"derece");

  acib=Math.toDegrees(Math.acos(cosb));
  System.out.println("B açısı="+acib+"derece");

  acic=Math.toDegrees(Math.acos(cosc));
  System.out.println("C açısı="+acic+"derece");
 }

  do {
     System.out.println("Üçgenini açılarına göre türünü öğrenmek ister misin?" + " Yanıtınız evetse 1i hayırsa 2yi tuşlayın.");
     kon1 = klavye.nextInt();
 }while (kon1!=1&&kon1!=2);
  usa=Math.pow(a,2);
  usc=Math.pow(c,2);
  usb=Math.pow(b,2);
  cosa=(usb+usc-usa)/2*b*c;
  cosb=(usa+usc-usb)/2*a*c;
  cosc=(usa+usb-usc)/2*a*b;
  if (kon1==1) {
      if (usa == usb + usc) {
        System.out.println("Dik üçgendir. B ve C kenarları birbirine diktir.");
    } else if (usb == usa + usc) {
        System.out.println("Dik üçgendir. A ve C kenarları birbirine diktir.");

    } else if (usc == usa + usb) {
        System.out.println("Dik üçgendir. A ve B kenarları birbirine diktir.");
    } else if (cosa < 0) {
        System.out.println("Geniş acılı üçgendir A açısı geniş acıdır.");
    } else if (cosb < 0) {
        System.out.println("Geniş açılı üçgendir B geniş açısı acıdır.");
    } else if (cosc < 0) {
        System.out.println("Geniş açılı üçgendir C acısı geniş açıdır.");
    } else if (0 < cosa && 0 < cosc && 0 < cosb) {
        System.out.println("Üçgen dar açılıdır.");
    }
    } else if (kon1==2) {
    System.out.println("İsteğiniz üzerine üçgenin açılarına göre türü incelenmemiştir.");
    }


    do {
    System.out.println("Üçgenin çevre uzunluğunu öğrenmek ister misiniz?"+"Yanıtınız evetse 1i tuşlayın hayırsa 2yi tuşlayın.");
   kon2=klavye.nextInt();
    }while (kon2!=1&&kon2!=2);

   if (kon2==1){
    double cevre=a+b+c;
    System.out.println("Üçgenin çevresi="+cevre);
   } else if (kon2==2) {
       System.out.println("İsteğiniz üzerine üçgenin çevresi hesaplanmamıştır.");
   }

do {
    System.out.println("Üçgenin alanını hesaplamak iste rmisiniz?"+" Yanıtınız evetse 1i tuşlayın hayırsa 2yi tuşlayın.");
kon3=klavye.nextInt();
}while (kon3!=1&&kon3!=2);
if (kon3==1) {
    double cevre1 = (a + b + c)/2;
    alan = cevre1 * (cevre1 - a) * (cevre1 - b) * (cevre1 - c);
    alan = Math.sqrt(alan);
    System.out.println("Üçgenin alanı=" + alan);
} else if (kon3==2) {
    System.out.println("İsteğiniz üzere üçgenin alanı hesaplanmamıştır.");
}
System.out.println("Bizi tercih ettiğniz için teşekkür eder iyi çalışmalar dileriz");
    }
}