package Soittolista;

import java.util.ArrayList;

public class Playlist {

	private int pituus;
	private Song song;

	ArrayList<Song> songs = new ArrayList<Song>();

	public Playlist(int pituus, Song song) {
		this.pituus = pituus;
		this.song = song;
	}

	public Playlist() {
		// TODO Auto-generated constructor stub
	}

	public void addSong(Song song) {

		this.songs.add(song);

	}

	Song getSong(int index) {

		if (index <= songs.size()) {

			return this.songs.get(index);

		} else {
			return null;
		}

	}

	public int getTotalLength() {

		int summa = 0;

		for (int i = 0; i < songs.size(); i++) {

			summa = summa + songs.get(i).getLength();

		}
		return summa;

	}

	@Override
	public String toString() {

		String rivit = ""; // tehdään kokoojamuuttuja

		for (int i = 0; i < songs.size(); i++) {
			String rivi = (i + 1) + ": " + songs.get(i);
			rivit = rivit + rivi + "\n";
		}

		return rivit;
	}

}
