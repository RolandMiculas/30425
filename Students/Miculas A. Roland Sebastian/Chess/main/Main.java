package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import pieces.Service;

import board.Board;
import pieces.King;
import pieces.Matrix;
public class Main {
	public static void main(String[] args){
		Board board = new Board();
		@SuppressWarnings("static-access")
		JButton[][] buttons = board.getBoard();
		Matrix.initializeMatrix();
		ActionListener e = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String move = (String)((JButton) e.getSource()).getName();
				Service.MovePiece(move);
				if(King.checkCheckMate(false)==true){
					board.WhiteWon();
				}
				else if(King.checkCheckMate(true)==true){
					board.BlackWon();
				}
				if(King.checkStaleMate(true)==true || King.checkStaleMate(false)==true){
					board.Stalemate();
				}
			}
		};
		for(int i = 0 ; i< 8;i++){
			for(int j = 0 ; j<8;j++){
			buttons[i][j].addActionListener(e);
			}
		}
		Board.BlackBishop.addActionListener(e);
		Board.BlackKnight.addActionListener(e);
		Board.BlackQueen.addActionListener(e);
		Board.BlackRook.addActionListener(e);
		
		Board.WhiteBishop.addActionListener(e);
		Board.WhiteKnight.addActionListener(e);
		Board.WhiteQueen.addActionListener(e);
		Board.WhiteRook.addActionListener(e);
	}
}