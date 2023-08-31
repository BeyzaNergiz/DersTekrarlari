package Maps;

public class DersTekrari_TreeMapMethodlari {

    /*
    TREEMAP METHOD'LARI :

    treeMapismi.tailMap(fromkey) :
    Verilen key'den sonraki ilk key'den itibaren değerleri dondurur.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.tailMap("L")); // {L=10, T=5, Z=50}

    treeMapismi.headMap(key ) : verilen key exclusive olarak oncesindeki entry’leri verir
    treeMapismi.headMap(key, true ) : verilen key inclusive olarak oncesindeki entry’leri verir
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.headMap("T")); // {A=15, K=25, L=10}


    treeMapismi.ceilingKey(key) :
    Verilen key treeMap’de varsa, o key’i dödürür.
    Verilen key treeMap’de yoksa verilen key’den buyuk olan ilk key’i döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.ceilingKey("K")); // K buyuk esit
    treeMapismi.ceilingEntry(key) :
    verilen key treeMap’de varsa, o key’e ait entry’yi, verilen
    key treeMap’de yoksa, verilen key’den buyuk olan ilk key’e ait entry’yi döndürür.
    Eger verilen key treeMap’de yoksa ve girilen key degerinden buyuk baska key yoksa
    null döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.ceilingEntry("K")); //  K=25

    treeMapismi.floorKey(key) :
    treeMapismi.floorEntry(key) :verilen key treeMap’de yoksa verilen key’den kucuk olan ilk key’i döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.floorKey("K")); // K  (kucuk esit)
    System.out.println(harfler.floorKey("M")); // L (M olmadığı icin siralamadaki daha kucuk ASCİİ değerine sahip ilk harfi aldi.)

    treeMapismi.pollFirstEntry( ) :Verilen entry’deki ilk entry'i silip, bize döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.pollFirstEntry()); // A=15
    System.out.println(harfler); // {K=25, L=10, T=5, Z=50}
    treeMapismi.pollLastEntry( ) : Verilen entry’deki son entry'i silip, bize döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.pollLastEntry()); // Z=50
    System.out.println(harfler); // {K=25, L=10, T=5}


    treeMapismi.descendingMap( ) : gecici olarak tree map’i descending siralar.
    System.out.println(harfler.descendingKeySet()); // [T, L, K]
    System.out.println(harfler.descendingMap()); // {T=5, L=10, K=25}
    harfler = harfler.descendingMap(); ==> TreeMap doğal sıralı olduğundan tersten sıralamayı kaydetmeye izin vermez.
    harfler'i yazdırdığımızda descendingMap()'nun yaptığı değişikliği de tanımamış olur.

    treeMapismi.higherKey(key) : Verilen key’den buyuk olan ilk key’i döndürür.
    treeMapismi.higherEntry(key) : Verilen key’den buyuk olan ilk key’e ait entry’yi döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.higherKey("K")); // L buyuk
    System.out.println(harfler.higherEntry("K"));  //  L=10

    treeMapismi.lowerKey(key) : Verilen key’den kucuk olan ilk key’i döndürür.
    treeMapismi.lowerEntry(key) : Verilen key’den kucuk olan ilk key’e ait entry’yi döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.lowerKey("K")); // A (K'dan kucuk ilk Key => A)
    System.out.println(harfler.lowerKey("M")); // L

     */
}
