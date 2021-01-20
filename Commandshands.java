import java.util.Scanner;

public class Commandshands {
    public static void hands() {
        Scanner input = new Scanner(System.in);
        while (true) {
            String command;
            String close;
            GO.run();
            command = input.nextLine();
            if (command.equals("Go")){GO.go();}
            else if (command.equals("Time")){GO.time();}
            else if (command.equals("Help")){GO.help();}
            else if (command.equals("Close")){
                GO.print("Garsonlar gidicek eminmisiniz Evet/Hayır");
                close = input.nextLine();
                if (close.equals("Evet")){GO.print("Garsonlar gidiyor");break;}
                else if (close.equals("Hayır")){GO.print("Garsonlar müzik çalmaya devam ediyor");}
            }
            else if (command.equals("Versionn")){GO.versionn();}
            else if (command.equals("")){GO.print("Garsonlar hiçbirşey yapmıyor...");}
            else if (command.equals(" ")){GO.print("Garsonlar hiçbirşey yapmıyor...");}
            else {System.out.println(command + " İsimli komut bulunamadı");}
        }
    }
}
