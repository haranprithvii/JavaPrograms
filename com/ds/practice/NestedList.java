package com.ds.practice;

import java.util.*;
import java.util.Map.*;

class PointsWithDis {
	Double distance;
	List<Integer> list;
	PointsWithDis(Double distance, List<Integer> list) {
		this.distance = distance;
		this.list = list;
	}
}

public class NestedList {

	public static List<List<Integer>> shortestPath(int i, List<List<Integer>> lists, int m)
			throws NullPointerException {

		if (lists == null || lists.size() == 0) {
			return null;
		}
		/*
		 * SortedSet<Map.Entry<Integer, PointsWithDis>> sortedMap = new
		 * TreeSet<Map.Entry<Integer, PointsWithDis>>( new Comparator<Map.Entry<Integer,
		 * PointsWithDis>>() {
		 * 
		 * @Override public int compare(Entry<Integer, PointsWithDis> o1, Entry<Integer,
		 * PointsWithDis> o2) { return
		 * o1.getValue().distance.compareTo(o2.getValue().distance); } });
		 */

		TreeMap<Integer, PointsWithDis> map = new TreeMap<Integer, PointsWithDis>();
		List<List<Integer>> res = new ArrayList<List<Integer>>(i);
		int count = 1;
		for (List<Integer> list : lists) {
			Double dis = distFromOriginUtil(list);
			map.put(count, new PointsWithDis(dis, list));
			count++;
		}

		List<Map.Entry<Integer, PointsWithDis>> entryList = new ArrayList<Map.Entry<Integer, PointsWithDis>>(
				map.entrySet());

		Collections.sort(entryList, new Comparator<Map.Entry<Integer, PointsWithDis>>() {
			@Override
			public int compare(Entry<Integer, PointsWithDis> o1, Entry<Integer, PointsWithDis> o2) {
				return o1.getValue().distance.compareTo(o2.getValue().distance);
			}
		});
		for (int j = 0; j < 2; j++) {
			// System.out.println("Key: "+m.getKey());
			res.add(entryList.get(j).getValue().list);
		}
		return res;

	}

	public static void main(String[] args) {

		List<List<Integer>> lists = new LinkedList<List<Integer>>();
		
		 lists.add(Arrays.asList(1, 1)); lists.add(Arrays.asList(0, 0));
		 lists.add(Arrays.asList(-2, -1)); lists.add(Arrays.asList(3, -2));
		 lists.add(Arrays.asList(3, -4));
		 
		 
		try {
			List<List<Integer>> map = shortestPath(3, lists, 2);
			for (int i = 0; i < 2; i++) {
				// System.out.println("Key: "+m.getKey());
				System.out.println(map.get(i));
			}

		} catch (NullPointerException e) {
			System.err.println("Please Enter Co-ordinates to the destination");
		} catch (Exception e) {
			System.err.println("There is some problem Encountered");
		}
	}

	public static double distFromOriginUtil(List<Integer> p) {
		Integer x = p.get(0);
		Integer y = p.get(1);
		x = (int) Math.pow(x, 2);
		y = (int) Math.pow(y, 2);
		int z = Math.abs(y - x);
		return Math.sqrt(z);

	}

}
