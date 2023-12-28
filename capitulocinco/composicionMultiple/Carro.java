package composicionMultiple;

public class Carro {
    Motor motor;
    Chasis chasis;
    Llanta[] llantas;
    Carroceria carroceria;
    Asiento[] Asientos;
    Airbags[] airbags;

    public Carro(int volumen, tipoChasis claseChasis, String color, tipoCarroceria claseCarroceria,
     String marca, int diametro, int altura, int anchura,int asen, String materialAsiento, Boolean funda,
     String materialAir, double temInflar) {
        motor = new Motor(volumen); 
        chasis = new Chasis(claseChasis); 
        llantas = new Llanta[4];  
        Asientos = new Asiento[asen];
        airbags = new Airbags[2];
        for (int i = 0; i < llantas.length; i++) {
            llantas[i] = new Llanta(marca,diametro,altura,anchura);
        }
        for (int i = 0; i < Asientos.length; i++) {
            Asientos[i] = new Asiento(materialAsiento,funda);
        }
        for (int i = 0; i < airbags.length; i++) {
            airbags[i] = new Airbags(temInflar, materialAir);
        }
        carroceria = new Carroceria(color,claseCarroceria);
    }

    public void imprimir(){
        System.out.println("Datos del Carro");
        System.out.println("Chasis - Tipo: "+chasis.tipo);
        System.out.println("Carroceria - Tipo: "+carroceria.tipo+" Color"+carroceria.color);
        System.out.println("Llantas - Cantidad: "+llantas.length);
        for(int i=0;i<llantas.length;i++){
            llantas[i].imprimir();
        }
        System.out.println("Asientos - Cantidad: "+Asientos.length);
        for(int i=0;i<Asientos.length;i++){
            Asientos[i].imprimir();
        }
        System.out.println("Airbags - Cantidad: "+airbags.length);
        for(int i=0;i<airbags.length;i++){
            airbags[i].imprimir();
        }
    }

}
