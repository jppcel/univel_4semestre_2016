package br.univel.patterns.builder.complexobject;

import java.util.ArrayList;
import java.util.List;

public class Refeicao {

	private List<Item> items = new ArrayList<Item>();

	public void adicionaItem(Item item) {
		items.add(item);
	}

	public float getPreco() {
		Float cost = 0.0f;
		for (final Item item : items) {
			cost += item.getPreco();
		}
		return cost;
	}

	public void showItems() {
		for (final Item item : items) {
			System.out.print("Item : " + item.getNome());
			System.out.print(", Packing : " + item.getEmbagalem().tipo());
			System.out.println(", Price : " + item.getPreco());
		}
	}
}