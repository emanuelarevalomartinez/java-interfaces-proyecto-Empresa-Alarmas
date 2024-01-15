
package granproyecto;

public class Empresa {
    
    Lista<Cerca> cercas;
    Lista<Muro> muros;
    Lista<Cordon> cordones;
    Lista<Garita> garitas;
    Lista<Alarma> alarmas;
    
    Alarma alarmasClase;
    Cerca cercasClase;
    Muro murosClase;
    Garita garitasClase;
    

    public void setCercas(Lista<Cerca> cercas) {
        this.cercas = cercas;
    }

    public void setMuros(Lista<Muro> muros) {
        this.muros = muros;
    }

    public Lista<Cerca> getCercas() {
        return cercas;
    }

    public Lista<Muro> getMuros() {
        return muros;
    }

    public void setCordones(Lista<Cordon> cordones) {
        this.cordones = cordones;
    }

    public void setGaritas(Lista<Garita> garitas) {
        this.garitas = garitas;
    }

    public Lista<Cordon> getCordones() {
        return cordones;
    }

    public Lista<Garita> getGaritas() {
        return garitas;
    }

    public void setAlarmas(Lista<Alarma> alarmas) {
        this.alarmas = alarmas;
    }

    public Lista<Alarma> getAlarmas() {
        return alarmas;
    }

    public void setAlarmasClase(Alarma alarmasClase) {
        this.alarmasClase = alarmasClase;
    }

    public void setCercasClase(Cerca cercasClase) {
        this.cercasClase = cercasClase;
    }

    public void setMurosClase(Muro murosClase) {
        this.murosClase = murosClase;
    }

    public void setGaritasClase(Garita garitasClase) {
        this.garitasClase = garitasClase;
    }

    public Alarma getAlarmasClase() {
        return alarmasClase;
    }

    public Cerca getCercasClase() {
        return cercasClase;
    }

    public Muro getMurosClase() {
        return murosClase;
    }

    public Garita getGaritasClase() {
        return garitasClase;
    }
    
    
    
    
    
    public String cercasYMuros() throws Exception{
    
        int contC=0,contM=0;
        
        for (int i = 0; i <cercas.getLongitud(); i++) {
            if(cercas.Obtener(i).getCorrienteCerca()==true){
              contC++;
            }
        }
        for (int i = 0; i <muros.getLongitud(); i++) {
            if(muros.Obtener(i).getGrosorMuro()>40){
              contM++;
            }
        }
       return  "Cercas con corriente: "+(contC) +" Muros con grosor superior a 40 cm: "+ (contM);
    }
    
    public String alturaYPerimetroCordon(int opcion,int posicion) throws Exception{
      
        if(opcion==1){
        for (int i = 0; i <cercas.getLongitud(); i++) {
            if(i==posicion-1){
            return "Altura: "+cercas.Obtener(i).getAlturaCord()+" Perimetro: "+cercas.Obtener(i).getPerimetroCord();
            }
        }
        } else if(opcion==2){
           for (int i = 0; i <muros.getLongitud(); i++) {
            if(i==posicion-1){
            return "Altura: "+muros.Obtener(i).getAlturaCord()+" Perimetro: "+muros.Obtener(i).getPerimetroCord();
            }
        } 
        } else {
            System.out.println("error , opcion no valida");
        }
        return null;
    }
    
    public Lista cordonesNReparacion() throws Exception{
        Lista<Cordon> cordonoesReparacion=new Lista<Cordon>();
        for (int i = 0; i <cercas.getLongitud(); i++) {
            if(cercas.Obtener(i).getEstadoCord().equals("mal")|| cercas.Obtener(i).getEstadoCord().equals("MAL")
               || cercas.Obtener(i).getEstadoCord().equals("Mal")){
               cordonoesReparacion.add(cercas.Obtener(i));
            }
        }
        for (int i = 0; i <muros.getLongitud(); i++) {
            if(muros.Obtener(i).getEstadoCord().equals("mal")|| muros.Obtener(i).getEstadoCord().equals("MAL")
               || muros.Obtener(i).getEstadoCord().equals("Mal")){
               cordonoesReparacion.add(muros.Obtener(i));
            }
        }
        return cordonoesReparacion;
    }
    
    //Conocer cuántas y cuáles garitas de control carecen de iluminación y cuántas y cuáles no están cubiertas.
    
    // ver como se puede ponder todo en un mismo metodo 
    
    public Lista garitasSinLuz() throws Exception{
      Lista<Garita> garitasNoLuz=new Lista<Garita>();
      int cantGaSinLuz=0;
      
        for (int i = 0; i <garitas.getLongitud(); i++) {
            if(garitas.Obtener(i).getIluminadaGarita()==false){
                cantGaSinLuz++;
              garitasNoLuz.add(garitas.Obtener(i));
            }
        }
      return garitasNoLuz;
    }
    
    public Lista garitasNoCubiertas() throws Exception{
        int cantGaritasSinPersonal=0;
      Lista<Garita> garitasSinCubiertas=new Lista<Garita>();
        for (int i = 0; i <garitas.getLongitud(); i++) {
            if(garitas.Obtener(i).getPresentaPersonal()==false){
                cantGaritasSinPersonal++;
              garitasSinCubiertas.add(garitas.Obtener(i));
            }
        }
        
        return garitasSinCubiertas;
    }
    
     public Lista garitasNeReparacion() throws Exception{
       Lista<Garita> garitasNReparacion=new Lista<Garita>();
       int cantGNeReparacion=0;
         for (int i = 0; i <garitas.getLongitud(); i++) {
             if(garitas.Obtener(i).getEstadoGarita().equals("mal")||
                garitas.Obtener(i).getEstadoGarita().equals("MAL") ||
                garitas.Obtener(i).getEstadoGarita().equals("Mal")){
               cantGNeReparacion++;
               garitasNReparacion.add(garitas.Obtener(i));
             }
         }
         return garitasNReparacion;
     }
    
     public int alarmasNecesarias(){
       return garitas.getLongitud()-alarmas.getLongitud();
     }
     
     public int alarNoExixten() throws Exception{
       int cantAlNoExisten=0;
         for (int i = 0; i <alarmas.getLongitud(); i++) {
             if(alarmas.Obtener(i).getExisteAlarma()==false){
               cantAlNoExisten++;
             }
         }
         return cantAlNoExisten;
     }
     
     public int alaNoFunc() throws Exception{
       int cantAlaNoFun=0;
         for (int i = 0; i <alarmas.getLongitud(); i++) {
             if(alarmas.Obtener(i).getEstadoAlarma().equals("mal")||
                alarmas.Obtener(i).getEstadoAlarma().equals("Mal")||
                alarmas.Obtener(i).getEstadoAlarma().equals("MAL")){
               cantAlaNoFun++;
             }
         }
         return cantAlaNoFun;
     }
     
}
