
package granproyecto;

public class Alarma {
    
    
    private int plantillaAlarma;
    private boolean existeAlarma;
    private String estadoAlarma;

    public Alarma(int plantillaAlarma, boolean existeAlarma, String estadoAlarma) {
        this.plantillaAlarma = plantillaAlarma;
        this.existeAlarma = existeAlarma;
        this.estadoAlarma = estadoAlarma;
    }

    public void setPlantillaAlarma(int plantillaAlarma) {
        this.plantillaAlarma = plantillaAlarma;
    }

    public void setExisteAlarma(boolean existeAlarma) {
        this.existeAlarma = existeAlarma;
    }

    public void setEstadoAlarma(String estadoAlarma) {
        this.estadoAlarma = estadoAlarma;
    }

    public int getPlantillaAlarma() {
        return plantillaAlarma;
    }

    public boolean getExisteAlarma() {
        return existeAlarma;
    }

    public String getEstadoAlarma() {
        return estadoAlarma;
    }
    
    
    
}
