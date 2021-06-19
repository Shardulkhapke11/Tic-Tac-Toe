public class UC1 {

public static void main(String [] args){
	System.out.println("Welcome to Tic Tac Toe");
    char[][] TictacBoard = {
      {'_','|','_','|','_'},
      {'_','|','_','|','_'},
      {' ','|',' ','|',' '}
    };
    
    printBoard(TictacBoard);
   
}
  public static void printBoard(char [][] TictacBoard){
	  
    for(char[] row : TictacBoard){
        for( char c : row){
            System.out.print(c);
        }
        System.out.println();
    }
  }
}