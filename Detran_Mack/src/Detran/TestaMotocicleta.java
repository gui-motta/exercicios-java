package Detran;
public class TestaMotocicleta {
    public static void main(String[] args) {
    Motocicleta moto = new Motocicleta();
        moto.setModelo("Honda");
        moto.marca = "Honda";
        moto.nroChassi = 123456;
        moto.nroPlaca = "ILK1993";
        moto.cor = "Vermelha";
        moto.nroCilindradas = 150;
        System.out.println("Mês licenciamento = " +moto.licenciar(moto.nroPlaca));
        int nro=1234;
        if(moto.checaChassi(nro))
            System.out.println("Chassi Verdadeiro");
        else
            System.out.println("Chassi Falso");
    }
    
}
