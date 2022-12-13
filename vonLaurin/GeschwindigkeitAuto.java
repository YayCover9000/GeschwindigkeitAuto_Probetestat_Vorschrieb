import java.util.Scanner;

public class GeschwindigkeitAuto{
	
    public static void einlesenGeschwindigkeit(int geschwindigkeit[]){
        
    	//Array-Index
        int i = 0;
        
        //eingelesener Wert
        int wert = 0;
        
        //Scanner für Einlesen von der Konsole intialisieren
        Scanner sc = new Scanner(System.in);
        
        //Führt solange aus, wie i (Länge des bereits gefüllt Array - 1) kleiner als Gesamtlänge des Array und der eingelesene Wert ungleich -1 ist
        //Geht aus der Schleife, wenn i = Länge des Arrays oder wenn eingelesener Wert = -1 ist
        while(i < geschwindigkeit.length && wert != -1){
        	
            System.out.println("Eingabe:");
            
            //Wert einlesen
            wert = sc.nextInt();
            
            //Überprüfung, ob eingelesener Wert zwischen 0 und 300 liegt
            if(wert >= 0 && wert <= 300){
            	
            	//eingelesenen Wert in Array schreiben
                geschwindigkeit[i] = wert;
                
                //i um 1 erhöhen, um nächsten eingelesenen Wert an die nächste Stelle im Array schreiben
                i++;                
            }
        }
        
      //Scanner schließen
        sc.close();
    }
    
    public static void ausgeben(int geschwindigkeit[]){
        
    	//Überprüfung, ob Array wirklich existiert
        if(geschwindigkeit != null){
        	
        	//forEach-Schleife
            for(int i : geschwindigkeit){
            	
            	//Ausgabe
                System.out.println("Geschwindigkeit: " + i + " km/h");
            }
        } 
    }
}