
package granproyecto;

public class Garita {
    
    private int numeracion;
    private boolean iluminadaGarita;
    private boolean presentaPersonal;
    private String estadoGarita;

    public Garita(int numeracion, boolean iluminadaGarita, boolean presentaPersonal, String estadoGarita) {
        this.numeracion = numeracion;
        this.iluminadaGarita = iluminadaGarita;
        this.presentaPersonal = presentaPersonal;
        this.estadoGarita = estadoGarita;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public void setIluminadaGarita(boolean iluminadaGarita) {
        this.iluminadaGarita = iluminadaGarita;
    }

    public void setPresentaPersonal(boolean presentaPersonal) {
        this.presentaPersonal = presentaPersonal;
    }

    public void setEstadoGarita(String estadoGarita) {
        this.estadoGarita = estadoGarita;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public boolean getIluminadaGarita() {
        return iluminadaGarita;
    }

    public boolean getPresentaPersonal() {
        return presentaPersonal;
    }

    public String getEstadoGarita() {
        return estadoGarita;
    }
    
    
    
}
