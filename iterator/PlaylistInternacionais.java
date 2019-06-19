package iterator;

import java.util.ArrayList;

/**
 *
 * @author livia
 */
public class PlaylistInternacionais implements AgregadoDePlaylists {
    
    protected ArrayList<Musica> playlist;
    
    public PlaylistInternacionais(){
        
                playlist = new ArrayList<Musica>();
		playlist.add(new Musica("Happier - Marshmello ft Bastille."));
		playlist.add(new Musica("Havana - Camila Cabello ft Young Thug."));
		playlist.add(new Musica("Shape of you - Ed Sheeran."));
		playlist.add(new Musica("Shallow - Lady Gaga ft Bradley Cooper."));

}

    @Override
    public IteratorPlaylists criarIterator() {
      return new IteratorPlaylists(playlist);
    }
}
