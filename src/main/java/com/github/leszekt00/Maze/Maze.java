package com.github.leszekt00.Maze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maze {
	String fileName;
	public Maze(String fileName) {
		this.fileName = fileName;
		try(BufferedReader reader = new BufferedReader(
				new InputStreamReader(Maze.class.getClassLoader().getResourceAsStream(fileName)))) {
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
