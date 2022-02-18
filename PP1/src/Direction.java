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
		
			//check if current column is even or odd
			if(maze.getCurrCol() % 2 == 0)
				isEven = true;
			else
				isEven = false;
			
			//move down on even columns and up on odd columns
			if(isEven && maze.moveDown()) {
				maze.moveDown();
				location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");

			}
			else if(!isEven && maze.moveUp()) {
				maze.moveUp();
				location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
			}
			
			//if you reach the bottom or top row and cannot move up or down, move right.
			if(maze.getHeight() == maze.getCurrRow() && !maze.moveUp() && !maze.moveDown()) {
				maze.moveRight();
				location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
			}
			else if(maze.getCurrRow() == 0 && !maze.moveUp() && !maze.moveDown()) {
				maze.moveRight();
				location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
			}
			
			
			//encounter obstacle while moving down in even columns
			else if(!maze.moveDown() && isEven) {
				if(maze.moveRight())
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				if(maze.moveDown())
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				if(maze.moveDown())
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				if(maze.moveLeft())
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
			}
			//encounter obstacle moving up in odd columns
			else if(!maze.moveUp() && !isEven) {
				if(maze.moveLeft())
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				if(maze.moveUp())
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				if(maze.moveUp())
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				if(maze.moveRight())
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
			}
			
			// end maze if the last cell is reached
			if((maze.getCurrRow() == maze.getHeight()) && (maze.getCurrCol() == maze.getWidth())) {
				location.textArea.append("Last cell reached.");
				break;
			}
				
		//if(this.maze.moveDown())
		//location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				
		}	
		
		location.textArea.append("Logo Found \n");
		
	}
   
	
}
