/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsav_240760107191;

import java.util.LinkedList;

/**
 *
 * @author nikunjjoshi
 */
public class PS9_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create LinkedList for playlist
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        // Display initial playlist
        System.out.println("Initial Playlist:");
        System.out.println(playlist);

        // 2. Display full playlist
        System.out.println("\nFull Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }

        // 3. Play first song (remove from front)
        if (!playlist.isEmpty()) {
            String playedSong = playlist.removeFirst();
            System.out.println("\nPlaying: " + playedSong);
        }

        // Display updated playlist
        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        // 4. Skip last song (remove from end)
        if (!playlist.isEmpty()) {
            String skippedSong = playlist.removeLast();
            System.out.println("\nSkipped: " + skippedSong);
        }

        // 5. Display updated playlist
        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);
    }
    
}
