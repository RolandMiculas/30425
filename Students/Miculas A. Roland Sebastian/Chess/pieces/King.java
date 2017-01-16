package pieces;

public class King extends Piece{
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
	public King(int x, int y,boolean isWhite) {
		this.x = x;
        this.y = y;
        this.isWhite=isWhite;
	}
	@Override
	public int[][] getAvailableMoves() {
		Piece[][] pieces = Matrix.getMatrix();
		int[][] array = new int[8][8];
		
		if(isWhite){
			if(x<7){
				if(pieces[x+1][y] == null){
					if(King.checkMoveForChess(x, y, x+1, y,true)==false){
						array[x+1][y]=1;
					}
				}
				else{
					if(pieces[x+1][y].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x+1, y,true)==false){
							array[x+1][y]=1;
						}
					}
				}
			}
			if(x>0){
				if(pieces[x-1][y] == null){
					if(King.checkMoveForChess(x, y, x-1, y,true)==false){
						array[x-1][y]=1;
					}
				}
				else{
					if(pieces[x-1][y].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x-1, y,true)==false){
							array[x-1][y]=1;
						}
					}
				}
			}
			if(y<7){
				if(pieces[x][y+1] == null){
					if(King.checkMoveForChess(x, y, x, y+1,true)==false){
						array[x][y+1]=1;
					}
				}
				else{
					if(pieces[x][y+1].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x, y+1,true)==false){
							array[x][y+1]=1;
						}
					}
				}
			}
			if(x>0){
				if(pieces[x][y-1] == null){
					if(King.checkMoveForChess(x, y, x, y-1,true)==false){
						array[x][y-1]=1;
					}
				}
				else{
					if(pieces[x][y-1].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x, y-1,true)==false){
							array[x][y-1]=1;
						}
					}
				}
			}
			if(x<7 && y<7){
				if(pieces[x+1][y+1] == null){
					if(King.checkMoveForChess(x, y, x+1, y+1,true)==false){
						array[x+1][y+1]=1;
					}
				}
				else{
					if(pieces[x+1][y+1].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x+1, y+1,true)==false){
							array[x+1][y+1]=1;
						}
					}
				}
			}
			if(x<7&&y>0){
				if(pieces[x+1][y-1] == null){
					if(King.checkMoveForChess(x, y, x+1, y-1,true)==false){
						array[x+1][y-1]=1;
					}
				}
				else{
					if(pieces[x+1][y-1].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x+1, y-1,true)==false){
							array[x+1][y-1]=1;
						}
					}
				}
			}
			if(x>0 && y>0){
				if(pieces[x-1][y-1] == null){
					if(King.checkMoveForChess(x, y, x-1, y-1,true)==false){
						array[x-1][y-1]=1;
					}
				}
				else{
					if(pieces[x-1][y-1].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x-1, y-1,true)==false){
							array[x-1][y-1]=1;
						}
					}
				}
			}
			if(x>0 && y>0){
				if(pieces[x-1][y-1] == null){
					if(King.checkMoveForChess(x, y, x-1, y-1,true)==false){
						array[x-1][y-1]=1;
					}
				}
				else{
					if(pieces[x-1][y-1].getIsWhite()==false){
						if(King.checkMoveForChess(x, y, x-1, y-1,true)==false){
							array[x-1][y-1]=1;
						}
					}
				}
			}
		}
		else{
			if(x<7){
				if(pieces[x+1][y] == null){
					if(King.checkMoveForChess(x, y, x+1, y,false)==false){
						array[x+1][y]=1;
					}
				}
				else{
					if(pieces[x+1][y].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x+1, y,false)==false){
							array[x+1][y]=1;
						}
					}
				}
			}
			if(x>0){
				if(pieces[x-1][y] == null){
					if(King.checkMoveForChess(x, y, x-1, y,false)==false){
						array[x-1][y]=1;
					}
				}
				else{
					if(pieces[x-1][y].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x-1, y,false)==false){
							array[x-1][y]=1;
						}
					}
				}
			}
			if(y<7){
				if(pieces[x][y+1] == null){
					if(King.checkMoveForChess(x, y, x, y+1,false)==false){
						array[x][y+1]=1;
					}
				}
				else{
					if(pieces[x][y+1].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x, y+1,false)==false){
							array[x][y+1]=1;
						}
					}
				}
			}
			if(x>0){
				if(pieces[x][y-1] == null){
					if(King.checkMoveForChess(x, y, x, y-1,false)==false){
						array[x][y-1]=1;
					}
				}
				else{
					if(pieces[x][y-1].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x, y-1,false)==false){
							array[x][y-1]=1;
						}
					}
				}
			}
			if(x<7 && y<7){
				if(pieces[x+1][y+1] == null){
					if(King.checkMoveForChess(x, y, x+1, y+1,false)==false){
						array[x+1][y+1]=1;
					}
				}
				else{
					if(pieces[x+1][y+1].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x+1, y+1,false)==false){
							array[x+1][y+1]=1;
						}
					}
				}
			}
			if(x<7&&y>0){
				if(pieces[x+1][y-1] == null){
					if(King.checkMoveForChess(x, y, x+1, y-1,false)==false){
						array[x+1][y-1]=1;
					}
				}
				else{
					if(pieces[x+1][y-1].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x+1, y-1,false)==false){
							array[x+1][y-1]=1;
						}
					}
				}
			}
			if(x>0 && y>0){
				if(pieces[x-1][y-1] == null){
					if(King.checkMoveForChess(x, y, x-1, y-1,false)==false){
						array[x-1][y-1]=1;
					}
				}
				else{
					if(pieces[x-1][y-1].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x-1, y-1,false)==false){
							array[x-1][y-1]=1;
						}
					}
				}
			}
			if(x>0 && y>0){
				if(pieces[x-1][y-1] == null){
					if(King.checkMoveForChess(x, y, x-1, y-1,false)==false){
						array[x-1][y-1]=1;
					}
				}
				else{
					if(pieces[x-1][y-1].getIsWhite()==true){
						if(King.checkMoveForChess(x, y, x-1, y-1,false)==false){
							array[x-1][y-1]=1;
						}
					}
				}
			}
		}
		return array;
	}
	@Override
	public boolean kingIsInCheck(Piece[][] pieces){
		int[][] array = new int[8][8];
		if(this.isWhite == true){
			for(int i = 0 ; i<pieces.length ;i++){
				for(int j = 0 ;j<pieces[0].length;j++){
					if(pieces[i][j]!=null){
						if(pieces[i][j].getIsWhite()==false){
							int[][] newArray = pieces[i][j].getAttackingSpots();
							for(int k = 0 ; k<newArray.length;k++){
								for(int l=0;l<newArray[0].length;l++){
									if(newArray[k][l]==1){
										array[k][l]=1;
									}
								}//l
							}//k
						}
					}
				}//j
			}//i
		}
		else{
			for(int i = 0 ; i<pieces.length ;i++){
				for(int j = 0 ;j<pieces[0].length;j++){
					if(pieces[i][j]!=null){
						if(pieces[i][j].getIsWhite()==true){
							int[][] newArray = pieces[i][j].getAttackingSpots();
							for(int k = 0 ; k<newArray.length;k++){
								for(int l=0;l<newArray[0].length;l++){
									if(newArray[k][l]==1)
									array[k][l]=1;
								}//l
							}//k
						}
					}
				}//j
			}//i
		}
		if(array[x][y]==1){
			return true;
		}
		return false;
	}
	public static boolean checkMoveForChess(int fromX,int fromY,int toX,int toY,boolean white){
		Piece[][] pieces = Matrix.getMatrix();
		boolean success = false;
		Piece copy = null ;
		int check=0;
		
		if(pieces[toX][toY] ==null){
			pieces[toX][toY]=pieces[fromX][fromY];
			
			pieces[fromX][fromY].setX(toX);
			pieces[fromX][fromY].setY(toY);
			pieces[fromX][fromY] = null;
			
		}
		else{
			copy = pieces[toX][toY];
			pieces[toX][toY]=pieces[fromX][fromY];
			
			pieces[fromX][fromY].setX(toX);
			pieces[fromX][fromY].setY(toY);
			pieces[fromX][fromY] = null;
			check = 1;
		}
		for(int i = 0 ;i<8;i++){
			for(int j = 0;j<8;j++){
				if(pieces[i][j] instanceof King){
					if(pieces[i][j].getIsWhite() == white){
						success= pieces[i][j].kingIsInCheck(pieces);
					}
				}
			}
		}
		if(check==0){
			pieces[fromX][fromY]=pieces[toX][toY];
			
			pieces[toX][toY].setX(fromX);
			pieces[toX][toY].setY(fromY);
			pieces[toX][toY] = null;
		
		}
		else{
			pieces[fromX][fromY]=pieces[toX][toY];
			
			pieces[toX][toY].setX(fromX);
			pieces[toX][toY].setY(fromY);
			pieces[toX][toY] = copy;

		}
		return success;
	}
	public int[][] getAttackingSpots() {
		Piece[][] pieces = Matrix.getMatrix();
		int[][] array = new int[8][8];
		if(isWhite){
			if(x<7){
				if(pieces[x+1][y] == null){
					array[x+1][y]=1;
				}
				else{
					if(pieces[x+1][y].getIsWhite()==false){
						array[x+1][y]=1;
					}
				}
			}
			if(x>0){
				if(pieces[x-1][y] == null){
					array[x-1][y]=1;
				}
				else{
					if(pieces[x-1][y].getIsWhite()==false){
						array[x-1][y]=1;
					}
				}
			}
			if(y<7){
				if(pieces[x][y+1] == null){
					array[x][y+1]=1;
				}
				else{
					if(pieces[x][y+1].getIsWhite()==false){
						array[x][y+1]=1;
					}
				}
			}
			if(x>0){
				if(pieces[x][y-1] == null){
					array[x][y-1]=1;
				}
				else{
					if(pieces[x][y-1].getIsWhite()==false){
						array[x][y-1]=1;
					}
				}
			}
			if(x<7 && y<7){
				if(pieces[x+1][y+1] == null){
					array[x+1][y+1]=1;
				}
				else{
					if(pieces[x+1][y+1].getIsWhite()==false){
						array[x+1][y+1]=1;
					}
				}
			}
			if(x<7&&y>0){
				if(pieces[x+1][y-1] == null){
					array[x+1][y-1]=1;
				}
				else{
					if(pieces[x+1][y-1].getIsWhite()==false){
						array[x+1][y-1]=1;
					}
				}
			}
			if(x>0 && y>0){
				if(pieces[x-1][y-1] == null){
					array[x-1][y-1]=1;
				}
				else{
					if(pieces[x-1][y-1].getIsWhite()==false){
						array[x-1][y-1]=1;
					}
				}
			}
			if(x>0 && y>0){
				if(pieces[x-1][y-1] == null){
					array[x-1][y-1]=1;
				}
				else{
					if(pieces[x-1][y-1].getIsWhite()==false){
						array[x-1][y-1]=1;
					}
				}
			}
		}
		else{
			if(x<7){
				if(pieces[x+1][y] == null){
					array[x+1][y]=1;
				}
				else{
					if(pieces[x+1][y].getIsWhite()==true){
						array[x+1][y]=1;
					}
				}
			}
			if(x>0){
				if(pieces[x-1][y] == null){
					array[x-1][y]=1;
				}
				else{
					if(pieces[x-1][y].getIsWhite()==true){
						array[x-1][y]=1;
					}
				}
			}
			if(y<7){
				if(pieces[x][y+1] == null){
					array[x][y+1]=1;
				}
				else{
					if(pieces[x][y+1].getIsWhite()==true){
						array[x][y+1]=1;
					}
				}
			}
			if(x>0){
				if(pieces[x][y-1] == null){
					array[x][y-1]=1;
				}
				else{
					if(pieces[x][y-1].getIsWhite()==true){
						array[x][y-1]=1;
					}
				}
			}
			if(x<7 && y<7){
				if(pieces[x+1][y+1] == null){
					array[x+1][y+1]=1;
				}
				else{
					if(pieces[x+1][y+1].getIsWhite()==true){
						array[x+1][y+1]=1;
					}
				}
			}
			if(x<7&&y>0){
				if(pieces[x+1][y-1] == null){
					array[x+1][y-1]=1;
				}
				else{
					if(pieces[x+1][y-1].getIsWhite()==true){
						array[x+1][y-1]=1;
					}
				}
			}
			if(x>0 && y>0){
				if(pieces[x-1][y-1] == null){
					array[x-1][y-1]=1;
				}
				else{
					if(pieces[x-1][y-1].getIsWhite()==true){
						array[x-1][y-1]=1;
					}
				}
			}
			if(x>0 && y>0){
				if(pieces[x-1][y-1] == null){
					array[x-1][y-1]=1;
				}
				else{
					if(pieces[x-1][y-1].getIsWhite()==true){
						array[x-1][y-1]=1;
					}
				}
			}
		}
		return array;
	}
	public static boolean checkCheckMate(boolean white){
		Piece[][] pieces = Matrix.getMatrix();
		for(int i = 0 ; i<pieces.length;i++){
			for(int j = 0 ; j<pieces[0].length;j++){
				if(pieces[i][j]!=null){
					if(pieces[i][j].getIsWhite()==white){
						int[][] newArray = pieces[i][j].getAvailableMoves();
						for(int k = 0 ; k < 8 ;k++){
							for(int l = 0 ; l< 8;l++){
								if(newArray[l][k]==1){
									return false;
								}
							}
						}//k
					}
				}//j
			}//i
		}
		return true;
	}
}
