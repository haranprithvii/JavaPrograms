package com.ds.practice;

import java.util.*;

public class KeyPhrases {

	public static void main(String[] args) {
		
		String text = "Euclidean distance fails to reflect the true distance. It is clear that histograms A and B are similar, while A and C are much more different. However, these two groups are evaluated with the same distance based on the Euclidean distance, which are indicated by the dashed lines. To tackle this problem, we adopt the Earth mover distance (EMD), in which both the orientation and energy value can be taken into account, and an optimal solution will be found by minimizing the movement cost, as indicated by the solid lines.";
		ArrayList<String> wordsToExclude = new ArrayList<String>();
		wordsToExclude.add(",");
		wordsToExclude.add(":");
		wordsToExclude.add("a");
		wordsToExclude.add("is");
		wordsToExclude.add("an");
		wordsToExclude.add("for");
		wordsToExclude.add("the");
		wordsToExclude.add("by");
		wordsToExclude.add("and");
		wordsToExclude.add("of");
		wordsToExclude.add("to");
		wordsToExclude.add(".");
		wordsToExclude.add("this");
		wordsToExclude.add("that");
		wordsToExclude.add("are");
		int maxFreq = 0;
		
		HashMap<String, Integer> wordFreq = new HashMap<String, Integer>();
		String[] textSp =  text.split(" ");
		for (String word : textSp) {
			if(wordsToExclude.contains(word) || word.trim().length() == 0) {
				continue;
			}
			String key = word.trim().toLowerCase();
			if(wordFreq.get(key) == null) {
				wordFreq.put(key, 1);
			}else {
				int freq = wordFreq.get(key);
				wordFreq.put(key, freq+1);
			}
			if(wordFreq.get(key)>maxFreq) {
				maxFreq = wordFreq.get(key);
			}
		}
			for (String key : wordFreq.keySet()) {
				if (wordFreq.get(key) >= maxFreq - 1)
				System.out.println(key+" :"+wordFreq.get(key));
			}
	}

}
