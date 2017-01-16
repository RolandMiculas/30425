package pieces;

public class Matrix {
	private static Piece[][] pieces = new Piece[8][8];
	public static Piece[][] getMatrix(){
		return pieces;
	}
	public static void initializeMatrix(){
		pieces[0][0]=new Rook(0,0,false);
		pieces[0][7]=new Rook(0,7,false);
		
		pieces[0][2]=new Bishop(0,2,false);
		pieces[0][5]=new Bishop(0,5,false);
		
		pieces[0][1]=new Knight(0,1,false);
		pieces[0][6]=new Knight(0,6,false);
		
		pieces[0][3]=new Queen(0,3,false);
		
		pieces[0][4]=new King(0,4,false);
		
		pieces[7][7]=new Rook(7,7,true);
		pieces[7][0]=new Rook(7,0,true);
		
		pieces[7][2]=new Bishop(7,2,true);
		pieces[7][5]=new Bishop(7,5,true);
		
		pieces[7][6]=new Knight(7,6,true);
		pieces[7][1]=new Knight(7,1,true);
		
		pieces[7][3]=new Queen(7,3,true);
		
		pieces[7][4]=new King(7,4,true);
		
		for(int i = 0 ;i<8;i++){
			pieces[1][i]= new Pawn(1,i,false);
			pieces[6][i]= new Pawn(6,i,true);
		}
	}
}
