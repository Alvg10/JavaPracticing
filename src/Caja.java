public class Caja<T> {
    private T contenido;

    public Caja(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public void mostrarContenidazo() {
        System.out.println("Contenido de la caja: " + contenido);

    }
    
        /** Vacía el contenido de la caja */
        public void vaciar() {
            this.contenido = null;
        }
    
        /** Verifica si la caja está vacía */
        public boolean estaVacia() {
            return this.contenido == null;
        }
    
        /** Intercambia el contenido con otra caja */
        public void intercambiarContenido(Caja<T> otraCaja) {
            T temp = this.contenido;
            this.contenido = otraCaja.contenido;
            otraCaja.contenido = temp;
        }
    
        @Override
        public String toString() {
            return "Caja{" + "contenido=" + contenido + '}';
        }
    

}


