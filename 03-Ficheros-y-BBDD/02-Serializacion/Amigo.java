public class Amigo implements java.io.Serializable{

    public String nombre;
    public int movil;

    public Amigo(String nombre, int movil) {
        this.nombre = nombre;
        this.movil = movil;
    }

    public String toString(){
        return nombre+" - ("+movil+")";
    }
}