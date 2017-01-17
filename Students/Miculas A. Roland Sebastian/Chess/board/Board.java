package board;

import java.awt.*;
import javax.swing.*;
public class Board {
	private JFrame frame = new JFrame("Simple Frame");
	private static JButton[][] board = new JButton[8][8];
	private JPanel p = new JPanel();
	private JPanel panel = new JPanel();
	
	public static JButton WhiteQueen = new JButton("");
	public static JButton WhiteBishop = new JButton("");
	public static JButton WhiteKnight = new JButton("");
	public static JButton WhiteRook = new JButton("");
	
	public static JButton BlackBishop = new JButton("");
	public static JButton BlackQueen = new JButton("");
	public static JButton BlackKnight = new JButton("");
	public static JButton BlackRook = new JButton("");
	public static JButton[][] getBoard(){
		return board;
	}
	
	public Board(){
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200,700);
	
		p.setLayout(null);
		
		WhiteQueen.setBounds(600,0,75,75);
		WhiteQueen.setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		WhiteQueen.setText(Constants.WHITEQUEEN);
		WhiteQueen.setBackground(Color.white);
		WhiteQueen.setName("Queen");
		WhiteQueen.setVisible(false);
		p.add(WhiteQueen);
		
		
		WhiteBishop.setBounds(600+75,0,75,75);
		WhiteBishop.setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		WhiteBishop.setText(Constants.WHITEBISHOP);
		WhiteBishop.setBackground(Color.white);
		WhiteBishop.setName("Bishop");
		WhiteBishop.setVisible(false);
		p.add(WhiteBishop);
		
		
		WhiteKnight.setBounds(600+150,0,75,75);
		WhiteKnight.setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		WhiteKnight.setText(Constants.WHITEKNIGHT);
		WhiteKnight.setBackground(Color.white);
		WhiteKnight.setName("Knight");
		WhiteKnight.setVisible(false);
		p.add(WhiteKnight);
		
		WhiteRook.setBounds(600+225,0,75,75);
		WhiteRook.setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		WhiteRook.setText(Constants.WHITEROOK);
		WhiteRook.setBackground(Color.white);
		WhiteRook.setName("Rook");
		WhiteRook.setVisible(false);
		p.add(WhiteRook);
		
		
		BlackQueen.setBounds(600,500,75,75);
		BlackQueen.setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		BlackQueen.setText(Constants.BLACKQUEEN);
		BlackQueen.setBackground(Color.white);
		BlackQueen.setName("Queen");
		BlackQueen.setVisible(false);
		p.add(BlackQueen);
		
		
		BlackBishop.setBounds(600+75,500,75,75);
		BlackBishop.setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		BlackBishop.setText(Constants.BLACKBISHOP);
		BlackBishop.setBackground(Color.white);
		BlackBishop.setName("Bishop");
		BlackBishop.setVisible(false);
		p.add(BlackBishop);
		
		
		BlackKnight.setBounds(600+150,500,75,75);
		BlackKnight.setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		BlackKnight.setText(Constants.BLACKKNIGHT);
		BlackKnight.setBackground(Color.white);
		BlackKnight.setName("Knight");
		BlackKnight.setVisible(false);
		p.add(BlackKnight);
		
		
		BlackRook.setBounds(600+225,500,75,75);
		BlackRook.setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		BlackRook.setText(Constants.BLACKROOK);
		BlackRook.setBackground(Color.white);
		BlackRook.setName("Rook");
		BlackRook.setVisible(false);
		p.add(BlackRook);
		
		//<Rocks>
		board[0][0] = new JButton("");
		board[0][0].setBounds(0,0,75,75);
		board[0][0].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[0][0].setText(Constants.BLACKROOK);
		board[0][0].setBackground(Color.white);
		board[0][0].setName("00");
		p.add(board[0][0]);
		
		board[0][7] = new JButton("");
		board[0][7].setBounds(75*7,0,75,75);
		board[0][7].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[0][7].setText(Constants.BLACKROOK);
		board[0][7].setBackground(Color.gray);
		board[0][7].setName("07");
		p.add(board[0][7]);
		
		board[7][0] = new JButton("");
		board[7][0].setBounds(0,75*7,75,75);
		board[7][0].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[7][0].setText(Constants.WHITEROOK);
		board[7][0].setBackground(Color.gray);
		board[7][0].setName("70");
		p.add(board[7][0]);
		
		board[7][7] = new JButton("");
		board[7][7].setBounds(75*7,7*75,75,75);
		board[7][7].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[7][7].setText(Constants.WHITEROOK);
		board[7][7].setBackground(Color.white);
		board[7][7].setName("77");
		p.add(board[7][7]);
		
		//</Rocks>
		
		//<Knights>
		board[0][1] = new JButton("");
		board[0][1].setBounds(75,0,75,75);
		board[0][1].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[0][1].setText(Constants.BLACKKNIGHT);
		board[0][1].setBackground(Color.gray);
		board[0][1].setName("01");
		p.add(board[0][1]);
		
		board[0][6] = new JButton("");
		board[0][6].setBounds(75*6,0,75,75);
		board[0][6].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[0][6].setText(Constants.BLACKKNIGHT);
		board[0][6].setBackground(Color.white);
		board[0][6].setName("06");
		p.add(board[0][6]);
		
		board[7][1] = new JButton("");
		board[7][1].setBounds(75,75*7,75,75);
		board[7][1].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[7][1].setText(Constants.WHITEKNIGHT);
		board[7][1].setBackground(Color.white);
		board[7][1].setName("71");
		p.add(board[7][1]);
		
		board[7][6] = new JButton("");
		board[7][6].setBounds(75*6,75*7,75,75);
		board[7][6].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[7][6].setText(Constants.WHITEKNIGHT);
		board[7][6].setBackground(Color.gray);
		board[7][6].setName("76");
		p.add(board[7][6]);
		
		//</Knights>
		
		//<Bishop>
		board[0][2] = new JButton("");
		board[0][2].setBounds(75*2,0,75,75);
		board[0][2].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[0][2].setText(Constants.BLACKBISHOP);
		board[0][2].setBackground(Color.white);
		board[0][2].setName("02");
		p.add(board[0][2]);
		
		board[0][5] = new JButton("");
		board[0][5].setBounds(75*5,0,75,75);
		board[0][5].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[0][5].setText(Constants.BLACKBISHOP);
		board[0][5].setBackground(Color.gray);
		board[0][5].setName("05");
		p.add(board[0][5]);
		
		board[7][2] = new JButton("");
		board[7][2].setBounds(75*2,75*7,75,75);
		board[7][2].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[7][2].setText(Constants.WHITEBISHOP);
		board[7][2].setBackground(Color.gray);
		board[7][2].setName("72");
		p.add(board[7][2]);
		
		board[7][5] = new JButton("");
		board[7][5].setBounds(75*5,75*7,75,75);
		board[7][5].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[7][5].setText(Constants.WHITEBISHOP);
		board[7][5].setBackground(Color.white);
		board[7][5].setName("75");
		p.add(board[7][5]);
		//</Bishop>
		
		//<Queen>
		board[0][3] = new JButton("");
		board[0][3].setBounds(75*3,0,75,75);
		board[0][3].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[0][3].setText(Constants.BLACKQUEEN);
		board[0][3].setBackground(Color.gray);
		board[0][3].setName("03");
		p.add(board[0][3]);
		
		board[7][3] = new JButton("");
		board[7][3].setBounds(75*3,75*7,75,75);
		board[7][3].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[7][3].setText(Constants.WHITEQUEEN);
		board[7][3].setBackground(Color.white);
		board[7][3].setName("73");
		p.add(board[7][3]);
		//</Queen>
		
		//<King>
		board[0][4] = new JButton("");
		board[0][4].setBounds(75*4,0,75,75);
		board[0][4].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[0][4].setText(Constants.BLACKKING);
		board[0][4].setBackground(Color.white);
		board[0][4].setName("04");
		p.add(board[0][4]);
		
		board[7][4] = new JButton("");
		board[7][4].setBounds(75*4,75*7,75,75);
		board[7][4].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
		board[7][4].setText(Constants.WHITEKING);
		board[7][4].setBackground(Color.gray);
		board[7][4].setName("74");
		p.add(board[7][4]);
		//</King>
		
		//<pawns>
		for(int j = 0 ;j < 8;j++){ 
			board[6][j] = new JButton("");
			board[6][j].setBounds(0+j*75,6*75,75,75);
			board[6][j].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
			board[6][j].setText(Constants.WHITEPAWN);
			board[6][j].setName("6"+Integer.toString(j));
			if(j%2==0){
				board[6][j].setBackground(Color.white);
			}
			else{
				board[6][j].setBackground(Color.gray);
			}
			p.add(board[6][j]);
		}
		for(int j = 0 ;j < 8;j++){ 
			board[1][j] = new JButton("");
			board[1][j].setBounds(0+j*75,75,75,75);
			board[1][j].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
			board[1][j].setText(Constants.BLACKPAWN);
			board[1][j].setName("1"+Integer.toString(j));
			if(j%2==0){
				board[1][j].setBackground(Color.gray);
			}
			else{
				board[1][j].setBackground(Color.white);
			}
			p.add(board[1][j]);
		}
		//</pawns>
		//<empty buttons>
		for(int i = 2 ; i< 6; i++){
			for(int j = 0; j<8; j++){
				board[i][j] = new JButton("");
				board[i][j].setBounds(0+j*75,i*75,75,75);
				board[i][j].setFont(new Font("Arial Unicode MS", Font.PLAIN, 40));
				board[i][j].setText("");
				board[i][j].setName(Integer.toString(i)+Integer.toString(j));
				if((i+j)%2==0){
					board[i][j].setBackground(Color.white);
				}
				else{
					board[i][j].setBackground(Color.gray);
				}
				p.add(board[i][j]);
			}
		}
		
		//</empty buttons>
		p.setBounds(0,0,400,400);
		panel.add(p);
		
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
	public static void ShowPromoteWhitePawn(){
		WhiteBishop.setVisible(true);
		WhiteKnight.setVisible(true);
		WhiteQueen.setVisible(true);
		WhiteRook.setVisible(true);
	}
	public static void ShowPromoteBlackPawn(){
		BlackBishop.setVisible(true);
		BlackKnight.setVisible(true);
		BlackQueen.setVisible(true);
		BlackRook.setVisible(true);
	}
	public static void HidePromoteWhitePawn(){
		WhiteBishop.setVisible(false);
		WhiteKnight.setVisible(false);
		WhiteQueen.setVisible(false);
		WhiteRook.setVisible(false);
	}
	public static void HidePromoteBlackPawn(){
		BlackBishop.setVisible(false);
		BlackKnight.setVisible(false);
		BlackQueen.setVisible(false);
		BlackRook.setVisible(false);
	}
	public void BlackWon(){
		JTextField tf = new JTextField("BlackWon");
		tf.setBounds(600,200,100,30);
		p.add(tf);
	}
	public void WhiteWon(){
		JTextField tf = new JTextField("WhiteWon");
		tf.setBounds(600,250,100,30);
		p.add(tf);
	}
	public void Stalemate(){
		JTextField tf = new JTextField("Stalemate");
		tf.setBounds(600,300,100,30);
		p.add(tf);
	}
}
