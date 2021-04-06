

public class Imovel
{
    private int codigo;
    private String descricao;
    private double precoAluguel;
    private int minimoMeses;
    
    public Imovel(int cod, String des, double pre, int min){
        codigo = cod;
        descricao = des;
        precoAluguel = pre;
        minimoMeses = min;
    }
    
    public void exibeDados(){
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço do aluguel: " + precoAluguel);
        System.out.println("Mínimo de meses para aluguel: " + minimoMeses);
    }
}
