public class Aluguel
{
    private int codigo;
    private String dataInicio;
    private String dataFim;
    private Imovel imovel;
    private Cliente cliente;
    
    public Aluguel(int cod, String dti, String dtf, Imovel imo, Cliente cli){
        codigo = cod;
        dataInicio = dti;
        dataFim = dtf;
        imovel = imo;
        cliente = cli;
    }
    
    public void exibeDados(){
        System.out.println("Código: " + codigo);
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Data de Fim: " + dataFim);
        imovel.exibeDados();
        System.out.println("Cliente: " + cliente.getNome());
        //utiliza o metodo getNome dentro do System.print.out, busca info na classe
        //Cliente, que está com vinculo simples, mas apenas o nome do cliente.
    }
}