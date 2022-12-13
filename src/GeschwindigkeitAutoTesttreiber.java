public class GeschwindigkeitAutoTesttreiber {
    public static void main(String[] args){
        int geschwindigkeiten[] = new int[2];

        int geschwindigkeiten2[] = new int[2];

        GeschwindigkeitAuto.einlesenGeschwindigkeit(geschwindigkeiten);

        GeschwindigkeitAuto.einlesenGeschwindigkeit(geschwindigkeiten2);

        GeschwindigkeitAuto.ausgeben(geschwindigkeiten);

        GeschwindigkeitAuto.ausgeben(geschwindigkeiten2);
    }
}
