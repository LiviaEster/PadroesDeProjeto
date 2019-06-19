package iterator;

import java.util.ArrayList;

/**
 *
 * @author livia
 */
public class PlaylistNacionais implements AgregadoDePlaylists{
    
      protected ArrayList<Musica> playlist;
    
    	public PlaylistNacionais() {
            
                playlist = new ArrayList<Musica>();
		playlist.add(new Musica("Velha Infancia - Tribalistas ft Bastille."));
		playlist.add(new Musica("Aquarela - Toquinho."));
		playlist.add(new Musica("Faroeste Caboclo - Legião Urbana."));
		playlist.add(new Musica("Juntos e Shallow Now - Paula Fernandes ft Luan Santana."));
		}

    @Override
    public IteratorPlaylists criarIterator() {
      return new IteratorPlaylists(playlist);
    }
}
