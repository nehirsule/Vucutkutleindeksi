import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //kilo, boy tanımlayalım. Double ile çünkü tam sayı olmayabilir.
        double kilo ,boy , bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu kilogram cinsinden giriniz : ");
        // Kullanıcıdan kilo bilgisi alıyoruz
        kilo = input.nextDouble();

        System.out.print("Boyunuzu metre cinsinde giriniz(örn:1,65) : ");
        // Kullanıcıdan kilo bilgisi alıyoruz
        boy  = input.nextDouble();

        //Kilo (kg) / Boy(m) * Boy(m)= Vücut kütle indeksi
        bmi = (kilo/(boy*boy));   //vücut kütle indeksi formülü
        // sonuç:

        System.out.println("Vücut Kütle İndeksiniz : "+ bmi);
    }
}
