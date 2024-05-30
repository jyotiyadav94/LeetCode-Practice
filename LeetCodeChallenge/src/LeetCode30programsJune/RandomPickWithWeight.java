package LeetCode30programsJune;

import java.util.Random;
import java.util.TreeMap;

public class RandomPickWithWeight {

	class Solution {
	    private TreeMap<Integer, Integer> map;
	    private Random rand;
	    private int total;

	    public Solution(int[] w) {
	        map = new TreeMap<>();
	        total = 0;
	        rand = new Random();
	        for (int i = 0; i < w.length; i++) {
	            total += w[i];
	            map.put(total, i);
	        }
	    }

	    public int pickIndex() {
	        int k = map.higherKey(rand.nextInt(total));
	        return map.get(k);
	    }
	}

	/**
	 * Your Solution object will be instantiated and called as such:
	 * Solution obj = new Solution(w);
	 * int param_1 = obj.pickIndex();
	 */
	
	
	
	
	
	
}
