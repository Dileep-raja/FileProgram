package com.fileapp.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PlayerComparatorTest {

	public static void main(String[] args) {

		List<PlayerApp> play = new ArrayList<>();
		play.add(new PlayerApp(1, "dileep", "01", "bating"));
		play.add(new PlayerApp(2, "rakesh", "03", "All rounder"));
		play.add(new PlayerApp(3, "Alla", "02", "blowling"));

		// System.out.println(play);
		for (PlayerApp app : play) {
			System.err.println(app);
		}
		Comparator<PlayerApp> byRanking = Comparator
				  .comparing(PlayerApp::getRank);
		//System.out.println(byRanking);
	    play.forEach((byRank) -> System.err.println(byRank));
		 
		/*Comparator<PlayerApp> byranking = (PlayerApp play1, PlayerApp play2) -> play1.getRank()
				.compareTo(play2.getRank());*/
		
		//play.sort((PlayerApp p1 ,PlayerApp p2) -> p1.getRank()-p2.getRank());
		//play.forEach((app) -> System.out.println(app));
		
		/*Collections.sort(play, new Comparator<PlayerApp>() {

			@Override
			public int compare(PlayerApp o1, PlayerApp o2) {
				// TODO Auto-generated method stub
				return o1.getRank() - o2.getRank();
			}
		});*/

	}

}
