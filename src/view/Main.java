package view;

import control.ImparParController;

public class Main {
	public static void main(String[] args) throws Exception {
		
		int[] vetor = {1,3,5,2,9,7,8,10,12,13,32,16,21,47,24,31,36};
		ImparParController control = new ImparParController();
		int tamanho = vetor.length;
		for(int i=0;i<tamanho;i++) {
			control.separarImparPar(vetor[i]);
		}
		control.print();
	}
}
