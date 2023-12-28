package significadoDeLaRelacionDeAgregacion.ejerciciosPropuestos;

import java.util.Vector;

public class Evaluacion {
    public Vector<Comentario> comentarioVector;

    public Evaluacion() {
        this.comentarioVector = new Vector<>();
    }

    public void agregarComentario(Comentario comentario) {
        comentarioVector.add(comentario);
    }

    public Vector<Comentario> getComentarioVector() {
        return comentarioVector;
    }

    public void setComentarioVector(Vector<Comentario> comentarioVector) {
        this.comentarioVector = comentarioVector;
    }

    protected static void imprimirComentarios(Vector<Seccion> secciones) {
        if (secciones != null) {
            for (Seccion seccion : secciones) {
                System.out.println(seccion);
                System.out.println("Comentarios de la sección:");
                if (seccion.getComentarioVector() != null) {
                    for (Comentario comentario : seccion.getComentarioVector()) {
                        System.out.println("- " + comentario.getTexto());
                    }
                }

                for (Subseccion subseccion : seccion.getSubsecciones()) {
                    System.out.println("Comentarios de la subsección:");
                    if (subseccion.getComentarioVector() != null) {
                        for (Comentario comentario : subseccion.getComentarioVector()) {
                            System.out.println("  - " + comentario.getTexto());
                        }
                    }
                    for (Parrafo parrafo : subseccion.getParrafos()) {
                        System.out.println("Comentarios del párrafo:");
                        if (parrafo.getComentarioVector() != null) {
                            for (Comentario comentario : parrafo.getComentarioVector()) {
                                System.out.println("    - " + comentario.getTexto());
                            }
                        }
                    }
                }
                if (seccion.getSubsecciones() != null) {
                    for (Subseccion subseccion : seccion.getSubsecciones()) {
                        imprimirComentarios(subseccion.getSecciones());
                    }
                }
            }
        }
    }
}