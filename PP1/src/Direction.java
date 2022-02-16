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
		
        //PART II
        	
        boolean evenCol;
        
        //Check if column is even or odd
        while(!maze.isDone()) {
        	if(maze.getCurrCol() % 2 == 0) {
        		evenCol = true;
        	}
        	else {
        		evenCol = false;
        	}
        
        	//Set column movement
        	if(evenCol && this.maze.moveDown()) {
        		this.maze.moveDown();
        		location.textArea.append("Col: " + maze.getCurrCol() + " Down" + "\n");
        	}
        	else if (!evenCol && this.maze.moveUp()){
        		this.maze.moveUp();
        		location.textArea.append("Col: " + maze.getCurrCol() + " UP" + "\n");
        	}
        	
        	this.maze.moveRight();
        	location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
  
        	
        }
        	
        
        	
        	
        
        //***************************************************************************************************************
        
        /* PART I
        
        while(!maze.isDone()) {
        	if(this.maze.moveRight()) {
        	location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
        	}
        		else if(this.maze.moveDown()) {
        		location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
        		}
        }
        
        maze.isDone();
        
        	
        //PROVIDED SAMPLE CODE
        while(!maze.isDone()) {
				
		if(this.maze.moveDown())
		location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
		
		
				
		}
		*/
		
		//location.textArea.append("Logo Found \n");
		
	}
   
	
}

