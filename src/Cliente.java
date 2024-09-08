import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {

        Conta conta1 = new Conta(102, "Beatriz", 5000.00, 2000.00);
        Conta conta2 = new Conta(101, "Ana", 3000.00, 1000.00);
        Conta conta3 = new Conta(103, "Carlos", 4000.00, 3000.00);


        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);


        Collections.sort(contas);
        System.out.println("Ordenação pelo número da conta (ordem natural):");
        for (Conta conta : contas) {
            System.out.println(conta);
        }


        contas.sort(new OrdenarPorTitular());
        System.out.println("\nOrdenação pelo nome do titular:");
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}

