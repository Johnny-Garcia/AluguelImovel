
import java.util.Scanner;

public class Teste{
    public static void main(String args[]){
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite Código: ");
        int cod = leia.nextInt();
        leia.nextLine();
        System.out.println("Digite descrição: ");
        String des = leia.nextLine();
        System.out.println("Digite preço: ");
        double pre = leia.nextDouble();
        System.out.println("Digite meses: " );
        int min = leia.nextInt();
        
        Imovel e1 = new Imovel(cod, des, pre, min);
        
        System.out.println(cod + des + pre + min);
        
        
    }
}