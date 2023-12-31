package herencia;

public class CuentaCorriente extends Cuenta{
    protected float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.sobregiro = 0;
    }

    public void retirar(float cantidad){
        float resultado = saldo - cantidad;

        if(resultado<0){
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }
    public void consignar(float cantidad){
        float residuo=sobregiro-cantidad;
        if (sobregiro>0) {
            if (residuo>0) {
                sobregiro=0;
                saldo = residuo;
            } else {
                sobregiro=-residuo;
                saldo=0;
            }
        } else {
            super.consignar(cantidad);
        }
    }

    public void extractoMensaul(){
        super.extractoMensual();
    }

    public void imprimir(){
        System.out.println("Saldo = $"+saldo);
        System.out.println("Comision mensual = $"+comisionMensual);
        System.out.println("Numero de Transacciones = "+(numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
}
