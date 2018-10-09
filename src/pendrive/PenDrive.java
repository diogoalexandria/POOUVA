package pendrive;

public class PenDrive {
    private int capacidade;
    private double comprimento;
    private double largura;
    private double profundidade;
    private double peso;
    private double preco;
    private String marca;
    private String modelo;
    private final String tipoInterface = "USB";
    
    //Setters
    public void setCapacidade(int capacidade) {
        if(!(capacidade < 0 || capacidade > Integer.MAX_VALUE))
        this.capacidade = capacidade;
    }
    public void setComprimento(double comprimento) {
        if(!(comprimento < 0 || comprimento > 1000))
        this.comprimento = comprimento;
    }
    public void setLargura(double largura) {
        if(!(largura < 0 || largura > 1000))
        this.largura = largura;
    }
    public void setProfundidade(double profundidade) {
        if(!(profundidade < 0 || profundidade > 1000))
        this.profundidade = profundidade;
    }
    public void setPeso(double peso) {
        if(!(peso < 0 || peso > 1000))
        this.peso = peso;
    }
    public void setPreco(double preco) {
        if(!(preco < 0 || preco > 1000))
        this.preco = preco;
    }
    public void setMarca(String marca) {
        if(marca != null)
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        if(modelo != null)
        this.modelo = modelo;
    }    
    
    //Getters
    public int getCapacidade() {
        return capacidade;
    }
    public double getComprimento() {
        return comprimento;
    }
    public double getLargura() {
        return largura;
    }
    public double getProfundidade() {
        return profundidade;
    }
    public double getPeso() {
        return peso;
    }
    public double getPreco() {
        return preco;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }   
    public String getTipoInterface(){
        return tipoInterface;
    }
    
}
