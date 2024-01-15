
package granproyecto;

public class Lista <T>{
    
    Nodo<T> cabeza;
    int longitud;
    
    public Lista(){
      this.cabeza=null;
      this.longitud=0;
    }
    
    public int getLongitud(){
      return longitud;
    }
    
    public void add(T s){
      Nodo<T> nuevo=new Nodo<T>(s,null);
        if(cabeza==null){
          cabeza=nuevo;
        } else {
            Nodo<T> aux=cabeza;
              while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
              }
           aux.setSiguiente(nuevo);
         }
      longitud++;
    }
    
    public T Obtener(int r)throws Exception{
      if(r<0 || r>=longitud){
        throw new Exception(" no se puede obtener");
      } else {
          if(r==0){
            return cabeza.getDato();
          } else {
              int cont=0;
              Nodo<T> aux=cabeza;
                while(aux.getSiguiente()!=null && cont<=(r-1)){
                  aux=aux.getSiguiente();
                  cont++;
                }
             return aux.getDato();
           }
        }
    }
    
    public void Insertar(T s,int r)throws Exception{
      if(r<0 || r>=longitud){
        throw new Exception("Imposible insertar");
      } else {
          Nodo<T> nuevo=new Nodo<T>(s,null);
            if(r==0){
              nuevo.setSiguiente(cabeza);
              cabeza=nuevo;
            } else {
                int cont=0;
                Nodo<T> aux=cabeza;
                  while(aux.getSiguiente()!=null && cont<r-1){
                    aux=aux.getSiguiente();
                    cont++;
                  }
               nuevo.setSiguiente(aux.getSiguiente());
               aux.setSiguiente(nuevo);
             }
          longitud++;
        }
    }
    
    public void Eliminar(int r)throws Exception{
      if(r<0 || r>=longitud){
        throw new Exception("Imposible eliminar");
      } else {
         if(r==0){
           cabeza=cabeza.getSiguiente();
         } else {
           int cont=0;
           Nodo<T> aux=cabeza;
             while(aux.getSiguiente()!=null && cont<r-1){
               aux=aux.getSiguiente();
               cont++;
             }
           Nodo<T> eliminar=aux.getSiguiente();
           aux.setSiguiente(eliminar.getSiguiente());
           eliminar.setSiguiente(null);
         }
         longitud--;
      }
    }
    
}
