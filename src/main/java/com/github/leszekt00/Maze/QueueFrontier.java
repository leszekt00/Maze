package com.github.leszekt00.Maze;

import java.util.NoSuchElementException;

public class QueueFrontier extends StackFrontier{ 
	public Node remove() { // returns the first node instead of the last
		if(isEmpty()) throw new NoSuchElementException("list is empty");
		else return nodes.remove(0);
	}

}
