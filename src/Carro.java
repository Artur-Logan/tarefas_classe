public class Carro {

    private String placa;

    private String marca;

    private String cor;

    private String nome;

    private Integer numeroDeCavalos;

    public void ligar(){
        System.out.println("Carro Ligado!!!");
    }

    public void andarNoCarro(){
        System.out.println("Você está andando no carro!!!");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor(String vermelho) {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDeCavalos() {
        return numeroDeCavalos;
    }

    public void setNumeroDeCavalos(Integer numeroDeCavalos) {
        this.numeroDeCavalos = numeroDeCavalos;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                ", numeroDeCavalos=" + numeroDeCavalos +
                '}';
    }
}
