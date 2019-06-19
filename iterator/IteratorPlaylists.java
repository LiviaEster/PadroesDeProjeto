package iterator;
import java.util.ArrayList;

/**
 *
 * @author livia
 */
public class IteratorPlaylists {
    
    	ArrayList<Musica> lista;
	int contador;

	protected IteratorPlaylists(ArrayList<Musica> lista) {
		this.lista = lista;
		contador = 0;
	}

	public void first() {
		contador = 0;
	}

	public void proximaMusica() {
		contador++;
	}

	public void voltarMusica() {
		contador--;
	}

	public boolean isDone() {
		return contador == lista.size();
	}

	public Musica currentItem() {
		if (isDone()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}
		return lista.get(contador);
	}

	public String getNomeMusica() {
		return currentItem().nome;
	}
}
