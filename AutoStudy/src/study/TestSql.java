package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TestSql {
	
	public Connection getCon() {
        //���ݿ���������
        String username="root";
        //���ݿ���������
        String password="";
        String driver="com.mysql.jdbc.Driver";
        //����testΪ���ݿ�����
        String url="jdbc:mysql://localhost:3306/test";
        Connection conn=null;
        try{
            Class.forName(driver);
            conn=(Connection) DriverManager.getConnection(url,username,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
	
	public List<String> getSelect() { 
//	���������� sql���
	        String sql = "select * from user"; 
//	���������� ��ȡ������
	        Connection conn = getCon();
	        PreparedStatement pst = null;
	        // ����һ��list���ڽ������ݿ��ѯ��������
	        List<String> list = new ArrayList<String>();
	        try {
	            pst = (PreparedStatement) conn.prepareStatement(sql);
	            ResultSet rs = pst.executeQuery();
	            while (rs.next()) {
	                // ����ѯ����������ӵ�list�У�����userNameΪ���ݿ��е��ֶ�����
	                list.add(rs.getString("userName"));
	            }
	        } catch (Exception e) {
	        }
	        return list;
	    }
	
	public static void main(String[] args) {
//	����������	����TestDaoΪ����
	        TestSql dao = new TestSql();
//	����������	�½�һ��list�õ���ѯ�����з��صļ���
	        List<String> list = dao.getSelect();
//	����������	�Եõ���list���б������������̨��
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println(list.get(i));
	        }
	    }
}
