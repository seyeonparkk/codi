package Image;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		new StartScreen();
		
		
	}
}
class ImagePanel extends JPanel{
	private Image img;      //이미지 선언   
	public ImagePanel(Image img) {     //이미지 패널을 만듦
		this.img=img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));           //사이즈를 넓이,크기를 가능하게 설정
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));        //선호하는 이미지 넓이,크기를 가능하게 설정
		setLayout(null);   //사이즈 조절 가능하게 설정
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}
