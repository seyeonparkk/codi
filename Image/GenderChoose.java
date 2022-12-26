package Image;


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class GenderChoose extends JFrame {
		JLabel Gender;     
	    JCheckBox gender1,gender2;         
	    JButton genderbutton;
	    private ImagePanel background=new ImagePanel(new ImageIcon("src/image/doing (2).png").getImage());//배경이미지
	    
	    public GenderChoose () {
	    	   setTitle("코디쟁이");//타이틀
	       Gender = new JLabel("성별을 선택해주세요.");     //성별을 선택하라는 문구 작성 
	       Gender.setBounds(210,110,300,300);          //성별 선택하는 위치,크기 설정
			Gender.setFont(new Font("맑은 고딕", Font.BOLD, 30));     //글꼴,굵게,폰트 크기 설정

	       
	       gender1 = new JCheckBox("여성");     //"남성"선택하는 체크박스 만듦
	       gender1.setBounds(230,280,100,100);        //"남성"의 위치,크기 설정
	       gender1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
	       gender2 = new JCheckBox("남성");    //"여성"선택하는 체크박스 만듦
	       gender2.setBounds(360,280,100,100);           //"여성"의 위치,크기 설정
	       gender2.setFont(new Font("맑은 고딕", Font.BOLD, 18));      //글꼴,굵게,폰트 크기 설정
	       
	       genderbutton = new JButton("선택");        //"선택"하는 버튼 생성
	       genderbutton.setBounds(290,400,80,30);             //"선택"의 위치,크기 설정
	       genderbutton.setFont(new Font("맑은 고딕", Font.BOLD, 18));        //글꼴,굵게,폰트 크기 설정
	       add(Gender); add(gender1); add(gender2); add(genderbutton);        //데이터 선언
	       add(background);
			pack();
	       setSize(720, 720);         //화면 크기 설정
	       setLayout(null);       //사이즈 조절 가능하게 설정
	       setVisible(true);      //창을 화면에 나타낼 것인지 결정
	       setDefaultCloseOperation(EXIT_ON_CLOSE);              //종료 버튼 누르면 데이터 전체 삭제
	       setLocationRelativeTo(null);              //창을 가운데에 띄우게 해주는 메서드


	       genderbutton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					user gender = new user();
					if(gender1.isSelected()) {
						dispose();      //현재 윈도우만 닫힐수 있는 코드
						gender.setGender("여성");
						System.out.println("성별 : 여성");
						new FormChoose();    //버튼을 누르면 FormChoose 클래스로 가게 됨
					} else if(gender2.isSelected()) {
						dispose();      //현재 윈도우만 닫힐수 있는 코드
						gender.setGender("남성");
						System.out.println("성별 : 남성");
						new FormChoose();    //버튼을 누르면 FormChoose 클래스로 가게 됨
					}
					

				}
			}); 
	    }
	}

	
				
			
		
	
	
	  
	   

