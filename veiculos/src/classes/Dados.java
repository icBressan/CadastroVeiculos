package classes;

public class Dados {
    // Declaração de variáveis de instância
    private int Placa, Chassi, telr;
    private String Nomem, Marca, Modelo, revend, tipo;
    private double Kmi, Kmf; // quilometragem
    private String Datam; // Data movimentacao

    // Array estático para armazenar objetos
    public static Dados lista_veic[] = new Dados[5];

    // Métodos getters e setters para cada variável de instância
    public int getTelr() {
        return telr;
    }

    public void setTelr(int telr) {
        this.telr = telr;
    }

    public int getChassi() {
        return Chassi;
    }

    public void setChassi(int Chassi) {
        this.Chassi = Chassi;
    }
    
    public int getPlaca() {
        return Placa;
    }

    public void setPlaca(int Placa) {
        this.Placa = Placa;
    }

    public String getNomem() {
        return Nomem;
    }

    public void setNomem(String Nomem) {
        this.Nomem = Nomem;
    }
    
    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRevend() {
        return revend;
    }

    public void setRevend(String revend) {
        this.revend = revend;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public double getKmi() {
        return Kmi;
    }

    public void setKmi(double Kmi) {
        this.Kmi = Kmi;
    }

    public double getKmf() {
        return Kmf;
    }

    public void setKmf(double Kmf) {
        this.Kmf = Kmf;
    }

    public String getDatam() {
        return Datam;
    }

    public void setDatam(String Datam) {
        this.Datam = Datam;
    }
}
