package test;

import java.util.*;

public class RandomSongPlayer {
    public static void playSongs(int[] songs) {
        List<Integer> songList = new ArrayList<>();
        for (int song : songs) songList.add(song);

        Collections.shuffle(songList);

        for (int song : songList) {
            System.out.println("Playing song: " + song);
        }
    }

    public static void main(String[] args) {
        int[] songs = {1, 2, 3, 4, 5};
        playSongs(songs);
    }
}
