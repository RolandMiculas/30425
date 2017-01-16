package pieces;

public class Queen extends Piece{
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
	public Queen(int x, int y,boolean isWhite) {
		this.x = x;
        this.y = y;
        this.isWhite=isWhite;
	}
	
	public int[][] getAvailableMoves() {
		Piece[][] pieces = Matrix.getMatrix();
		int[][] array = new int[8][8];
		if(isWhite){
			if(x<8){
				for(int i = x+1 ;i<8;i++){
					if(pieces[i][y]==null){
						if(King.checkMoveForChess(x, y, i, y,true)==false){
							array[i][y]=1;
						}
					}
					else{
						if(pieces[i][y].getIsWhite()==false){
							if(King.checkMoveForChess(x, y, i, y,true)==false){
								array[i][y]=1;
							}
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(x>0){
				for(int i = x-1 ;i>=0;i--){
					if(pieces[i][y]==null){
						if(King.checkMoveForChess(x, y, i, y,true)==false){
							array[i][y]=1;
						}
					}
					else{
						if(pieces[i][y].getIsWhite()==false){
							if(King.checkMoveForChess(x, y, i, y,true)==false){
								array[i][y]=1;
							}
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(y<8){
				for(int j = y+1 ;j<8;j++){
					if(pieces[x][j]==null){
						if(King.checkMoveForChess(x, y, x, j,true)==false){
							array[x][j]=1;
						}
					}
					else{
						if(pieces[x][j].getIsWhite()==false){
							if(King.checkMoveForChess(x, y, x, j,true)==false){
								array[x][j]=1;
							}
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(y>0){
				for(int j = y-1 ;j>=0;j--){
					if(pieces[x][j]==null){
						if(King.checkMoveForChess(x, y, x, j,true)==false){
							array[x][j]=1;
						}
					}
					else{
						if(pieces[x][j].getIsWhite()==false){
							if(King.checkMoveForChess(x, y, x, j,true)==false){
								array[x][j]=1;
							}
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(x<8 && y<8){
				for(int i = x+1,j=y+1;i<8 && j<8;i++,j++)
					if(pieces[i][j] == null){
						if(King.checkMoveForChess(x, y, i, j,true)==false){
							array[i][j]=1;
						}
					}
					else{
						if(pieces[i][j].getIsWhite()==false){
							if(King.checkMoveForChess(x, y, i, j,true)==false){
								array[i][j]=1;
							}
							break;
						}
						else{
							break;
						}
					}
			}
			if(x>0 && y<8){
				for(int i = x-1,j=y+1;i>=0 && j<8;i--,j++)
					if(pieces[i][j] == null){
						if(King.checkMoveForChess(x, y, i, j,true)==false){
							array[i][j]=1;
						}
					}
					else{
						if(pieces[i][j].getIsWhite()==false){
							if(King.checkMoveForChess(x, y, i, j,true)==false){
								array[i][j]=1;
							}
							break;
						}
						else{
							break;
						}
					}
			}
			if(x<8 && y>0){
				for(int i = x+1,j=y-1;i<8 && j>=0;i++,j--)
					if(pieces[i][j] == null){
						if(King.checkMoveForChess(x, y, i, j,true)==false){
							array[i][j]=1;
						}
					}
					else{
						if(pieces[i][j].getIsWhite()==false){
							if(King.checkMoveForChess(x, y, i, j,true)==false){
								array[i][j]=1;
							}
							break;
						}
						else{
							break;
						}
					}
			}
			if(x>0 && y>0){
				for(int i = x-1,j=y-1;i>=0 && j>=0;i--,j--)
					if(pieces[i][j] == null){
						if(King.checkMoveForChess(x, y, i, j,true)==false){
							array[i][j]=1;
						}
					}
					else{
						if(pieces[i][j].getIsWhite()==false){
							if(King.checkMoveForChess(x, y, i, j,true)==false){
								array[i][j]=1;
							}
							break;
						}
						else{
							break;
						}
					}
			}

		}
		else{
			if(x<8){
				for(int i = x+1 ;i<8;i++){
					if(pieces[i][y]==null){
						if(King.checkMoveForChess(x, y, i, y,false)==false){
							array[i][y]=1;
						}
					}
					else{
						if(pieces[i][y].getIsWhite()==true){
							if(King.checkMoveForChess(x, y, i, y,false)==false){
								array[i][y]=1;
							}
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(x>0){
				for(int i = x-1 ;i>=0;i--){
					if(pieces[i][y]==null){
						if(King.checkMoveForChess(x, y, i, y,false)==false){
							array[i][y]=1;
						}
					}
					else{
						if(pieces[i][y].getIsWhite()==true){
							if(King.checkMoveForChess(x, y, i, y,false)==false){
								array[i][y]=1;
							}
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(y<8){
				for(int j = y+1 ;j<8;j++){
					if(pieces[x][j]==null){
						if(King.checkMoveForChess(x, y, x, j,false)==false){
							array[x][j]=1;
						}
					}
					else{
						if(pieces[x][j].getIsWhite()==true){
							if(King.checkMoveForChess(x, y, x, j,false)==false){
								array[x][j]=1;
							}
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(y>0){
				for(int j = y-1 ;j>=0;j--){
					if(pieces[x][j]==null){
						if(King.checkMoveForChess(x, y, x, j,false)==false){
							array[x][j]=1;
						}
					}
					else{
						if(pieces[x][j].getIsWhite()==true){
							if(King.checkMoveForChess(x, y, x, j,false)==false){
								array[x][j]=1;
							}
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(x<8 && y<8){
				for(int i = x+1,j=y+1;i<8 && j<8;i++,j++)
					if(pieces[i][j] == null){
						if(King.checkMoveForChess(x, y, i, j,false)==false){
							array[i][j]=1;
						}
					}
					else{
						if(pieces[i][j].getIsWhite()==true){
							if(King.checkMoveForChess(x, y, i, j,false)==false){
								array[i][j]=1;
							}
							break;
						}
						else{
							break;
						}
					}
			}
			if(x>0 && y<8){
				for(int i = x-1,j=y+1;i>=0 && j<8;i--,j++)
					if(pieces[i][j] == null){
						if(King.checkMoveForChess(x, y, i, j,false)==false){
							array[i][j]=1;
						}
					}
					else{
						if(pieces[i][j].getIsWhite()==true){
							if(King.checkMoveForChess(x, y, i, j,false)==false){
								array[i][j]=1;
							}
							break;
						}
						else{
							break;
						}
					}
			}
			if(x<8 && y>0){
				for(int i = x+1,j=y-1;i<8 && j>=0;i++,j--)
					if(pieces[i][j] == null){
						if(King.checkMoveForChess(x, y, i, j,false)==false){
							array[i][j]=1;
						}
					}
					else{
						if(pieces[i][j].getIsWhite()==true){
							if(King.checkMoveForChess(x, y, i, j,false)==false){
								array[i][j]=1;
							}
							break;
						}
						else{
							break;
						}
					}
			}
			if(x>0 && y>0){
				for(int i = x-1,j=y-1;i>=0 && j>=0;i--,j--)
					if(pieces[i][j] == null){
						if(King.checkMoveForChess(x, y, i, j,false)==false){
							array[i][j]=1;
						}
					}
					else{
						if(pieces[i][j].getIsWhite()==true){
							if(King.checkMoveForChess(x, y, i, j,false)==false){
								array[i][j]=1;
							}
							break;
						}
						else{
							break;
						}
					}
			}
		}
		return array;
	}
	public int[][] getAttackingSpots(){
		Piece[][] pieces = Matrix.getMatrix();
		int[][] array = new int[8][8];
		if(isWhite){
			if(x<8 && y<8){
				for(int i = x+1,j=y+1;i<8 && j<8;i++,j++)
					if(pieces[i][j] != null){
						if(pieces[i][j].getIsWhite()==false){
							array[i][j]=1;
							break;
						}
						else{
							break;
						}
					}
			}
			if(x>0 && y<8){
				for(int i = x-1,j=y+1;i>=0 && j<8;i--,j++)
					if(pieces[i][j] != null){
						if(pieces[i][j].getIsWhite()==false){
							array[i][j]=1;
							break;
						}
						else{
							break;
						}
					}
			}
			if(x<8 && y>0){
				for(int i = x+1,j=y-1;i<8 && j>=0;i++,j--)
					if(pieces[i][j] != null){
						if(pieces[i][j].getIsWhite()==false){
							array[i][j]=1;
							break;
						}
						else{
							break;
						}
					}
			}
			if(x>0 && y>0){
				for(int i = x-1,j=y-1;i>=0 && j>=0;i--,j--)
					if(pieces[i][j] != null){
						if(pieces[i][j].getIsWhite()==false){
							array[i][j]=1;
							break;
						}
						else{
							break;
						}
					}
			}
			if(x<8){
				for(int i = x+1 ;i<8;i++){
					if(pieces[i][y]!=null){
						if(pieces[i][y].getIsWhite()==false){
							array[i][y]=1;
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(x>0){
				for(int i = x-1 ;i>=0;i--){
					if(pieces[i][y]!=null){
						if(pieces[i][y].getIsWhite()==false){
							array[i][y]=1;
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(y<8){
				for(int j = y+1 ;j<8;j++){
					if(pieces[x][j]!=null){
						if(pieces[x][j].getIsWhite()==false){
							array[x][j]=1;
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(y>0){
				for(int j = y-1 ;j>=0;j--){
					if(pieces[x][j]!=null){
						if(pieces[x][j].getIsWhite()==false){
							array[x][j]=1;
							break;
						}
						else{
							break;
						}
					}
				}
			}
		}
		else{
			if(x<8 && y<8){
				for(int i = x+1,j=y+1;i<8 && j<8;i++,j++)
					if(pieces[i][j] != null){
						if(pieces[i][j].getIsWhite()==true){
							array[i][j]=1;
							break;
						}
						else{
							break;
						}
					}
			}
			if(x>0 && y<8){
				for(int i = x-1,j=y+1;i>=0 && j<8;i--,j++)
					if(pieces[i][j] != null){
						if(pieces[i][j].getIsWhite()==true){
							array[i][j]=1;
							break;
						}
						else{
							break;
						}
					}
			}
			if(x<8 && y>0){
				for(int i = x+1,j=y-1;i<8 && j>=0;i++,j--)
					if(pieces[i][j] != null){
						if(pieces[i][j].getIsWhite()==true){
							array[i][j]=1;
							break;
						}
						else{
							break;
						}
					}
			}
			if(x>0 && y>0){
				for(int i = x-1,j=y-1;i>=0 && j>=0;i--,j--)
					if(pieces[i][j] != null){
						if(pieces[i][j].getIsWhite()==true){
							array[i][j]=1;
							break;
						}
						else{
							break;
						}
					}
			}
			if(x<8){
				for(int i = x+1 ;i<8;i++){
					if(pieces[i][y]!=null){
						if(pieces[i][y].getIsWhite()==true){
							array[i][y]=1;
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(x>0){
				for(int i = x-1 ;i>=0;i--){
					if(pieces[i][y]!=null){
						if(pieces[i][y].getIsWhite()==true){
							array[i][y]=1;
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(y<8){
				for(int j = y+1 ;j<8;j++){
					if(pieces[x][j]!=null){
						if(pieces[x][j].getIsWhite()==true){
							array[x][j]=1;
							break;
						}
						else{
							break;
						}
					}
				}
			}
			if(y>0){
				for(int j = y-1 ;j>=0;j--){
					if(pieces[x][j]!=null){
						if(pieces[x][j].getIsWhite()==true){
							array[x][j]=1;
							break;
						}
						else{
							break;
						}
					}
				}
			}
		}
		return array;
	}
}
