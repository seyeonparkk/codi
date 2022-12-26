package Image;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class StartScreen extends JFrame{
   static JButton b1=new JButton("시작하기");     //버튼생성
   private  ImagePanel background=new ImagePanel(new ImageIcon("src/image/Screen.png").getImage());//배경이미지
   public StartScreen() {    //생성자
      homeframe();
     b1.setFont(new Font("맑은 고딕", Font.BOLD, 14));          //글꼴,굵게,폰트 크기 설정
   
   b1.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        new body();
	        setVisible(false); // 창 안보이게 하기 
	    }
	});
   }
   
   
	 
   public void homeframe() {
	   btn();
	   add(background);
	   pack();
      setTitle("코디쟁이");//타이틀
      setSize(720,720);//프레임의 크기
      setResizable(false);//창의 크기를 변경하지 못하게
      setLocationRelativeTo(null);//창이 가운데 나오게
      setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
      setVisible(true);//창이 보이게
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
   }
   
   public void btn() {
      b1.setLayout(null);//레이아웃
      b1.setSize(90, 40);        //버튼의 사이즈를 90,40으로 설정
      b1.setLocation(300, 440);              //버튼의 위치를 300,440으로 설정
      add(b1);//프레임에 추가
   }
}