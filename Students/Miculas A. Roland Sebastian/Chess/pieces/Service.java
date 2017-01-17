package pieces;

import java.awt.Color;

import javax.swing.JButton;
import board.Board;
import board.Constants;

public class Service {
	private static int flag = 0;
	private static boolean white = true;
	private static int previousX = 8;
	private static int previousY = 8;
	public static void MovePiece(String move){
		if(flag == 0){
			if(Matrix.promotePawn==1){
				Piece[][] pieces = Matrix.getMatrix();
				JButton[][] board = Board.getBoard();
				int x = Matrix.promoteX;
				int y = Matrix.promoteY;
				if(move.compareTo("Queen")==0){
					pieces[x][y] = new Queen(x,y,!white);
					if(!white){
						board[x][y].setText(Constants.WHITEQUEEN);
					}
					else{
						board[x][y].setText(Constants.BLACKQUEEN);
					}
					flag=0;
				}
				else if(move.compareTo("Bishop")==0){
					pieces[x][y] = new Bishop(x,y,!white);
					if(!white){
						board[x][y].setText(Constants.WHITEBISHOP);
					}
					else{
						board[x][y].setText(Constants.BLACKBISHOP);
					}
					flag=0;
				}
				else if(move.compareTo("Knight")==0){
					pieces[x][y] = new Knight(x,y,!white);
					if(!white){
						board[x][y].setText(Constants.WHITEKNIGHT);
					}
					else{
						board[x][y].setText(Constants.BLACKKNIGHT);
					}
					flag=0;
				}
				else if(move.compareTo("Rook")==0){
					pieces[x][y] = new Rook(x,y,!white);
					if(!white){
						board[x][y].setText(Constants.WHITEROOK);
					}
					else{
						board[x][y].setText(Constants.BLACKROOK);
					}
					flag=0;
				}
				Board.HidePromoteBlackPawn();
				Board.HidePromoteWhitePawn();
				Matrix.promotePawn=0;
				King.checkCheckMate(true);
				King.checkCheckMate(false);
			}
			else{
				flag =1;
				int coordinates = Integer.parseInt(move);
				int x= coordinates/10;
				previousX=x;
				int y= coordinates%10;
				previousY=y;
				JButton[][] board = Board.getBoard();
				Piece[][] pieces = Matrix.getMatrix();
				if(pieces[x][y] != null){
					if((pieces[x][y].getIsWhite()==true) &&( white == true)){
						int[][] array = pieces[x][y].getAvailableMoves();
						int check = 0;
						for(int i = 0;i<array.length;i++){
							for(int j = 0; j<array[0].length;j++){
								if(array[i][j]==1){
									board[i][j].setBackground(Color.red);
									check =1;
								}
							}
							
						}
						if(check == 0){
							flag =0;
						}
					}else if((pieces[x][y].getIsWhite() == false) && (white == false)){
						int[][] array = pieces[x][y].getAvailableMoves();
						int check = 0;
						for(int i = 0;i<array.length;i++){
							for(int j = 0; j<array[0].length;j++){
								if(array[i][j]==1){
									board[i][j].setBackground(Color.red);
									check =1;
								}
							}	
						}
						if(check ==0){
							flag = 0;
						}
					}else{
						flag =0;
					}
				}
				else{
					flag = 0;
				}
			}
		}
		else{
			int coordinates = Integer.parseInt(move);
			int x= coordinates/10;
			int y= coordinates%10;
			Piece[][] pieces = Matrix.getMatrix();
			JButton[][] board = Board.getBoard();
			if(board[x][y].getBackground()==Color.red){
				if(pieces[x][y] ==null){
					pieces[x][y]=pieces[previousX][previousY];
					
					pieces[previousX][previousY].setX(x);
					pieces[previousX][previousY].setY(y);
					pieces[previousX][previousY] = null;
					String aux =board[x][y].getText();
					board[x][y].setText(board[previousX][previousY].getText());
					board[previousX][previousY].setText(aux);
					if(pieces[x][y] instanceof King){
						if(previousX == 7 && previousY ==4  && x == 7 && y==2){
							pieces[7][3]=pieces[7][0];
							board[7][3].setText(board[7][0].getText());
							board[7][0].setText("");
						}
						if(previousX == 7 && previousY ==4  && x == 7 && y==6){
							pieces[7][5]=pieces[7][7];
							board[7][5].setText(board[7][7].getText());
							board[7][7].setText("");
						}
					}
					if(pieces[x][y] instanceof King){
						if(previousX == 0 && previousY ==4  && x == 0 && y==2){
							pieces[0][3]=pieces[0][0];
							board[0][3].setText(board[0][0].getText());
							board[0][0].setText("");
						}
						if(previousX == 0 && previousY ==4  && x == 0 && y==6){
							pieces[0][5]=pieces[0][7];
							board[0][5].setText(board[0][7].getText());
							board[0][7].setText("");
						}
					}
				}
				else{
					
					pieces[x][y]=pieces[previousX][previousY];
					
					pieces[previousX][previousY].setX(x);
					pieces[previousX][previousY].setY(y);
					pieces[previousX][previousY] = null;
					
					board[x][y].setText(board[previousX][previousY].getText());
					board[previousX][previousY].setText("");
				}
				if(white == true){
					white = false;
				}
				else{
					white = true;
				}
				flag =0;
				for(int i = 0; i<board.length;i++){
					for(int j =0;j<board[0].length;j++){
						if((i+j)%2 == 0){
							board[i][j].setBackground(Color.white);
						}
						else{
							board[i][j].setBackground(Color.gray);
						}
					}
				}
			}
			else{
				previousX=x;
				previousY=y;
				flag =1;
				for(int i = 0; i<board.length;i++){
					for(int j =0;j<board[0].length;j++){
						if((i+j)%2 == 0){
							board[i][j].setBackground(Color.white);
						}
						else{
							board[i][j].setBackground(Color.gray);
						}
					}
				}
				if(pieces[x][y] != null){
					if((pieces[x][y].getIsWhite()==true) &&( white == true)){
						int[][] array = pieces[x][y].getAvailableMoves();
						int check = 0;
						for(int i = 0;i<array.length;i++){
							for(int j = 0; j<array[0].length;j++){
								if(array[i][j]==1){
									board[i][j].setBackground(Color.red);
									check =1;
								}
							}
							
						}
						if(check == 0){
							flag =0;
						}
					}else if((pieces[x][y].getIsWhite() == false) && (white == false)){
						int[][] array = pieces[x][y].getAvailableMoves();
						int check = 0;
						for(int i = 0;i<array.length;i++){
							for(int j = 0; j<array[0].length;j++){
								if(array[i][j]==1){
									board[i][j].setBackground(Color.red);
									check =1;
								}
							}	
						}
						if(check ==0){
							flag = 0;
						}
					}else{
						flag =0;
					}
				}
				else{
					flag = 0;
				}
			}
			
		}
	}
}
