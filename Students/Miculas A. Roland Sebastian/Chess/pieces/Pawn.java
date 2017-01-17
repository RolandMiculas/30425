package pieces;

import board.Board;

public class Pawn extends Piece{
	private int x;
	private int y;
	private boolean isWhite;
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x=x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y=y;
	}
	public boolean getIsWhite(){
		return isWhite;
	}
	public Pawn(int x, int y,boolean isWhite) {
		this.x = x;
        this.y = y;
        this.isWhite=isWhite;
	}
	
	public int[][] getAvailableMoves(){
		Piece[][] pieces = Matrix.getMatrix();
		int[][] array = new int[8][8];
		if(isWhite){
			if(x==6){
				if(pieces[x-1][y]==null){
					if(King.checkMoveForChess(x, y, x-1, y, true)==false){
						array[x-1][y]=1;
					}
					if(pieces[x-2][y]==null){
						if(King.checkMoveForChess(x, y, x-2, y, true)==false){
							array[x-2][y]=1;
						}
					}
				}
				if(y<7){
					if(pieces[x-1][y+1] !=null){
						if(!pieces[x-1][y+1].getIsWhite()){
							if(King.checkMoveForChess(x, y, x-1, y+1, true)==false){
								array[x-1][y+1]=1;
							}
						}
					}
				}
				if(y>0){
					if(pieces[x-1][y-1] != null){
						if(!pieces[x-1][y-1].getIsWhite()){
							if(King.checkMoveForChess(x, y, x-1, y-1, true)==false){
								array[x-1][y-1]=1;
							}
						}
					}
				}
			}
			else{
				if(x!=0){
					if(pieces[x-1][y]==null){
						if(King.checkMoveForChess(x, y, x-1, y, true)==false){
							array[x-1][y]=1;
						}
					}
					if(y<7){
						if(pieces[x-1][y+1] != null){
							if(!pieces[x-1][y+1].getIsWhite()){
								if(King.checkMoveForChess(x, y, x-1, y+1, true)==false){
									array[x-1][y+1]=1;
								}
							}
						}
					}
					if(y>0){
						if(pieces[x-1][y-1] !=null){
							if(!pieces[x-1][y-1].getIsWhite()){
								if(King.checkMoveForChess(x, y, x-1, y-1, true)==false){
									array[x-1][y-1]=1;
								}
							}
						}
					}
				}else{
					Matrix.promotePawn = 1;
					Matrix.promoteX=x;
					Matrix.promoteY=y;
					Board.ShowPromoteWhitePawn();
				}
			}
		}
		else{
			if(x==1){
				if(pieces[x+1][y]==null){
					if(King.checkMoveForChess(x, y, x+1, y, false)==false){
						array[x+1][y]=1;
					}
					if(pieces[x+2][y]==null){
						if(King.checkMoveForChess(x, y, x+2, y, false)==false){
							array[x+2][y]=1;
						}
					}
				}
				if(y<7){
					if(pieces[x+1][y+1] !=null){
						if(pieces[x+1][y+1].getIsWhite()){
							if(King.checkMoveForChess(x, y, x+1, y+1, false)==false){
								array[x+1][y+1]=1;
							}
						}
					}
				}
				if(y>0){
					if(pieces[x+1][y-1] != null){
						if(pieces[x+1][y-1].getIsWhite()){
							if(King.checkMoveForChess(x, y, x+1, y-1, false)==false){
								array[x+1][y-1]=1;
							}
						}
					}
				}
			}
			else{
				if(x!=8){
					if(pieces[x+1][y]==null){
						if(King.checkMoveForChess(x, y, x+1, y, false)==false){
							array[x+1][y]=1;
						}
					}
					if(y<7){
						if(pieces[x+1][y+1] != null){
							if(pieces[x+1][y+1].getIsWhite()){
								if(King.checkMoveForChess(x, y, x+1, y+1, false)==false){
									array[x+1][y+1]=1;
								}
							}
						}
					}
					if(y>0){
						if(pieces[x+1][y-1] !=null){
							if(pieces[x+1][y-1].getIsWhite()){
								if(King.checkMoveForChess(x, y, x+1, y-1, false)==false){
									array[x+1][y-1]=1;
								}
							}
						}
					}
				}else{
					Board.ShowPromoteBlackPawn();
					Matrix.promoteX=x;
					Matrix.promoteY=y;
					Matrix.promotePawn = 1;
				}
			}
		}
		return array;
	}
	
	
	public int[][] getAttackingSpots(){
		Piece[][] pieces = Matrix.getMatrix();
		int[][] array = new int[8][8];
		if(isWhite){
			if(x==6){
				if(y<7){
					if(pieces[x-1][y+1] !=null){
						if(!pieces[x-1][y+1].getIsWhite()){
							array[x-1][y+1]=1;
						}
					}
				}
				if(y>0){
					if(pieces[x-1][y-1] != null){
						if(!pieces[x-1][y-1].getIsWhite()){
							array[x-1][y-1]=1;
						}
					}
				}
			}
			else{
				if(x!=0){
					if(y<7){
						if(pieces[x-1][y+1] != null){
							if(!pieces[x-1][y+1].getIsWhite()){
								array[x-1][y+1]=1;
							}
						}
					}
					if(y>0){
						if(pieces[x-1][y-1] !=null){
							if(!pieces[x-1][y-1].getIsWhite()){
								array[x-1][y-1]=1;
							}
						}
					}
				}
			}
		}
		else{
			if(x==1){
				if(pieces[x+2][y]==null){
					array[x+2][y]=1;
				}
				if(y<7){
					if(pieces[x+1][y+1] !=null){
						if(pieces[x+1][y+1].getIsWhite()){
							array[x+1][y+1]=1;
						}
					}
				}
				if(y>0){
					if(pieces[x+1][y-1] != null){
						if(pieces[x+1][y-1].getIsWhite()){
							array[x+1][y-1]=1;
						}
					}
				}
			}
			else{
				if(x!=8){
					if(y<7){
						if(pieces[x+1][y+1] != null){
							if(pieces[x+1][y+1].getIsWhite()){
								array[x+1][y+1]=1;
							}
						}
					}
					if(y>0){
						if(pieces[x+1][y-1] !=null){
							if(pieces[x+1][y-1].getIsWhite()){
								array[x+1][y-1]=1;
							}
						}
					}
				}
			}
		}
		return array;
	}
}
