import java.util.Scanner;

public class GeschwindigkeitAuto{
	
    public static void einlesenGeschwindigkeit(int geschwindigkeit[]){
        
    	//Array-Index
        int i = 0;
        
        //eingelesener Wert
        int wert = 0;
        
        //Scanner f�r Einlesen von der Konsole intialisieren
        Scanner sc = new Scanner(System.in);
        
        //F�hrt solange aus, wie i (L�nge des bereits gef�llt Array - 1) kleiner als Gesamtl�nge des Array und der eingelesene Wert ungleich -1 ist
        //Geht aus der Schleife, wenn i = L�nge des Arrays oder wenn eingelesener Wert = -1 ist
        while(i < geschwindigkeit.length && wert != -1){
        	
            System.out.println("Eingabe:");
            
            //Wert einlesen
            wert = sc.nextInt();
            
            //�berpr�fung, ob eingelesener Wert zwischen 0 und 300 liegt
            if(wert >= 0 && wert <= 300){
            	
            	//eingelesenen Wert in Array schreiben
                geschwindigkeit[i] = wert;
                
                //i um 1 erh�hen, um n�chsten eingelesenen Wert an die n�chste Stelle im Array schreiben
                i++;                
            }
        }
        
      //Scanner schlie�en
        sc.close();
    }
    
    public static void ausgeben(int geschwindigkeit[]){
        
    	//�berpr�fung, ob Array wirklich existiert
        if(geschwindigkeit != null){
        	
        	//forEach-Schleife
            for(int i : geschwindigkeit){
            	
            	//Ausgabe
                System.out.println("Geschwindigkeit: " + i + " km/h");
            }
        } 
    }
}