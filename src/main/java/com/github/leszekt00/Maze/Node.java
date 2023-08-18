package com.github.leszekt00.Maze;

public class Node {
	Node parent;
	State state;
	Action action;
	public Node(State state, Node parent, Action action) {
		this.parent = parent;
		this.state = state;
		this.action = action;
	}
	public Node getParent() {
		return parent;
	}
	public State getState() {
		return state;
	}
	public Action getAction() {
		return action;
	}
	

}
