package com.ds.collections;

import java.util.Stack;

public class StackJavaImpl {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("Raman");
		st.push("Raghav");
		st.push("developer");
		
		System.err.println(st.pop());
	}

}
