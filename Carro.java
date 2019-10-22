import java.util.ArrayList;
import java.util.List;

public class Carro{
    final String nome;
    final List<Pneus> objPneus = new ArrayList<>();

    Carro(String nome){
        this.nome = nome;
    }

    void adicionarPneus(Pneus pneus){
        this.objPneus.add(pneus);
    }
}
