package cn.edu.hevttc.psy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.edu.hevttc.psy.bean.*;
import cn.edu.hevttc.psy.dao.*;

public class StudentIndex extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public StudentIndex() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int tag=0;
		request.setCharacterEncoding("utf-8");
		HttpSession session= request.getSession();
		if("��¼".equals(request.getParameter("submit1"))){
			String name=request.getParameter("name");
			String cardID=request.getParameter("cardID");			
			Pattern idNumPattern = Pattern.compile("(\\d{14}[0-9a-zA-Z])|(\\d{17}[0-9a-zA-Z])");
			Matcher idNumMatcher = idNumPattern.matcher(cardID); 
			if(!idNumMatcher.matches()){
				session.setAttribute("index_error","���֤�Ų��Ϸ���");
				tag=-1;
				response.sendRedirect("index.jsp");
			}
			else if(cardID==null ||name==null||cardID.equals("")||name.equals("")){
				session.setAttribute("index_error","*Ϊ�������Ϊ�գ�");
				tag=-1;
				response.sendRedirect("index.jsp");
			}else{
				String dept=request.getParameter("dept");
				Temporary temp = new Temporary();
				temp.setName(name);
				temp.setCardID(cardID);
				temp.setDept(dept);
				session.setAttribute("temp",temp);
				session.setAttribute("name",request.getParameter("name"));
			    tag=2;
			    ExamInfoDAO eIDAO = new ExamInfoDAO();
				List<ExamInfo> list = eIDAO.find();
				session.setAttribute("examInfoS", list);
			    response.sendRedirect("TitleServlet?examListID=0");
			}
		}else if("��¼".equals(request.getParameter("submit2"))){
			String name= request.getParameter("name");
			String studentID=request.getParameter("studentID");
			session.setAttribute("studentID",studentID);
			if(studentID==null ||name==null||studentID.equals("")||name.equals("")){
				session.setAttribute("index_error","*Ϊ�������Ϊ�գ�");
				tag=-1;
				response.sendRedirect("index.jsp");
			}else{
				StudentDAO sDAO = new StudentDAO();
				Student student=new Student(name,studentID);
				student = sDAO.find(student);
				if(student!=null){
					session.setAttribute("Student",student);
					tag=2;//�ɹ���½
					ExamInfoDAO eIDAO = new ExamInfoDAO();
					List<ExamInfo> list = eIDAO.find();
					session.setAttribute("examInfoS", list);
					session.setAttribute("name",request.getParameter("name"));
					response.sendRedirect("title.jsp");
				}else{
					session.setAttribute("index_error","��ѧ����Ϣ������");
					tag=-1;//Ӧ�����˺��������&&�����Ƿ�
					response.sendRedirect("index.jsp");
				}
			}
		}else{
			tag=0;//û�е����½��֪��������.������ҳ
			session.invalidate();
			response.sendRedirect("index.jsp");
		}
		

	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
