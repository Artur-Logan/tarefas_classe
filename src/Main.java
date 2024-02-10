//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Carro carro = new Carro();

    carro.setPlaca("ABC-1234");
    carro.setCor("Vermelho");
    carro.setMarca("Renault");
    carro.setNome("Logan");
    carro.setNumeroDeCavalos(82);

    String string = carro.toString();
    System.out.println(string);

    carro.ligar();
    carro.andarNoCarro();
    }
}