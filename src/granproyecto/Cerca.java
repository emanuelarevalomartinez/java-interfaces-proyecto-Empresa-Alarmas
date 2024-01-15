
package granproyecto;

public class Cerca extends Cordon{
    
    private String tipoAlambreCerca;
    private boolean corrienteCerca;

    public Cerca(String tipoAlambreCerca, boolean corrienteCerca, double perimetroCord, double alturaCord, String estadoCord) {
        super(perimetroCord, alturaCord, estadoCord);
        this.tipoAlambreCerca = tipoAlambreCerca;
        this.corrienteCerca = corrienteCerca;
    }

    public void setTipoAlambreCerca(String tipoAlambreCerca) {
        this.tipoAlambreCerca = tipoAlambreCerca;
    }

    public void setCorrienteCerca(boolean corrienteCerca) {
        this.corrienteCerca = corrienteCerca;
    }

    public String getTipoAlambreCerca() {
        return tipoAlambreCerca;
    }

    public boolean getCorrienteCerca() {
        return corrienteCerca;
    }
    
   
    
}
