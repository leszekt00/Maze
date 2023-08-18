package com.github.leszekt00.Maze;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class StackFrontier {
	List<Node> nodes;
	
	public StackFrontier() { //init
		this.nodes = new ArrayList<Node>();
	}
	
	public void add(Node node) { //add node
		this.nodes.add(node);
	}
	
	public State contains_state(State state) {
		return nodes.stream().filter(node -> node.getState()
				.equals(state))
				.map(Node::getState) // transforms the element of stream into State
				.findFirst()
				.orElse(null);
	}
	
	public boolean isEmpty() {
		return nodes.isEmpty();
	}
	
	public Node remove() {
		if(isEmpty()) throw new NoSuchElementException("list is empty");
		else return nodes.remove(nodes.size()-1); // returns last node
	}
	
}
