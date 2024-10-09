
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
    private boolean lastMinute;
    
    //Konstruktor
    public Urlaub (String neuOrt, int neuPreis, boolean neuAllInklusiv) {
        setOrt(neuOrt);
        setPreis(neuPreis);
        setAllInklusiv(neuAllInklusiv);
    }
    
    public Urlaub () {
        setOrt("New York");
        setPreis(2000);
        setAllInklusiv(false);
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
    public void setOrt (String neuOrt) {
        ort = neuOrt;
    }
    
    public void setPreis (int neuPreis) {
        preis = neuPreis;
    }
    
    public void setAllInklusiv (boolean neuAllInklusiv) {
        allInklusiv = neuAllInklusiv;
    }
    
    //Weitere Methoden
    public int preisReduktion (int aenderung) {
        int neuPreis = preis - aenderung;
        setPreis(neuPreis);
        return neuPreis;
    }
    
    public void print () {
        System.out.print("Urlaubsort: " + ort + "\n" + 
        "Preis: " + preis + "\n" + 
        "Allinklusiv: " + allInklusiv);
    }

}
