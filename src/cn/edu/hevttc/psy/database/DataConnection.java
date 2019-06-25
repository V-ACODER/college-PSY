package cn.edu.hevttc.psy.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Properties;
public class DataConnection {
	//ȡ�����ӳ��е�����
	private static Properties prop=new Properties();
	static{
		try{
			prop.load(DataConnection.class.getResourceAsStream("/database.properties"));
		}catch(Exception e){
			
		}
	}
	public static Connection getFreeConnection(){
		Connection conn=null;
		try{
			Class.forName(prop.getProperty("driverClass")).newInstance();
			String url=prop.getProperty("url");
			String user=prop.getProperty("user");
			String password=prop.getProperty("password");
			conn=DriverManager.getConnection(url,user,password);
			//System.out.println("���ݿ����ӳɹ���");
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	//ȡ��PreparedStatement
	public static PreparedStatement getPreparedStatement(Connection conn,String sql){
		PreparedStatement pstmt=null;
		try{
			pstmt=conn.prepareStatement(sql);
		}catch(Exception e){
			e.printStackTrace();
		}
		return pstmt;
	}
	//ȡ��PreparedStatement��DML����
	public static boolean execute(PreparedStatement pstmt){
		boolean re=false;
		int number=0;
		try{
			number=pstmt.executeUpdate();
			if(number>0){
				re=true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return re;
	}

	//ȡ��Statement
	public static Statement getStatement(Connection conn){
		Statement st=null;
		try{
			st=conn.createStatement();
		}catch(Exception e){
			e.printStackTrace();
		}
		return st;
	}
	public static boolean executeSql(Statement st,String sql){
		boolean flag=false;
		try{
			st.execute(sql);
			flag=true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
		
	}
	//ȡ��ͨ��Statement��ѯ�õ���ResultSet
	public static ResultSet getResult(Statement st,String sql){
		ResultSet rs = null;
		try{
			rs=st.executeQuery(sql);
		}catch(Exception e){
			e.printStackTrace();
		}
		return rs;
	}
	public static int getUpdate(Statement st,String sql){
		int rs = 0;
		try{
			rs=st.executeUpdate(sql);
		}catch(Exception e){
			e.printStackTrace();
		}
		return rs;
	}
	//ͨ��PreparedStatement��ѯ�õ���ResultSet
	public static ResultSet getResult(PreparedStatement pstmt){
		ResultSet rs = null;
		try{
			rs=pstmt.executeQuery();
		}catch(Exception e){
			e.printStackTrace();
		}
		return rs;
	}
	//�ر�ResultSet
	public static void closeResultSet(ResultSet rs){
		try{
			if(rs!=null){
				rs.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//�ر�Statement
	public static void closeStatement(Statement st){
		try{
			if(st!=null) st.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void colsePstmt(PreparedStatement pstmt){
		if(pstmt!=null)
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
   //�ر�Connection
	public static void closeConnection(Connection conn){
		try{
			if(conn!=null) conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public boolean createConn() {
		// TODO Auto-generated method stub
		return false;
	}
}
