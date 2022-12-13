
//Zum Testen der Methoden der Klasse GeschwindigkeitAuto
public class GeschwindigkeitAutoTesttreiber{
    public static void main(String[] args){
        
    	//Erstellen von int-Array geschwindigkeit von beliebiger Größe
        int geschwindigkeit[] = new int[2];
        
        int geschwindigkeit2[] = new int[2];
        
        //Aufruf von Funktion einlesenGeschwindigkeit der Klasse GeschwindigkeitAuto
        // Übergeben von Array geschwindigkeit
        GeschwindigkeitAuto.einlesenGeschwindigkeit(geschwindigkeit);
        
        GeschwindigkeitAuto.einlesenGeschwindigkeit(geschwindigkeit2);
        
        //Aufruf von Funktion ausgeben der Klasse GeschwindigkeitAuto
        // Übergeben von Array geschwindigkeit
        GeschwindigkeitAuto.ausgeben(geschwindigkeit);
        
        GeschwindigkeitAuto.ausgeben(geschwindigkeit2);
        
        
        
    }
}