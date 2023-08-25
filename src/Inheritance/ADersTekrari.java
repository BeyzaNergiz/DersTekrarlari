package Inheritance;



public class ADersTekrari {

        // (Bu kısım day36 ders tekrarı)

        /*
        VARIABLE ICIN INHERITANCE :

        Java'da en klasik obje olusturma yontemi
        ClassAdi  obj = new ClassAdi();
        ama Child class'in constructor'i kullanilarak olusturulan objeler icin
        data turu Parent class'lar olarak secilebilir.
        Eger constructor ve data turu farkli ise
        objenin ozelliklerini aramaya DATA TURU olan class'dan baslanir
        EGER ozellikler variable olarak olusturuldu ise
        objenin ozelliklerini DATA TURU belirler
     */

        // METHOD ICIN INHERITANCE :

        // constructor ve data turu ayni ise ilk bulunan deger gecerlidir

        // constructor ve data turu ayni degil ise
        // aramaya data turu olan class'dan baslanir ve bulunamazsa direk CTE verir, aramaya devam etmez.
        // Eğer o class'da bulunursa, bulunan class'dan constructor'in oldugu class'a kadar
        // bu ozelligin daha guncel hali var mi diye kontrol edilir
        // ve varsa en guncel hali yazilir.

        /*
        Sonuc olarak şunu diyebiliriz ki;
        VARIABLE'lar; Data türü olan class'daki ortak ozellikleri alir.
        METHOD'lar; Data türü olan class'daki ortak ozellikleri alir ama en guncel halini atama yapar.
         */

        // OVERRIDING; child class'in parent class'da var olan bir method'u kendisine uyarlamasidir.
        // Overriding icin parent class'daki method child class'da da olusturulup body'si degistirilir.

        /*
        Variable veya method aradigimiz class veya parent’larinda bulunamazsa Java CTE verir.
        CTE olmadığı durumda, bir child class’da oluşturulan objelerin data türleri değiştikçe
        static  özellikleri (variable değerleri) de değişir,
        ancak dinamik ozellikler(method sonuclari) en güncel halini aldığı için
        data türü değişse de aynı sonuclari verirler.
         */


        /*
        intelliJ overriding method ürettiğinde, @Override notasyonu kullanir.
        Her ne kadar bu notasyonu kullanmak mecburi olmasa da, kullanmakta fayda vardir.
        Biz de yazdigimiz overriding method’lara bu notasyonu ekleyebiliriz.
         */

         /*

    Overriding : Parent class’da var olan bir method’un child class tarafından
    update edilmesi yani parent class’daki method’un geçersiz kilinmasidir.

    @Override notasyonu overriden method ile overriding method'u birbirine baglar.
    eger overriden method silinirse CTE verir.
    Kullanmak zorunda degiliz ama iki method'u bagimli yapmak istiyorsak kullanilabilir
    overriding method varken overridden method calismaz.

    EGER her iki method'u birden calistirmak istersek child class'daki overriding method'a
    super.method2(); ekleyebiliriz.

    OVERRIDING KURALLARI : (Bu kısım 37/38 ders tekrarı)

    1) Overriding yapılırken method signature (method'un ismi vaya parametreleri) değiştirilemez.
    2) Child class'daki override eden method'un access modifier'ı
    Parent class'daki override edilen method'un access modifier'ından daha dar (sınırlandırıcı) olamaz.
    3) Child class'daki override method'un return type'i
    Parent class'daki override edilen method'un return type'inin ya aynisi veya child'ı olmalıdır.
    Buna COVARIANT denilir.
    4) Private, final ve static method'lar override edilemezler.

     */


        /* POLIMORHIZM: Bir methodu istedigimiz sonuclari alacak sekli ile calistirabilmek icin kullanilir.
        Polimorhizm de bu islevi gerceklestirmemizi saglayan iki yontemi kapsamaktadir.
        1. Overloading: Ayni isim ama farkli signature kullanmak.
        2. Overriding: Parent class'da var olan bir methodu child class'larda uyarlayarak farkli islev yaptirmak.

         */

        /*
        ABSTRACT CLASSES
        Abstraction (soyutluk) bir mecburiyet değil işlerimizi kolaylaştırmaya yarayan bir kolaylıktır.
        Eğer bir class child class’larinda MUTLAKA OLMASI GEREKEN method’lari belirlemek istiyorsa abstraction kullanilir.
        Java’da abstraction kullanabileceğimiz iki yapi vardir.
        1 - Abstract Classes (Partial abstraction) // Kısmi soyutluk vardır.
        2 - Interfaces (Full abstraction)  // Hepsi soyuttur.

        ÖZETLE;
        Eger parent class'i child class'lar icin bir cati class yapiyorsak
        ve parent class'a extends yapan tum child class'larin bazi method'lari
        kendisine uyarlamaya MECBUR ETMEK istiyorsak ABSTRACTION kullaniriz.

        1- Bir class'in bu ozellikleri saglamasi icin abstract olmasi lazim :
            - Abstract class - Kismi abstraction
              bazi methodlari child'larin uyarlamasini mecbur eder
              bazilarini serbest birakir.
            - Interface - full abstraction
              tum method'lari child'larin kendisine uyarlamasini mecbur eder.

        2- Bir class'i abstract class yapmak isterseniz
           deklarasyonuna abstract yazmalisiniz.

        3- Child class'larin mecburen uyarlamasini istedigimiz method'lari abstract method yapiyoruz
           mecburen uyarlanmasini istemedigimiz, karari child class'a biraktigimiz method'lari
           bugune kadar yaptigimiz sekilde birakiyoruz ve bu method'lara CONCRETE METHOD diyoruz.

       Son olarak;
       Abstract bir class'i parent edinen
       Abstract Child Class, parent class'daki zorunlu method'lari implement etmek zorunda degildir. Yani;
       parent'daki abstract method'lari implement etmek zorunda degildir ama isterse implement edebilir.
        */

     /* day39 ve day40 Ders Tekrarı :

        Bir interface'e sonradan bir abstract method eklersek
        O interface'i daha onceden implement eden tum class'lar
        yeni eklenen method'u implement etmek zorunda kalir.
        Buyuk projelerde interface'lere sonradan eklenen method'lar
        cok fazla class'i etkileyebilir
        Developer'lardan gelen talepler uzerine  java8'den itibaren
        bu durum icin bir istisna olusturulmustur.
        Eger bir interface'e sonradan ekledigimiz method'un
        butun child class'lari etkilemesini istemiyorsak,
        bu method'un body'si olmalidir.
        java8 ile baslanan istisna ile
        method deklarasyonunda access modifier'dan sonra
        DEFAULT veya STATIC yazilan method'lar
        interface icinde body'si olan method'lar olabilir
        boylece tum child class'larin implements etmesi de
        ZORUNLU OLMAZ.

        Aralarindaki Fark :
        default keyword kullanilan method'lar baska class'lardan
        obje olusturularak kullanilabilirken,
        static keyword kullanilan method'lar baska class'lardan
        classIsmi.staticmethodIsmi() seklinde kullanilabilir.
     */
}
