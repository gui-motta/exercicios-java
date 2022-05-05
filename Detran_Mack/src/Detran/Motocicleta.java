package Detran;
public class Motocicleta {
    public String modelo;
    public String marca;
    public int nroChassi;
    String nroPlaca;
    String cor;
    int nroCilindradas;
    public String licenciar(String placa){
        String mes = " ";
        int tamanho = placa.length();
        String ultimo = placa.substring(tamanho-1);
        switch(ultimo){
            case "1":
                mes = "abril";
                break;
            case "2":
                mes = "maio";
                break;
            case "3":
                mes = "junho";
                break;
            case "4":
                mes = "julho";
                break;
            case "5":
                mes = "agosto";
                break;
            case "6":
                mes = "agosto";
                break;
            case "7":
                mes = "setembro";
                break;
            case "8":
                mes = "outubro";
                break;
            case "9":
                mes = "novembro";
                break;
            case "0":
                mes = "dezembro";
                break;
        }
    
    return mes;
    }

    public boolean checaChassi(int nro){
        boolean teste;
        if(getNroChassi() == nro)
           teste = true;
        else
            teste = false;
    return teste;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the nroChassi
     */
    public int getNroChassi() {
        return nroChassi;
    }

    /**
     * @param nroChassi the nroChassi to set
     */
    public void setNroChassi(int nroChassi) {
        this.nroChassi = nroChassi;
    }
   
}
