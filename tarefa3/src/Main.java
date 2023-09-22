import br.com.questao1.Camarote;
import br.com.questao1.Ingresso;
import br.com.questao1.Normal;
import br.com.questao1.Vip;
import br.com.questao2.FComissionado;
import br.com.questao2.FPadrao;
import br.com.questao2.Funcionario;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Ingresso novoIngresso = new Ingresso(100);

        Ingresso i1 = new Normal(50);



        Normal n1 = new Normal(100);
        n1.imprimeIngresso();

        Vip v1 = new Vip(100,50);
        v1.imprimeIngresso();

        Camarote c1 = new Camarote(100,100,"Setor Camarote");
        c1.imprimeIngresso();


        Funcionario funcionario = new Funcionario(123, "Joao", 10000);


        FComissionado fc = new FComissionado(10,100,200,"Roberto", 10000);

        System.out.println(fc.toString());

        FPadrao fp = new FPadrao(100,"Joaquim",20000);

        System.out.println(fp.toString());

    }

}