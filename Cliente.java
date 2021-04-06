
public class Cliente
{
    private int codigo;
    private String nome;
    private String telefone;
    
    public Cliente(int cod, String nom, String tel){
        codigo = cod;
        nome = nom;
        telefone = tel;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void exibeDados(){
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}
