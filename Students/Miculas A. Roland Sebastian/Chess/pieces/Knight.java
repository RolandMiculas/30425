package pieces;

public class Knight extends Piece{
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
	public Knight(int x, int y,boolean isWhite) {
		this.x = x;
        this.y = y;
        this.isWhite=isWhite;
	}
	
	public int[][] getAvailableMoves() {
		Piece[][] pieces = Matrix.getMatrix();
		int[][] array = new int[8][8];
		if(isWhite){
			if(x<6 && y<7){
				if(pieces[x+2][y+1] == null){
					if(King.checkMoveForChess(x, y, x+2, y+1, true)==false){
						array[x+2][y+1]=1;
					}
				}
				else{
					if(pieces[x+2][y+1].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x+2, y+1, true)==false){
							array[x+2][y+1]=1;
						}
					}
				}
			}
			if(x<7 && y<6){
				if(pieces[x+1][y+2] == null){
					if(King.checkMoveForChess(x, y, x+1, y+2, true)==false){
						array[x+1][y+2]=1;
					}
				}
				else{
					if(pieces[x+1][y+2].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x+1, y+2, true)==false){
							array[x+1][y+2]=1;
						}
					}
				}
			}
			if(x>1 && y<7){
				if(pieces[x-2][y+1] == null){
					if(King.checkMoveForChess(x, y, x-2, y+1, true)==false){
						array[x-2][y+1]=1;
					}
				}
				else{
					if(pieces[x-2][y+1].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x-2, y+1, true)==false){
							array[x-2][y+1]=1;
						}
					}
				}
			}
			if(x>0 && y<6){
				if(pieces[x-1][y+2] == null){
					if(King.checkMoveForChess(x, y, x-1, y+2, true)==false){
						array[x-1][y+2]=1;
					}
				}
				else{
					if(pieces[x-1][y+2].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x-1, y+2, true)==false){
							array[x-1][y+2]=1;
						}
					}
				}
			}
			if(x<6 && y>0){
				if(pieces[x+2][y-1] == null){
					if(King.checkMoveForChess(x, y, x+2, y-1, true)==false){
						array[x+2][y-1]=1;
					}
				}
				else{
					if(pieces[x+2][y-1].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x+2, y-1, true)==false){
							array[x+2][y-1]=1;
						}
					}
				}
			}
			if(x<7 && y>1){
				if(pieces[x+1][y-2] == null){
					if(King.checkMoveForChess(x, y, x+1, y-2, true)==false){
						array[x+1][y-2]=1;
					}
				}
				else{
					if(pieces[x+1][y-2].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x+1, y-2, true)==false){
							array[x+1][y-2]=1;
						}
					}
				}
			}
			if(x>0 && y>1){
				if(pieces[x-1][y-2] == null){
					if(King.checkMoveForChess(x, y, x-1, y-2, true)==false){
						array[x-1][y-2]=1;
					}
				}
				else{
					if(pieces[x-1][y-2].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x-1, y-2, true)==false){
							array[x-1][y-2]=1;
						}
					}
				}
			}
			if(x>1 && y>0){
				if(pieces[x-2][y-1] == null){
					if(King.checkMoveForChess(x, y, x-2, y-1, true)==false){
						array[x-2][y-1]=1;
					}
				}
				else{
					if(pieces[x-2][y-1].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x-2, y-1, true)==false){
							array[x-2][y-1]=1;
						}
					}
				}
			}
		}
		else{//
			if(x<6 && y<7){
				if(pieces[x+2][y+1] == null){
					if(King.checkMoveForChess(x, y, x+2, y+1, false)==false){
						array[x+2][y+1]=1;
					}
				}
				else{
					if(pieces[x+2][y+1].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x+2, y+1, false)==false){
							array[x+2][y+1]=1;
						}
					}
				}
			}
			if(x<7 && y<6){
				if(pieces[x+1][y+2] == null){
					if(King.checkMoveForChess(x, y, x+1, y+2, false)==false){
						array[x+1][y+2]=1;
					}
				}
				else{
					if(pieces[x+1][y+2].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x+1, y+2, false)==false){
							array[x+1][y+2]=1;
						}
					}
				}
			}
			if(x>1 && y<7){
				if(pieces[x-2][y+1] == null){
					if(King.checkMoveForChess(x, y, x-2, y+1, false)==false){
						array[x-2][y+1]=1;
					}
				}
				else{
					if(pieces[x-2][y+1].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x-2, y+1, false)==false){
							array[x-2][y+1]=1;
						}
					}
				}
			}
			if(x>0 && y<6){
				if(pieces[x-1][y+2] == null){
					if(King.checkMoveForChess(x, y, x-1, y+2, false)==false){
						array[x-1][y+2]=1;
					}
				}
				else{
					if(pieces[x-1][y+2].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x-1, y+2, false)==false){
							array[x-1][y+2]=1;
						}
					}
				}
			}
			if(x<6 && y>0){
				if(pieces[x+2][y-1] == null){
					if(King.checkMoveForChess(x, y, x+2, y-1, false)==false){
						array[x+2][y-1]=1;
					}
				}
				else{
					if(pieces[x+2][y-1].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x+2, y-1, false)==false){
							array[x+2][y-1]=1;
						}
					}
				}
			}
			if(x<7 && y>1){
				if(pieces[x+1][y-2] == null){
					if(King.checkMoveForChess(x, y, x+1, y-2, false)==false){
						array[x+1][y-2]=1;
					}
				}
				else{
					if(pieces[x+1][y-2].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x+1, y-2, false)==false){
							array[x+1][y-2]=1;
						}
					}
				}
			}
			if(x>0 && y>1){
				if(pieces[x-1][y-2] == null){
					if(King.checkMoveForChess(x, y, x-1, y-2, false)==false){
						array[x-1][y-2]=1;
					}
				}
				else{
					if(pieces[x-1][y-2].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x-1, y-2, false)==false){
							array[x-1][y-2]=1;
						}
					}
				}
			}
			if(x>1 && y>0){
				if(pieces[x-2][y-1] == null){
					if(King.checkMoveForChess(x, y, x-2, y-1, false)==false){
						array[x-2][y-1]=1;
					}
				}
				else{
					if(pieces[x-2][y-1].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x-2, y-1, false)==false){
							array[x-2][y-1]=1;
						}
					}
				}
			}
		}
		return array;
	}
	
	public int[][] getAttackingSpots() {
		Piece[][] pieces = Matrix.getMatrix();
		int[][] array = new int[8][8];
		if(isWhite){
			if(x<6 && y<7){
				if(pieces[x+2][y+1] != null){
					if(pieces[x+2][y+1].getIsWhite()==false){
						array[x+2][y+1]=1;
					}
				}
			}
			if(x<7 && y<6){
				if(pieces[x+1][y+2] != null){
					if(pieces[x+1][y+2].getIsWhite()==false){
						array[x+1][y+2]=1;
					}
				}
			}
			if(x>1 && y<7){
				if(pieces[x-2][y+1] != null){
					if(pieces[x-2][y+1].getIsWhite()==false){
						array[x-2][y+1]=1;
					}
				}
			}
			if(x>0 && y<6){
				if(pieces[x-1][y+2] != null){
					if(pieces[x-1][y+2].getIsWhite()==false){
						array[x-1][y+2]=1;
					}
				}
			}
			if(x<6 && y>0){
				if(pieces[x+2][y-1] != null){
					if(pieces[x+2][y-1].getIsWhite()==false){
						array[x+2][y-1]=1;
					}
				}
			}
			if(x<7 && y>1){
				if(pieces[x+1][y-2] != null){
					if(pieces[x+1][y-2].getIsWhite()==false){
						array[x+1][y-2]=1;
					}
				}
			}
			if(x>0 && y>1){
				if(pieces[x-1][y-2] != null){
					if(pieces[x-1][y-2].getIsWhite()==false){
						array[x-1][y-2]=1;
					}
				}
			}
			if(x>1 && y>0){
				if(pieces[x-2][y-1] != null){
					if(pieces[x-2][y-1].getIsWhite()==false){
						array[x-2][y-1]=1;
					}
				}
			}
		}
		else{
			if(x<6 && y<7){
				if(pieces[x+2][y+1] != null){
					if(pieces[x+2][y+1].getIsWhite()==true){
						array[x+2][y+1]=1;
					}
				}
			}
			if(x<7 && y<6){
				if(pieces[x+1][y+2] != null){
					if(pieces[x+1][y+2].getIsWhite()==true){
						array[x+1][y+2]=1;
					}
				}
			}
			if(x>1 && y<7){
				if(pieces[x-2][y+1] != null){
					if(pieces[x-2][y+1].getIsWhite()==true){
						array[x-2][y+1]=1;
					}
				}
			}
			if(x>0 && y<6){
				if(pieces[x-1][y+2] != null){
					if(pieces[x-1][y+2].getIsWhite()==true){
						array[x-1][y+2]=1;
					}
				}
			}
			if(x<6 && y>0){
				if(pieces[x+2][y-1] != null){
					if(pieces[x+2][y-1].getIsWhite()==true){
						array[x+2][y-1]=1;
					}
				}
			}
			if(x<7 && y>1){
				if(pieces[x+1][y-2] != null){
					if(pieces[x+1][y-2].getIsWhite()==true){
						array[x+1][y-2]=1;
					}
				}
			}
			if(x>0 && y>1){
				if(pieces[x-1][y-2] != null){
					if(pieces[x-1][y-2].getIsWhite()==true){
						array[x-1][y-2]=1;
					}
				}
			}
			if(x>1 && y>0){
				if(pieces[x-2][y-1] != null){
					if(pieces[x-2][y-1].getIsWhite()==true){
						array[x-2][y-1]=1;
					}
				}
			}
		}
		return array;
	}
}
