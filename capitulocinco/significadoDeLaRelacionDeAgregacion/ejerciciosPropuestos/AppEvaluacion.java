package significadoDeLaRelacionDeAgregacion.ejerciciosPropuestos;

public class AppEvaluacion {
    public static void main(String[] args) {
        // Crear un artículo
        Articulo articulo = new Articulo();

        // Agregar secciones al artículo
        Seccion seccion1 = new Seccion();
        seccion1.setTitulo("Introducción");
        seccion1.agregarAutor("Andrew Gonzales");
        seccion1.agregarAutor("Devin Llerena");
        seccion1.agregarAutor("Jesus Bone");
        articulo.agregarSeccion(seccion1);

        Seccion seccion2 = new Seccion();
        seccion2.setTitulo("Desarrollo");
        seccion2.agregarAutor("Dany Barrera");
        articulo.agregarSeccion(seccion2);

        Subseccion subseccion = new Subseccion(1);
        seccion2.agregarSubseccion(subseccion);

        Parrafo parrafo = new Parrafo(10, 150);
        subseccion.agregarParrafo(parrafo);

        seccion1.agregarComentario(new Comentario("Introduccion bien redactada."));
        seccion1.agregarComentario(new Comentario("Revisar la metodologia."));

        subseccion.agregarComentario(new Comentario("Contenido faltante."));
        subseccion.agregarComentario(new Comentario("Ejemplos incorrectos."));

        parrafo.agregarComentario(new Comentario("Argumento sin sentido"));
        parrafo.agregarComentario(new Comentario("Falta de detalle en explicacion"));

        articulo.setComentado("Aceptado con modificaciones");

        Evaluacion.imprimirComentarios(articulo.getSecciones());

        System.out.println("\nConcepto: " + articulo.getConcepto());
    }
}
