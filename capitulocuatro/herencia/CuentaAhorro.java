package herencia;

public class CuentaAhorro extends Cuenta{
    private boolean activa;

    public CuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo<10000) {
            activa=false;
        } else{
            activa = true;
        }
        
    }

    public void retirar(float cantidad){
        if (activa) {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad){
        if (activa) {
            super.consignar(cantidad);
        }
    }

    public void extractoMensaul(){
        if (numeroRetiros>4) {
            comisionMensual+=(numeroRetiros-4)*1000;
        }
        super.extractoMensual();
        if (saldo<10000) {
            activa=false;
        }
    }

    public void imprimir(){
        System.out.println("Saldo = $"+saldo);
        System.out.println("Comision mensual = $"+comisionMensual);
        System.out.println("Numero de Transacciones = "+(numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
    
}
