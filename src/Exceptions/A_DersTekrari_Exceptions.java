package Exceptions;

public class A_DersTekrari_Exceptions {

    /*
    Try-Catch; yazmış olduğumuz kod bloklarında hataların önüne geçen bir yapıdır.
    Aslında hataların tam olarak önüne geçmekten kasıt hatanın önlenmesi değil,
    ilgili programın son kullanıcıya hata vererek sonlanmasının önüne geçmeyi sağlayan bir yapıdır.
    Java exception'lari yonetebilmemiz icin (handle) try -catch bloklari olusturmustur
    try - catch bloklari 3 bolumden olusur.

     */

    /*
    CHECKED EXCEPTIONS:
    Java dosya okuma islemini yapmasini istedigimizde
        o dosyaya erisememe durumunda ne yapilmasi gerektigini bilmek ister
        bunun icin de kodun altini kirmizi cizer
        Compile Time Exceptions (Checked Exceptions) icin 2 ihtimal vardir
        1- standart exceptions gibi try - catch blogu ile sarmalayabiliriz
           try - catch ile exception durumunda ne yapacagini soyleriz
           dolayisiyla kodlarimiz exception olussa bile calismaya devam eder (handle)
        2- Eger exception olustugunda kodun calismaya devam etmesini ISTEMIYORSAK
           veya kodumuzdan emin oldugumuz icin bu riski onemsemiyorsak
           exception'i handle etmek yerine
           Java'ya SEN CALISMANA BAK, biz exception riskinin farkindayiz demek istiyorsak
           method deklarasyonuna THROWS keyword ile bekledigimiz exception'i yazabiliriz.
*/
    /*
        Bir kodda birden fazla exception olasigi olabilir:

        ornegin bir soruda
         - ArrayIndexOutOfBoundsException
         - StringIndexOutOfBoundsException olusma olasiligi var
         - InputMismatchException
        Birden fazla exception olasiligi varsa
        asagidaki adimlarla ilerlemek gerekir:

        1- olusmasi muhtemel exception'lar icin parent - child iliskisi yoksa
            - her biri icin ayri try-catch
            - bir try, her bir exception icin ayri catch
            - bir try ve olasi tum exception'lari kapsayan genel bir catch

        2- olusmasi muhtemel exception'lar arasinda parent child iliskisi varsa
            - birden fazla catch cumlesi yazilacaksa, once child(geniş delikli elek),
              sonra parent(dar delikli elek) yazilabilir ya da
            - sadece parent yazilabilir
     */

/*  THROW KEYWORD'U
1-	throw keyword kontrollü olarak bir exeption throw etmek için kullanilir
2-	throw keyword ile sadece bir exeption throw edilebilir
3-	throw keyword method içinde kullanilir
4-	throw keyword yazdiktan sonra variable yazilir
    Or: new illegalArgumentException();

    THROWS KEYWORD'U
1 - throws keyword bir veya daha fazla exeption’i deklare etmek için kullanilir
2-	throws keyword ile bir veya daha fazla exeption deklare edilebilir
3-	throws keyword method’un deklare edildiği satirda kullanilir
4-	throws keyword yazdiktan sonra exception class ismi yazilir
    Orn: public static void main(String[] args) throws FileNotFoundException {}

*/
    /* BAZI EXCEPTION TURLERI
  1- NullPointerException:
     null olarak isaretlenmis bir String’i
     string method’lari ile kullanmak
     istediginizde ortaya cikar.

2- StringIndexOutOfBoundsException:
    String’de olmayan bir index’i
    kullanmak istediginizde ortaya cikar.

3- ArrayIndexOutOfBoundsException:
    Array’de olmayan bir index’i
    kullanmak istediginizde ortaya cikar.

4- NumberFormatException:
    parseInt() gibi bir method kullandigimizda
    String'de sayi disinda bir karakter olursa
    karsimiza cikar.

5- ClassCastException:
    Uygun olmayan bir cast islemi yapmaya
    calistigimizda ortaya cikar

     */

    /*
    Finally blogu try blogu ile calisir.
    Bir try blogu ile istendigi kadar catch blogu ve en sonda bir tane finally blogu
    kullanilabilir.
    Bir try blogu ile hic catch
    blogu kullanmadan da finally
    blogu kullanilabilir.
    finally blogu her durumda calisir, kullanim amaci bir exception olussa da, mutlaka
    yapilmasi gereken database connection’inin durdurulmasi gibi gorevlerin
    yapilacagindan emin olmaktir.
     */



}
