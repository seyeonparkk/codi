package Image;

import javax.swing.*;


import java.awt.Event;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SituationChoose extends JFrame implements ActionListener {
    JLabel Situation;
    JCheckBox situation1,situation2,situation3,situation4,situation5,situation6,situation7,situation8,situation9,situation10;
    JButton situationbutton;
    Connection conn = null;
    PreparedStatement pstmt = null;     //sql문 전송하는 객체
    Statement stmt = null; // SQL 문을 데이터베이스에 보내기위한 객체 
    ResultSet rs = null;
    user res = new user();
    private ImagePanel background=new ImagePanel(new ImageIcon("src/image/doing (2).png").getImage());//배경이미지


   SituationChoose() {
	   setTitle("코디쟁이");//타이틀
       Situation= new JLabel("상황을 선택해주세요");       //상황 선택하라는 문구 작성
       Situation.setBounds(220,20,300,150);        //체형 선택하라는 문구의 크기,위치 설정
		Situation.setFont(new Font("맑은 고딕", Font.BOLD, 25));     //글꼴,굵게,폰트 크기 설정

        
        situation1 = new JCheckBox("데이트");      //"마름"이라는 체크박스 생성
        situation1.setBounds(220,130,100,100);   //"마름"의 크기,위치 생성
        situation1.setFont(new Font("맑은 고딕", Font.BOLD, 16));       //글꼴,굵게,폰트 크기 설정
        
        situation2= new JCheckBox("등산");      //"보통"이라는 체크박스 생성
        situation2.setBounds(220,200,100,100);  //"보통"의 크기,위치 생성
        situation2.setFont(new Font("맑은 고딕", Font.BOLD, 16));      //글꼴,굵게,폰트 크기 설정
        
        situation3= new JCheckBox("여행");     //"뚱뚱"이라는 체크박스 생성
        situation3.setBounds(220,270,100,100); //"뚱뚱"의 크기,위치 생성
        situation3.setFont(new Font("맑은 고딕", Font.BOLD, 16));         //글꼴,굵게,폰트 크기 설정
        
        situation4= new JCheckBox("공부");     //"뚱뚱"이라는 체크박스 생성
        situation4.setBounds(220,340,100,100); //"뚱뚱"의 크기,위치 생성
        situation4.setFont(new Font("맑은 고딕", Font.BOLD, 16));         //글꼴,굵게,폰트 크기 설정
        
        situation5= new JCheckBox("등교 ");     //"뚱뚱"이라는 체크박스 생성
        situation5.setBounds(220,410,100,100); //"뚱뚱"의 크기,위치 생성
        situation5.setFont(new Font("맑은 고딕", Font.BOLD, 16));          //글꼴,굵게,폰트 크기 설정
        
        situation6= new JCheckBox("회사출근");     //"뚱뚱"이라는 체크박스 생성
        situation6.setBounds(350,130,100,100); //"뚱뚱"의 크기,위치 생성
        situation6.setFont(new Font("맑은 고딕", Font.BOLD ,16));           //글꼴,굵게,폰트 크기 설정
        
        situation7= new JCheckBox("운동");     //"뚱뚱"이라는 체크박스 생성
        situation7.setBounds(350,200,100,100); //"뚱뚱"의 크기,위치 생성
        situation7.setFont(new Font("맑은 고딕", Font.BOLD, 16));          //글꼴,굵게,폰트 크기 설정
        
        situation8= new JCheckBox("소개팅");     //"뚱뚱"이라는 체크박스 생성
        situation8.setBounds(350,270,100,100); //"뚱뚱"의 크기,위치 생성
        situation8.setFont(new Font("맑은 고딕", Font.BOLD, 16));
        
        situation9= new JCheckBox("면접");     //"뚱뚱"이라는 체크박스 생성
        situation9.setBounds(350,340,100,100); //"뚱뚱"의 크기,위치 생성
        situation9.setFont(new Font("맑은 고딕", Font.BOLD, 16));             //글꼴,굵게,폰트 크기 설정
        
        situation10= new JCheckBox("결혼식");     //"뚱뚱"이라는 체크박스 생성
        situation10.setBounds(350,410,100,100); //"뚱뚱"의 크기,위치 생성
        situation10.setFont(new Font("맑은 고딕", Font.BOLD, 16));          //글꼴,굵게,폰트 크기 설정
        
        situationbutton= new JButton("선택");   //"선택"이라는 버튼 눌러 다음 창으로 전환
        situationbutton.setBounds(300,540,80,30);    //"선택"의 크기,위치 생성
        situationbutton.setFont(new Font("맑은 고딕", Font.BOLD, 16));
        situationbutton.addActionListener(this);        //"선택"버튼을 눌러 실행시키겠다 선언
        add(Situation); add(situation1); add(situation2); add(situation3); add(situation4); add(situation5); add(situation6); add(situation7); add(situation8); add(situation9); add(situation10); add(situationbutton);         //데이터 선언
    	add(background);
		pack();
        setSize(720, 720);   //창 사이즈 설정
        setLayout(null);    //레이아웃을 설정할 수 있게 함
        setVisible(true);     //창을 화면에 나타낼 것인지 설정
        setDefaultCloseOperation(EXIT_ON_CLOSE);     //버튼 누르면 데이터까지 모두 삭제함
        setLocationRelativeTo(null);          //창을 가운데에 띄우게 해주는 메서드
    }

   public void actionPerformed(ActionEvent e) {

	   user situ = new user();
	   user result = new user();

       if(situation1.isSelected()){    
			dispose();      //현재 윈도우만 닫힐수 있는 코드
			situ.setSituation("데이트");	        //"데이트"로 set
			System.out.println("상황 : 데이트");         
			
			new getimage();          //getimage로 넘어감
       }
       if(situation2.isSelected()){    
			dispose();      //현재 윈도우만 닫힐수 있는 코드
			situ.setSituation("등산");           //"등산"으로 set
			System.out.println("상황 : 등산");
	
			new getimage();         //getimage로 넘어감
       }
       if(situation3.isSelected()){  
			dispose();      //현재 윈도우만 닫힐수 있는 코드
			situ.setSituation("여행");
			System.out.println("상황 : 여행");
			
			new getimage();       //getimage로 넘어감
       }
       if(situation4.isSelected()){    
			dispose();      //현재 윈도우만 닫힐수 있는 코드
			situ.setSituation("공부");	
			System.out.println("상황 : 공부");
			
			new getimage();           //getimage로 넘어감 
      }
       if(situation5.isSelected()){    
			dispose();      //현재 윈도우만 닫힐수 있는 코드
			situ.setSituation("등교");	
			System.out.println("상황 : 등교");
			
			new getimage();        //getimage로 넘어감
      }
       if(situation6.isSelected()){    
			dispose();      //현재 윈도우만 닫힐수 있는 코드
			situ.setSituation("회사출근");	
			System.out.println("상황 : 회사출근");
			
			new getimage();        //getimage로 넘어감
      }
       if(situation7.isSelected()){    
			dispose();      //현재 윈도우만 닫힐수 있는 코드
			situ.setSituation("운동");	
			System.out.println("상황 : 운동");
			
			new getimage();          //getimage로 넘어감
      }
       if(situation8.isSelected()){    
			dispose();      //현재 윈도우만 닫힐수 있는 코드
			situ.setSituation("소개팅");	
			System.out.println("상황 : 소개팅");
			
			new getimage();              //getimage로 넘어감
      }
       if(situation9.isSelected()){    
			dispose();      //현재 윈도우만 닫힐수 있는 코드
			situ.setSituation("면접");	
			System.out.println("상황 : 면접");
			
			new getimage();           //getimage로 넘어감
      }
       if(situation10.isSelected()){    
			dispose();      //현재 윈도우만 닫힐수 있는 코드
			situ.setSituation("결혼식");	
			System.out.println("상황 : 결혼식");
			
			new getimage();          //getimage로 넘어감
      }

   }
}





