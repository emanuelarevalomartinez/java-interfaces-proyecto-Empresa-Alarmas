
package granproyecto;

public class Muro extends Cordon{
    
    private double grosorMuro;
    private String materialMuro;

    public Muro(double grosorMuro, String materialMuro, double perimetroCord, double alturaCord, String estadoCord) {
        super( perimetroCord, alturaCord, estadoCord);
        this.grosorMuro = grosorMuro;
        this.materialMuro = materialMuro;
    }

   

    public void setGrosorMuro(double grosorMuro) {
        this.grosorMuro = grosorMuro;
    }

    public void setMaterialMuro(String materialMuro) {
        this.materialMuro = materialMuro;
    }

    public double getGrosorMuro() {
        return grosorMuro;
    }

    public String getMaterialMuro() {
        return materialMuro;
    }
    
    public int murosMasde40(){
      int cont=0;
        if(getGrosorMuro()>40){
          cont++;
        }
        return cont;
    }
    
}
