package com.linkedlistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
	
	private static ArrayList<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Album album = new Album("ArijitTopSongs", "Arijit");
		album.addSong("Haa mei galat", 6.00);
		album.addSong("Aa raat bhar", 4.5);
		album.addSong("Shayad", 4.25);
		album.addSong("Khariyat", 5.5);
		album.addSong("kabira", 3.6);
		album.addSong("Tum hi ho", 4.6);
		albums.add(album);
		
		
		album = new Album("JubinNautiyalTopSong", "Jubin Nautiyal");
		album.addSong("Lut gaye", 4.5);
		album.addSong("Dil galti kar", 5.47);
		album.addSong("Humnava", 5.24);
		album.addSong("raata lambiyaan", 4.00);
		album.addSong("Tum mere ho", 4.80);
		albums.add(album);
		
		
		LinkedList<Song> playList = new LinkedList<>();
		albums.get(0).addToPlayList("Shayad", playList);
		albums.get(0).addToPlayList("kabira", playList);
		albums.get(0).addToPlayList("Haa mei", playList);
		albums.get(0).addToPlayList(1, playList);
		
		albums.get(1).addToPlayList("Lut gaye", playList);
		albums.get(1).addToPlayList("Humnava", playList);
		albums.get(1).addToPlayList(4, playList);
		albums.get(1).addToPlayList(24, playList);
		
		play(playList);
		
		
		
		
	}
	
	private static void play(LinkedList<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;	
		
		
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("No Songs in playList");
			return;
		}else {
			System.out.println("Now Playing " + listIterator.next().toString());
			printMenu();
		}
		
		while(!quit){
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action){
				
				case 0: 
					System.out.println("PlayList complete");
					quit = true;
					break;
				case 1:
					if(!forward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						forward = true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now Playing " + listIterator.next().toString() );
					}else {
						System.out.println("We have reached the end of the PlayList");
						forward = false;
					}
					break;
				case 2:
					if(forward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						forward = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now Playing " + listIterator.previous().toString() );
					}else {
						System.out.println("We are at the start of the PlayList");
						forward = true;
					}
					break;
				case 3:
					if(forward) {
						if(listIterator.hasPrevious()) {
							System.out.println("Now Replaying: " + listIterator.previous().toString());
							forward = false;
						}else {
							System.out.println("We are at the start of list");
						}						
					}else {
						if(listIterator.hasNext()) {
						   System.out.println("Now Replaying: " + listIterator.next().toString());
						   forward = true;
						}else {
							System.out.println("We have reached the end of the PlayList");
						}
					}
					break;
				case 4:
					printList(playList);
					break;
				case 5:
					printMenu();
					break;
				case 6:
					if(playList.size() > 0) {
						listIterator.remove();
						if(listIterator.hasNext()) {
							System.out.println("Now Playing "+ listIterator.next());
						}else if(listIterator.hasPrevious()){
							System.out.println("Now Playing "+ listIterator.previous());
						}
					}
					break;
			}
		}
		
	}
	
	private static void printMenu() {
			System.out.println("Available actions: \n Press");
			System.out.println("0 - to quit \n" +
							"1 - to Play next song\n" +
							"2 - to play previous song \n" +
							"3 - to replay current song \n" +
							"4 - list song in the playlist \n" +
							"5 - print available actions \n" +
							"6 - delete current song from playList");
			
		}
	
	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println(" =========================== ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
		System.out.println(" =========================== ");
	}

}
