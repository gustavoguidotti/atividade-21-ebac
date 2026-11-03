import com.ebac.classes.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gustavo", 27);
        Pessoa pessoa2 = new Pessoa("Gustavo", 27);

        System.out.printf("pessoa1 == pessoa2 %s\n", pessoa1.equals(pessoa2));

        Set<Pessoa> pessoas = new HashSet<>();

        pessoas.add(new Pessoa("Gustavo", 27));
        pessoas.add(new Pessoa("Gustavo", 27));
        pessoas.add(new Pessoa("Gustavo", 28));
        pessoas.add(new Pessoa("Joao", 19));
        pessoas.add(new Pessoa("Joao", 19));
        pessoas.add(new Pessoa("Lucas", 26));
        pessoas.add(new Pessoa("Lucas", 26));
        pessoas.add(new Pessoa("Lucas", 27));



        for (Pessoa pessoa : pessoas) System.out.println(pessoa);
        System.out.printf("Tamanho do set 'pessoas' = %d\n", pessoas.size());
    }
}