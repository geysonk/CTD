public class Main{
    public static void main(String[] args) {
        ArvoreFactory arvore = new ArvoreFactory();

        for(int i = 0; i <= 500000; i++){
            Arvore a = arvore.getArvore(1.0, 2.0, "verde", "frutifera");
            System.out.println(a.toString());
        }
        for(int i = 500001; i <= 1000000; i++){
            Arvore b = arvore.getArvore(1.0, 2.0, "vermelha", "ornamental");
            System.out.println(b.toString());
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
        
    }
}
