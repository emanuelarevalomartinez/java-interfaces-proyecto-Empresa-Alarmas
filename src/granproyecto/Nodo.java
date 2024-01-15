
package granproyecto;

public class Nodo <T>{
    
    T dato;
    Nodo siguiente;

    public Nodo(T dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    
    
    
}
