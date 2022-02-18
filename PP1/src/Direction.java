// This class must have the code in the run() method to solve the maze
// It searches for the Java logo based on the provided path/direction algorithm in Part II

public class Direction extends Thread{

	Maze maze;
	Position location;
	
	Direction(Maze maze, Position location) {
		
		this.maze = maze;
		this.location = location;
	}
	
	// This is the code part that needs to be programmed by students to solve the maze 
	// using the provided path/direction algorithm
	
        public void run(){
		

	// This is a SAMPLE code for moving the student image in the maze
	// and updates the information in Position.java GUI class, append text into the JTextArea object
	// you should delete/update this code and start your solution, you may just keep the part of updating the information
	// in the Position.java class, appending information into the JTextArea object
		
		while(!maze.isDone()) {
				
		if(this.maze.moveDown())
		location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				
		}	
		
		location.textArea.append("Logo Found \n");
		
	}
   
	
}
