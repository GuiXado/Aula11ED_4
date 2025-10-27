package view;

import br.gui.listagenerica.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		Lista<Integer> lista = new Lista<>();
		
		// *vetorA não usado na resolução, apenas para popular a lista.
		int[] vetorA = {1, 2, 3, 7, 8};
		int[] vetorB = {3, 3, 9, 6, 9, 8, 9, 5, 7, 10, 4, 8, 10, 8};
				
		for (int i : vetorA) lista.addLast(i);
		
		for (int i = 0; i < vetorB.length; i++) {
			boolean existe = false;
			
			for (int j = 0; j < lista.size(); j++) {
				if (lista.get(j) == vetorB[i]) {
		            existe = true;
		            break;
				}
			}
			
			if (existe) {
				lista.addLast(vetorB[i]);
			} else if (vetorB[i] % 2 == 0) {
				lista.add(vetorB[i], 2);
			} else {
				lista.add(vetorB[i], 1);
			}
				
		}	
		
		System.out.println("Lista Final: \n");
		for (int i = 0; i < lista.size(); i++) System.out.print(lista.get(i) + " ");
	}

}
