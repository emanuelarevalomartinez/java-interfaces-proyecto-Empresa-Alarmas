
package granproyecto;

public class Cordon {
    private double perimetroCord;
    private double alturaCord;
    private String estadoCord;
    private int id;
    private static int aumentar=0;

    public Cordon(double perimetroCord, double alturaCord, String estadoCord) {
        this.perimetroCord = perimetroCord;
        this.alturaCord = alturaCord;
        this.estadoCord = estadoCord;
        aumentar++;
        this.id=aumentar;
    }

    public int getId() {
        return id;
    }

    public static int getAumentar() {
        return aumentar;
    }
    
    

    public void setPerimetroCord(double perimetroCord) {
        this.perimetroCord = perimetroCord;
    }

    public void setAlturaCord(double alturaCord) {
        this.alturaCord = alturaCord;
    }

    public void setEstadoCord(String estadoCord) {
        this.estadoCord = estadoCord;
    }

    public double getPerimetroCord() {
        return perimetroCord;
    }

    public double getAlturaCord() {
        return alturaCord;
    }

    public String getEstadoCord() {
        return estadoCord;
    }
   
    
    
}
