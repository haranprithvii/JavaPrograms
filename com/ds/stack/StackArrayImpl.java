package com.ds.stack;

public class StackArrayImpl {

	public static void main(String[] args) {
		StackArray<Integer> st = new StackArray<Integer>(5);
		st.push(10);
		st.push(11);
		st.push(12);
		st.push(13);
		st.push(14);
		//st.push(15);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		st.push(10);
	}

}
