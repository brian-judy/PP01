// This class must have the code in the run() method to solve the maze
// It searches for the Java logo based on the provided path/direction algorithm in Part II

public class Direction extends Thread{

	Maze maze;
	Position location;
	
	Direction(Maze maze, Position location) {
		
		this.maze = maze;
		this.location = location;
	}
	
	//Method to check boundaries
	public boolean boundaryHit() {
		boolean boundaryHit = false;
		
		if(maze.getCurrRow() == 0 || maze.getHeight() == 5)
			boundaryHit = true;
		else if (maze.getCurrCol() == 0 || maze.getCurrCol() == maze.getWidth())
			boundaryHit = true;
		
		return boundaryHit;	
	}
	
	public void printLocation() {
		location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
	}
	
	
	// This is the code part that needs to be programmed by students to solve the maze 
	// using the provided path/direction algorithm
	
        public void run(){

	// This is a SAMPLE code for moving the student image in the maze
	// and updates the information in Position.java GUI class, append text into the JTextArea object
	// you should delete/update this code and start your solution, you may just keep the part of updating the information
	// in the Position.java class, appending information into the JTextArea object
		
        //PART II
        	
       
        boolean isEvenCol;
        
        //Check if column is even or odd
        while(!maze.isDone()) {
        	if(maze.getCurrCol() % 2 == 0) {
        		isEvenCol = true;
        	}
        	else
        		isEvenCol = false;
        	
        	//Set column movement down
        	if(isEvenCol) {
        		maze.moveDown();
        		
        		if(!maze.moveDown()) {
        			maze.moveRight();
        			printLocation();
        			if(maze.isDone())
        				break;
        			
        			maze.moveDown();
        			printLocation();
        			if(maze.isDone())
        				break;
        			
        			maze.moveDown();
        			printLocation();
        			if(maze.isDone())
        				break;
        			
        			maze.moveLeft();
        			printLocation();
        			if(maze.isDone())
        				break;
        		
        		if (boundaryHit()) { //Check for maze boundary
        			location.textArea.append("Boundary hit. Moving right\n");
        			maze.moveRight(); //If a boundary is hit, reverse direction
        			if(maze.isDone())
        				break;
        		}
        			
        		}
        	}
        	
        	//Set column movement up
        	if(!isEvenCol) {
        		maze.moveUp();
        		
        		if(!maze.moveUp()) {
        			maze.moveLeft();
        			printLocation();
        			if(maze.isDone())
        				break;
        			
        			maze.moveUp();
        			printLocation();
        			if(maze.isDone())
        				break;
        			
        			maze.moveUp();
        			printLocation();
        			if(maze.isDone())
        				break;
        			
        			maze.moveRight();
        			printLocation();
        			if(maze.isDone())
        				break;
        			
        		if (boundaryHit()) { //Check for maze boundary
        			location.textArea.append("Boundary hit. Moving right\n");
        			maze.moveRight(); //If a boundary is hit, reverse direction
        			if(maze.isDone())
        				break;
        		}
        			
        		}
        	}
        	
        }
        
        		location.textArea.append("LOGO FOUND!!!!!\n");
    }
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
		
		//location.textArea.append("Logo Found \n");
}
*/  
	
