import java.time.LocalTime;

public class GO {
    public static void print(String text){System.out.println(text);}
    public static void go(){System.out.println("GO Garson Orkestrası nın kısaltımıdır");}
    public static void run(){System.out.print("GO$ ");}
    public static void time(){LocalTime time = LocalTime.now(); System.out.println(time);}
    public static void versionn(){System.out.println("Versionn: 0.0.3");}
    public static void help(){
        System.out.println("");
        System.out.println("Go               Go isminin anlamını yazar");
        System.out.println("Time             O anki saat i gösterir");
        System.out.println("Verisonn         GO(Garson Orkestrası) nun  sürümünü gösterir");
        System.out.println("Close            Garsonların gidip gitmemesi için soru sorar Evet/Hayır");
        System.out.println("");
    }
}