package control;
import model.Lista;

public class ImparParController {
	Lista[] l;
	static int valor;
	public ImparParController() {
		l = new Lista[2];
		for(int i=0;i<2;i++) {
			l[i] = new Lista();
		}
	}
	
	public void separarImparPar(int valor) throws Exception {
		ImparParController.valor = valor;
		int hash = hashCode();
		Lista separador = l[hash];
		if(separador.isEmpty()) {
			l[hash].addFirst(valor);
		}else {
			l[hash].addLast(valor);
		}
	}
	
	public void print() throws Exception {
		printVet(l);
	}
	
	public void printVet(Lista[] l2) throws Exception {
		int tamanhoP = l2[0].size();
		int tamanhoI = l2[1].size();
		System.out.println("Par: ");
		l2[0].printList(l2[0]);
		System.out.println("Impar: ");
		l2[1].printList(l2[1]);
	}

	@Override
	public int hashCode() {
		if(valor%2==0) {
			return 0;
		}else {
			return 1;
		}
	}
	
}
