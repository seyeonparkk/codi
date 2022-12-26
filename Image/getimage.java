package Image;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
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

public class getimage extends JFrame implements ActionListener {
	
	JFrame frame = new JFrame("코디쟁이");
	public Label la = new Label();
	String name;
    Connection conn = null;
    PreparedStatement pstmt = null;     //sql문 전송하는 객체
    Statement stmt = null; // SQL 문을 데이터베이스에 보내기위한 객체 
    ResultSet rs = null;       
    user res = new user();
    user test = new user();
    private Image background=new ImageIcon("src/image/final.png").getImage();//배경이미지
    
	public getimage() {
	       try{
	           Class.forName("com.mysql.jdbc.Driver");     //코드가 실행중에 오류가 나면 catch블록에서 오류 잡을 수 있음
	           String url = "jdbc:mysql://localhost:3306/codi";
	           conn = DriverManager.getConnection(url, "root", "0000");    //connection 객체를 연결
	           String SQL = "SELECT id FROM codi where gender = '"+ res.gender + "' and shape = '" + res.form + "' and situation = '" + res.situation +"';" ;  //성별,체형,상황을 id에 넣음
	           stmt = conn.createStatement();    //db로 sql문을 요청하기 위해 생성
	           rs = stmt.executeQuery(SQL);     //sql 결과를 resultset rs에 저장
	           System.out.println("회원님의 코디가 곧 나옵니다.기다려 주세요.");    //연결확인 문구 출력
	           
	           while (rs.next()) {     //한 행씩 반복처리
	           	int id = rs.getInt("id");       //id로 선언
	           	System.out.println("id값 :  " + id);     //유저에게 id값을 알려주는 문구 출력
	           	res.setId(id);    //sql id를 가지고 옴
				
	           }

	       }
	       catch(ClassNotFoundException e1){
	           System.out.println("드라이버 로딩 실패");
	       }
	       catch(SQLException e1){
	           System.out.println("에러: " + e1);
	       }
	       finally{
	           try{
	               if( conn != null && !conn.isClosed()){
	                   conn.close();
	               }
	           }
	           catch( SQLException e1){
	               e1.printStackTrace();
	           }
	       }
		
		frame.setSize(720,720);//프레임의 크기
		frame.setResizable(false);//창의 크기를 변경하지 못하게
		frame.setLocationRelativeTo(null);//창이 가운데 나오게
		frame.setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		int id = test.id;
		frame.setLayout(null);           //배치관리자를 지정하지 않음
		frame.setVisible(true);                //화면을 보이게 함
		JLabel imgLabel = new JLabel();      //JLabel을 만듦
		ImageIcon img = new ImageIcon(getimage.class.getResource("../photo/"+id+".png"));  //해당 id에 해당하는 이미지를 가져옴
		imgLabel.setIcon(img);
		imgLabel.setSize(720,720);      //사이즈를 720,720으로 맞춤
		frame.add(imgLabel);
		JPanel main_pannel;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}



public void paint(Graphics g) {//그리는 함수
g.drawImage(background, 0, 0, null);//background를 그려줌
}
}

