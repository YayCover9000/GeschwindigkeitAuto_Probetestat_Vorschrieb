import java.util.Scanner;
public class GeschwindigkeitAuto {
    public static void einlesenGeschwindigkeit(int geschwindigkeiten[]){
        Scanner sc = new Scanner(System.in);


        for(int i = 0; i<geschwindigkeiten.length; i++){
            System.out.println("Eingabe:");
            int tempo = sc.nextInt();
            if(tempo==-1){
                return;
            }else{
                if(tempo >= 1 && tempo <= 300){
                    geschwindigkeiten[i] = tempo;
                }
            }
        }


    }
    public static void ausgeben(int geschwindigkeiten[]){
        if(geschwindigkeiten != null){
        }
        for(int i : geschwindigkeiten){
            System.out.println("Geschwindigkeit: " + i + " km/h");
        }
    }
}


