import java.util.ArrayList;
import java.util.List;


public class Lista {
	public static void main(String[] args) {

		// Criando uma lista
		List<String> itemLista = new ArrayList<>();

		// Adicionando elementos
		itemLista.add("Java");
		itemLista.add("Python");
		itemLista.add("C++");
		itemLista.add("PHP");

		// Acessando a lista criada
		System.out.printf("Minha Lista: %s%n",itemLista);

		// Acessando um item específico
		System.out.printf("Item Específico: %s%n", itemLista.get(1));

		// Iterando sobre a lista
		for (String indice: itemLista) {
			System.out.printf("Item %s%n", indice);
		}

		// Alterando um item
		itemLista.set(0, "HTML");
		System.out.printf("Lista alterada: %s%n", itemLista);

		// Removendo um item
		itemLista.remove("C++");
		System.out.printf("Item removido: %s%n", itemLista);

		// Criando uma lista imutável
		List<String> itemTupla = List.of("CSS", "JavaScript");
		System.out.printf("Lista imutável: %s%n", itemTupla);

	}
}