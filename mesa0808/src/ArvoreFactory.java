import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static Map<String, Arvore> arvoreFlyweight = new HashMap<>();

    public Arvore getArvore(Double altura, Double largura, String cor, String tipo) {

        String arvore = tipo;

        if (!arvoreFlyweight.containsKey(tipo)){

            arvoreFlyweight.put(tipo, new Arvore(altura+1, largura+1, cor, tipo));
            System.out.println("Arvore do  tipo " + tipo + " criada\n");

            return arvoreFlyweight.get(tipo);
        }
        System.out.println("Arvore do tipo " + tipo + " ja existe");
        return arvoreFlyweight.get(tipo);
    }
}
