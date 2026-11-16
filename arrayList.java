import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        //Adicionando frutas em minha lista
        frutas.add("Abacaxi");
        frutas.add("Maçã");
        frutas.add("Uva");
        frutas.add("Laranja");

        //Removendo um item da lista
        frutas.remove(2);

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Item "+(i+1)+" :"+frutas.get(i));
        }

        // Usando o for-each
        System.out.println("Usando for-each:");

        for (String fruta: frutas) {
            System.out.println("Item: "+fruta);
        }
    }
}


