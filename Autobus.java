
/**
 * Write a description of class Autobus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Autobus{
    
    private String kennzeichen;
    private int sitzplaetze;
    private boolean anhaenger;
    
    public Autobus(){
        setKennzeichen("W-1234A");
        setSitzplaetze(29);
        setAnhaenger(false);
    }
    
    public Autobus(String kz, int sp, boolean anh){
        setKennzeichen(kz);
        setSitzplaetze(sp);
        setAnhaenger(anh);
    }
    
    public String getKennzeichen(){
        return kennzeichen;
    }
    
    public int getSitzplaetze(){
        return sitzplaetze;
    }
    
    public boolean getAnhaenger(){
        return anhaenger;
    }
    
    public void setKennzeichen(String kennzeichen){
        this.kennzeichen=kennzeichen;
    }
    
    public void setSitzplaetze(int sitzplaetze){
        this.sitzplaetze=sitzplaetze;
    }
    
    public void setAnhaenger(boolean anhaenger){
        this.anhaenger=anhaenger;
    }
    
    
    
}