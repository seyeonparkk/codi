package Image;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class FormChoose extends JFrame implements ActionListener {
	JLabel Form;
	JCheckBox form1,form2,form3,form4,form5,form6,form7,form8,form9,form10;
	JButton formbutton;
	private ImagePanel background=new ImagePanel(new ImageIcon("src/image/doing (2).png").getImage());//배경이미지



	FormChoose() {
		setTitle("코디쟁이");//타이틀
		Form= new JLabel("체형을 선택해주세요");       //체형 선택하라는 문구 작성
		Form.setBounds(220,20,300,150);        //체형 선택하라는 문구의 크기,위치 설정
		Form.setFont(new Font("맑은 고딕", Font.BOLD, 25));     //글꼴,굵게,폰트 크기 설정

		form1 = new JCheckBox("이상체형");      //"이상체형"이라는 체크박스 생성
		form1.setBounds(220,130,100,100);   //"이상체형"의 크기,위치 생성
		form1.setFont(new Font("맑은 고딕", Font.BOLD, 13));     //글꼴,굵게,폰트 크기 설정

		form2= new JCheckBox("삼각체형");      //"보통"이라는 체크박스 생성
		form2.setBounds(220,200,100,100);  //"보통"의 크기,위치 생성
		form2.setFont(new Font("맑은 고딕", Font.BOLD, 13));      //글꼴,굵게,폰트 크기 설정

		form3= new JCheckBox("역삼각형체형");     //"뚱뚱"이라는 체크박스 생성
		form3.setBounds(220,270,100,100); //"뚱뚱"의 크기,위치 생성
		form3.setFont(new Font("맑은 고딕", Font.BOLD, 12));        //글꼴,굵게,폰트 크기 설정

		form4= new JCheckBox("사각체형");     //"뚱뚱"이라는 체크박스 생성
		form4.setBounds(220,340,100,100); //"뚱뚱"의 크기,위치 생성
		form4.setFont(new Font("맑은 고딕", Font.BOLD, 13));          //글꼴,굵게,폰트 크기 설정

		form5= new JCheckBox("모래시계형");     //"뚱뚱"이라는 체크박스 생성
		form5.setBounds(220,410,100,100); //"뚱뚱"의 크기,위치 생성
		form5.setFont(new Font("맑은 고딕", Font.BOLD, 13));         //글꼴,굵게,폰트 크기 설정

		form6= new JCheckBox("마름모꼴형");     //"뚱뚱"이라는 체크박스 생성
		form6.setBounds(350,130,100,100); //"뚱뚱"의 크기,위치 생성
		form6.setFont(new Font("맑은 고딕", Font.BOLD, 13));         //글꼴,굵게,폰트 크기 설정

		form7= new JCheckBox("둥근체형");     //"뚱뚱"이라는 체크박스 생성
		form7.setBounds(350,200,100,100); //"뚱뚱"의 크기,위치 생성
		form7.setFont(new Font("맑은 고딕", Font.BOLD, 13));         //글꼴,굵게,폰트 크기 설정

		form8= new JCheckBox("튜브체형");     //"뚱뚱"이라는 체크박스 생성
		form8.setBounds(350,270,100,100); //"뚱뚱"의 크기,위치 생성
		form8.setFont(new Font("맑은 고딕", Font.BOLD, 13));          //글꼴,굵게,폰트 크기 설정

		form9= new JCheckBox("직사각형");     //"뚱뚱"이라는 체크박스 생성
		form9.setBounds(350,340,100,100); //"뚱뚱"의 크기,위치 생성
		form9.setFont(new Font("맑은 고딕", Font.BOLD, 13));             //글꼴,굵게,폰트 크기 설정

		form10= new JCheckBox("전체적비만");     //"뚱뚱"이라는 체크박스 생성
		form10.setBounds(350,410,100,100); //"뚱뚱"의 크기,위치 생성
		form10.setFont(new Font("맑은 고딕", Font.BOLD, 13));             //글꼴,굵게,폰트 크기 설정

		formbutton= new JButton("선택");   //"선택"이라는 버튼 눌러 다음 창으로 전환
		formbutton.setBounds(300,540,80,30);    //"선택"의 크기,위치 생성
		formbutton.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		formbutton.addActionListener(this);        //"선택"버튼을 눌러 실행시키겠다 선언
		add(Form); add(form1); add(form2); add(form3); add(form4); add(form5); add(form6); add(form7); add(form8); add(form9); add(form10); add(formbutton);         //데이터 선언
		add(background);
		pack();
		setSize(720, 720);   //창 사이즈 설정
		setLayout(null);    //레이아웃을 설정할 수 있게 함
		setVisible(true);     //창을 화면에 나타낼 것인지 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);     //버튼 누르면 데이터까지 모두 삭제함
		setLocationRelativeTo(null);         //창을 가운데에 띄우게 해주는 메서드
	}

	@Override
	public void actionPerformed(ActionEvent e) {    //선택 후의 창 전환
		user form = new user();
		if(form1.isSelected()) {
			dispose();    //바로 다음으로 화면 넘어가기
			form.setForm("이상체형");        
			System.out.println("체형 : 이상체형");
			new SituationChoose();    //SituationChoose 넘어감
		} else if(form2.isSelected()) {
			dispose();    //바로 다음으로 화면 넘어가기
			form.setForm("삼각체형");
			System.out.println("체형 : 삼각체형");
			new SituationChoose();    //SituationChoose 넘어감
		} else if(form3.isSelected()) {
			dispose();    //바로 다음으로 화면 넘어가기
			form.setForm("역삼각형체형");
			System.out.println("체형 : 역삼각형체형");
			new SituationChoose();    //SituationChoose 넘어감
		} else if(form4.isSelected()) {
			dispose();    //바로 다음으로 화면 넘어가기
			form.setForm("사각체형");
			System.out.println("체형 : 사각체형");
			new SituationChoose();    //SituationChoose 넘어감
		} else if(form5.isSelected()) {
			dispose();    //바로 다음으로 화면 넘어가기
			form.setForm("모래시계형");
			System.out.println("체형 : 모래시계형");
			new SituationChoose();    //SituationChoose 넘어감
		} else if(form6.isSelected()) {
			dispose();    //바로 다음으로 화면 넘어가기
			form.setForm("마름모꼴형");
			System.out.println("체형 : 마름모꼴형");
			new SituationChoose();    //SituationChoose 넘어감
		} else if(form7.isSelected()) {
			dispose();    //바로 다음으로 화면 넘어가기
			form.setForm("둥근체형");
			System.out.println("체형 : 둥근체형");
			new SituationChoose();    //SituationChoose 넘어감
		} else if(form8.isSelected()) {
			dispose();    //바로 다음으로 화면 넘어가기
			form.setForm("튜브체형");
			System.out.println("체형 : 튜브체형");
			new SituationChoose();    //SituationChoose 넘어감
		} else if(form9.isSelected()) {
			dispose();    //바로 다음으로 화면 넘어가기
			form.setForm("직사각형");
			System.out.println("체형 : 직사각형");
			new SituationChoose();    //SituationChoose 넘어감
		} else if(form10.isSelected()) {
			dispose();    //바로 다음으로 화면 넘어가기
			form.setForm("전체적비만");
			System.out.println("체형 : 전체적비만");
			new SituationChoose();    //SituationChoose 넘어감
		}

	}
}
