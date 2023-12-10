import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Soru 1: Verilen bir cümlede kaç adet boşluk karakteri bulunduğunu bulan bir Java programı yazın.
       /* System.out.println("Lütfen bir cümle girimiz.");
        String bosluk=scanner.nextLine();
        int boslukSayisi=0;
        for (int i=0; i<bosluk.length(); i++){
            if (bosluk.charAt(i)==' '){
                boslukSayisi++;
            }
        }
        System.out.println("Toplam boşluk sayısı : "+boslukSayisi); */



        //Soru 2: Bir kullanıcıdan alınan bir kelimenin palindrom olup olmadığını kontrol eden bir Java programı yazın. (Örneğin, "kayak" kelimesi bir palindromdur.)
        /*System.out.println("Lütfen bir kelime giriniz");
        String kelime=scanner.nextLine();
        String tekKelime="";
        if (!kelime.contains(" ") && !kelime.contains("\t")){
            for (int i=kelime.length()-1; i>=0; i--){
                tekKelime+=kelime.charAt(i);
            }
        if (kelime.equals(tekKelime)){
            System.out.println("Bu kelime polindromdur.");
        }
        else {
            System.out.println("Bu kelime polindrom değildir.");
        }  }
        else{
            System.out.println(kelime + " uygun tek kelime değildir.");
        }*/




        //Soru 3: Kullanıcıdan alınan bir cümlede belirli bir kelimenin kaç kez geçtiğini sayan bir Java programı yazın.






        //Soru 4: Bir cümledeki kelimeleri tersten sıralayarak ekrana yazdıran bir Java programı yazın.
       /* System.out.println("Lütfen bir cümle girimiz.");
        String cumle=scanner.nextLine();
        for (int i=cumle.length()-1; i>=0; i--){
            System.out.print(cumle.charAt(i));
        }*/




        //Soru 5:Bir kelimenin içindeki tekrar eden harfleri kaldıran bir Java programı yazın. (Örneğin, "programming" kelimesi için "progamin" sonucu alınmalıdır.)
       /* System.out.println("Lütfen bir kelime giriniz:");
        String kelime = scanner.nextLine();
        String kaldiralicakKelime="";
        for (int i=0; i<kelime.length(); i++){
            char sonuc=kelime.charAt(i);
            if (kaldiralicakKelime.indexOf(sonuc)==-1){
                kaldiralicakKelime+=sonuc;
            }
        }
        System.out.println("Tekrar eden harfler kaldırıldıktan sonra: " + kaldiralicakKelime);
*/



        // DİZİLERİ KULLANMADAN YAPAMADIM ÇOK KARIŞTI
        //Soru 6:Kullanıcıdan alınan iki kelimenin anagram olup olmadığını kontrol eden bir Java programı yazın. (Anagramlar, aynı harfleri içeren fakat sıralamaları farklı olan kelimelerdir.)
      /*  System.out.println("Lütfen ilk kelimeyi giriniz:");
        String kelime1 = scanner.nextLine().toLowerCase();
        System.out.println("Lütfen ikinci kelimeyi giriniz:");
        String kelime2 = scanner.nextLine().toLowerCase();
        char[] dizi1=kelime1.toCharArray();
        Arrays.sort(dizi1);
        char[] dizi2=kelime2.toCharArray();
        Arrays.sort(dizi2);
        if (Arrays.equals(dizi1,dizi2)){
            System.out.println("Kelimeler anagramdır.");
        }
        else {
            System.out.println("Anagram değildir.");
        }*/




        //Soru 7:Bir cümledeki tüm kelimelerin ilk harfini büyük harfe dönüştüren bir Java programı yazın.
      /*  System.out.println("Lütfen bir cümle giriniz:");
        String cumle = scanner.nextLine();
        String[] kelimeler=cumle.split(" ");
        for (int i=0; i<kelimeler.length; i++){
            if (!kelimeler[i].isEmpty()){
                char ilkHarf=kelimeler[i].charAt(0);
                kelimeler[i]=Character.toUpperCase(ilkHarf)+kelimeler[i].substring(1);
            }
        }
        for (String kelime:kelimeler) System.out.print(kelime+" ");
        */




        //Soru 8:Bir cümledeki en uzun kelimeyi bulan bir Java programı yazın.
       /* System.out.println("Lütfen bir cümle giriniz:");
        String cumle = scanner.nextLine();
        String[] kelimeler=cumle.split(" ");
        String uzunKelime="";
        for (String kelime:kelimeler){
            if (kelime.length()>uzunKelime.length()){
                uzunKelime=kelime;
            }
        }
        System.out.println("En uzun kelime : "+uzunKelime);
        */



        //Soru 9://Bir cümlede geçen her kelimenin uzunluğunu hesaplayarak, bu uzunlukları ekrana yazdıran bir Java programı yazın.
        /*System.out.println("Lütfen bir cümle giriniz:");
        String cumle = scanner.nextLine();
        String[] kelimeler=cumle.split(" ");
        System.out.println();
        for (String kelime : kelimeler) {
            System.out.print(kelime.length()+" ");
        }
        */




        //Soru 10:Bir kelimenin içindeki sesli harfleri ve sessiz harfleri sayan bir Java programı yazın. (Örneğin, "Merhaba" kelimesi için 3 sesli, 4 sessiz harf sonucu alınmalıdır.)
        /* System.out.println("Lütfen bir kelime giriniz:");
        String kelime=scanner.nextLine();
        int sesli=0;
        for (int i=0; i<kelime.length(); i++){
            char donustur=kelime.charAt(i);
            if (donustur=='a'||donustur=='e'||donustur=='u'||donustur=='ü'||donustur=='ı'||donustur=='i'||donustur=='o'||donustur=='ö'){
                sesli++;
            }
        }
        System.out.println("Sesli harf sayısı : "+sesli);
        System.out.println("Sessiz harf sayısı : "+(kelime.length()-sesli));

         */
    }
}