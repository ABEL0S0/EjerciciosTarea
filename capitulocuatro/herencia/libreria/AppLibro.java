package herencia.libreria;

public class AppLibro {
    public static void main(String[] args) {
        Libro libropsicologo = new Libro("La Mente Humana", "Jesus Patricio Bone Andrade", 100);
        LibroDeTexto libroCiencias = new LibroDeTexto("Ciencias Basicas", "Dany Barrera", 15, "10MO");
        LibroDeTextoU librodeleyes = new LibroDeTextoU("Creacion de leyes utilizando los derechos humanos", "Devin Llerena", 40, "4to Semestre", "Derechos");
        Novelas novela = new Novelas("Las aventuras de Dany en la farmacia", "Andrew Gonzales", (float) 9.99, "Ciencia Ficcion");
        
        //Metodo de mostrar informacion
        libropsicologo.MostrarInfo();
        libroCiencias.MostrarInfo();
        librodeleyes.MostrarInfo();
        novela.MostrarInfo();
        
    }
}
