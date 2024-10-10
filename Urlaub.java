
/**
 * Klasse Urlaub.
 * 
 * @author (Josef Grohsebner) 
 * @version (03.10.2024)
 */
public class Urlaub
{
    private String ort;
    private int preis;
    private boolean allInklusiv;
    
    //Konstruktor
    public Urlaub (String neuOrt, int neuPreis, boolean neuAllInklusiv) {
        setOrt(neuOrt);
        setPreis(neuPreis);
        setAllInklusiv(neuAllInklusiv);
    }
    
    public Urlaub () {
        setOrt("New York");
        setPreis(2000);
        setAllInklusiv(true);
    }
    //Getters
    public String getOrt () {
        return ort;
    }
    
    public int getPreis () {
        return preis;
    }
    
    public boolean isAllInklusiv () {
        return allInklusiv;
    }
    
    //Setter
    public void setOrt (String ort) {
        this.ort = ort;
    }
    
    public void setPreis (int preis) {
        if(preis <= 0) {
            throw new IllegalArgumentException("Fehler setPreis: muss größer als null sein. (" + preis + ")");
        }
        this.preis = preis;
    }
    
    public void setAllInklusiv (boolean neuAllInklusiv) {
        allInklusiv = neuAllInklusiv;
    }
    
    //Weitere Methoden
    public int preisAenderung (int aenderung, char plusMinus) {
        if (plusMinus != '+' && plusMinus != '-') {
            throw new IllegalArgumentException ("Fehler preisAenderung: preis kann nur subtrahiert oder addiert werden. (" + plusMinus + ")");
        }
        int neuPreis;
        if (plusMinus == '-') {
        neuPreis = preis - aenderung;
        } else {
        neuPreis = preis + aenderung;
        }
        setPreis(neuPreis);
        return neuPreis;
    }
    
    public void print () {
        System.out.print("Urlaubsort: " + ort + "\n" + 
        "Preis: " + preis + " EUR" + "\n" + 
        "Allinklusiv: " + allInklusiv);
    }

}
