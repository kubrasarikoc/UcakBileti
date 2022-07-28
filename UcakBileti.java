import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas, select;
        double tutar, indirim;

        System.out.print("Mesafeyi Km Cinsinden Giriniz : ");
        km = input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();
        System.out.println("Yolculuk Tipinizi Seçiniz :\n1-Tek Yön\n2-Gidiş Dönüş");
        select = input.nextInt();

        tutar = km*0.10;

        if (yas<12){
            if (select==2){
                indirim = (tutar*0.50) + (tutar*0.20);
                tutar = tutar-indirim;
            }else {
                indirim = tutar*0.50;
                tutar = tutar-indirim;
            }
        } else if (yas >= 12 && yas <= 24) {
            if (select==2){
                indirim = (tutar*0.10) + (tutar*0.20);
                tutar = tutar-indirim;
            }else {
                indirim = tutar*0.10;
                tutar = tutar-indirim;
            }
        } else if (yas > 65) {
            if (select==2){
                indirim = (tutar*0.30) + (tutar*0.20);
                tutar = tutar-indirim;
            }else {
                indirim = tutar*0.30;
                tutar = tutar-indirim;
            }
        }else {
            if (select==2){
                indirim = tutar*0.20;
                tutar=tutar-indirim;
            }else {
               tutar=tutar;
            }
        }
        if ((yas<0) || (km<0) || !(select==1 || select==2)){
            System.out.println( "Hatalı Veri Girdiniz !");
        }else {
            System.out.println("Toplam Tutar : "+tutar);
        }
    }
}
