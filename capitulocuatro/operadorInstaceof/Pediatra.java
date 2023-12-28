package operadorInstaceof;

public class Pediatra extends Medico{
    protected enum tipologia{NEUROLOGO,PSICOLOGO};
    tipologia tipo;
    
    public tipologia getTipo() {
        return tipo;
    }
    public void setTipo(tipologia tipo) {
        this.tipo = tipo;
    }

    
    
}