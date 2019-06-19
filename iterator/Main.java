package iterator;

/**
 *
 * @author livia
 */
public class Main {
    public static void main(String[] args) {
    AgregadoDePlaylists musicasInternacionais = new PlaylistInternacionais();
    System.out.println("Playlist com músicas internacionais: \n");
    for (IteratorPlaylists it = musicasInternacionais.criarIterator(); !it
            .isDone(); it.proximaMusica()) {
        System.out.println(it.currentItem().nome);
    }
 
    AgregadoDePlaylists musicasNacionais = new PlaylistNacionais();
    System.out.println("Playlist com músicas nacionais:\n");
    for (IteratorPlaylists it = musicasNacionais.criarIterator(); !it
            .isDone(); it.proximaMusica()) {
        System.out.println(it.currentItem().nome);
    }
    }
}