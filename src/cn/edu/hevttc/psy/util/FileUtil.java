package cn.edu.hevttc.psy.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.hevttc.psy.bean.*;

import javax.servlet.ServletContext;
import javax.servlet.jsp.*;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.jspsmart.upload.SmartUpload;


public class FileUtil {

	/**
	 * ��һ����Ԫ�������ַ�������ʽȡֵ��
	 * ���磬������ϵ��ʽ����Ԫ����Ϊ12345����ʱֻ����getNumericCellValue()����ȡֵ��ȡ�õ�ֵΪ12345.0
	 * ����ǿ������ת��Ϊint����12345��Ȼ��ת���ַ�����
	 * ע�⣺��һ����Ԫ������Ϊ��ʱ��ȡ�õ�HSSFCell����Ϊnull�����������ͻᱨNullPointerException��
	 * @param HSSFCell cell���ĸ���Ԫ��
	 * @return �ַ�����ʽ�ĵ�Ԫ��ֵ����Ԫ�����Ϊ���򷵻�null��
	 */

	public String getString(HSSFCell cell){
		String value = null;
		//��Ԫ��Ϊnull���ſ��Լ����������򱨿�ָ���쳣��
		if(cell!=null){
			//��switch����жϵ�Ԫ�����ݵ����ͣ�HSSFCell���Ѿ�Ԥ������һЩ���������Բο�API
			switch(cell.getCellType()){
			case HSSFCell.CELL_TYPE_NUMERIC:
				value = String.valueOf((int)cell.getNumericCellValue());
				break;
			case HSSFCell.CELL_TYPE_STRING:
				value = cell.getStringCellValue();
				break;
			}
		}
		return value;
	}
	
	/**
	 * ��һ����Ԫ������int����ʽȡֵ��
	 * ���磬�������䣬��Ԫ����Ϊ22����ʱ��getNumericCellValue()����ȡֵ��ȡ�õ�ֵΪ22.0
	 * ����ǿ������ת��Ϊint����22��
	 * ע�⣺��һ����Ԫ������Ϊ��ʱ��ȡ�õ�HSSFCell����Ϊnull�����������ͻᱨNullPointerException��
	 * @param HSSFCell cell���ĸ���Ԫ��
	 * @return int��ʽ�ĵ�Ԫ��ֵ����Ԫ�����Ϊ���򷵻�0��
	 */
	
	public int getInt(HSSFCell cell){
		int value = 0;
		//��Ԫ��Ϊnull���ſ��Լ����������򱨿�ָ���쳣��
		if(cell!=null){
			//��switch����жϵ�Ԫ�����ݵ����ͣ�HSSFCell���Ѿ�Ԥ������һЩ���������Բο�API
			switch(cell.getCellType()){
			case HSSFCell.CELL_TYPE_NUMERIC:
				value = (int)cell.getNumericCellValue();
				break;
			case HSSFCell.CELL_TYPE_STRING:
				value = Integer.parseInt(cell.getStringCellValue());
				break;
			}
		}
		return value;
	}	
	public static String exportResult1(List<Result> list,String filePath){
		String fileName=null;
		HSSFWorkbook xls = new HSSFWorkbook();
		Sheet sheet = xls.createSheet("���Խ��");
		Row rowTitle = sheet.createRow(0);
		rowTitle.createCell(0).setCellValue("���");
		rowTitle.createCell(1).setCellValue("ѧ��");
		rowTitle.createCell(2).setCellValue("����");
		rowTitle.createCell(3).setCellValue("�Ա�");
		rowTitle.createCell(4).setCellValue("���Խ��");
		rowTitle.createCell(5).setCellValue("Ժϵ");
		rowTitle.createCell(6).setCellValue("רҵ");
		rowTitle.createCell(7).setCellValue("��ʦ");
		rowTitle.createCell(8).setCellValue("��ѧʱ��");
		rowTitle.createCell(9).setCellValue("�꼶");
		rowTitle.createCell(10).setCellValue("��ϵ��ʽ");
		rowTitle.createCell(11).setCellValue("�����Ծ�");
		rowTitle.createCell(12).setCellValue("��������");
		for(int i=0;i<list.size();i++){
			Row row = sheet.createRow(i+1);
			row.createCell(0).setCellValue(i+1);
			row.createCell(1).setCellValue(list.get(i).getStudentID());
			row.createCell(2).setCellValue(list.get(i).getName());
			row.createCell(3).setCellValue(list.get(i).getSex());
			row.createCell(4).setCellValue(list.get(i).getResultInfo());
			row.createCell(5).setCellValue(list.get(i).getDept());
			row.createCell(6).setCellValue(list.get(i).getMajor());
			row.createCell(7).setCellValue(list.get(i).getTutor());
			row.createCell(8).setCellValue(list.get(i).getYear());
			row.createCell(9).setCellValue(list.get(i).getGrade());
			row.createCell(10).setCellValue(list.get(i).getPhone());
			row.createCell(11).setCellValue(list.get(i).getExamName());
			row.createCell(12).setCellValue(list.get(i).getResultDate());
			}
		try {
			FileOutputStream fos;
			fileName= String.valueOf(System.currentTimeMillis());
			fos = new FileOutputStream(filePath+"/"+fileName+".xls");
			//System.out.println(filePath+"/"+fileName+".xls");
			try {
				xls.write(fos);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fileName;
	}
	public static String exportResult(List<Temporary> list,String filePath){
		String fileName=null;
		HSSFWorkbook xls = new HSSFWorkbook();
		Sheet sheet = xls.createSheet("���Խ��");
		Row rowTitle = sheet.createRow(0);
		rowTitle.createCell(0).setCellValue("���");
		rowTitle.createCell(1).setCellValue("���֤��");
		rowTitle.createCell(2).setCellValue("����");
		rowTitle.createCell(3).setCellValue("���Խ��");
		rowTitle.createCell(4).setCellValue("Ժϵ");
		rowTitle.createCell(5).setCellValue("�����Ծ�");
		rowTitle.createCell(6).setCellValue("��������");
		for(int i=0;i<list.size();i++){
			Row row = sheet.createRow(i+1);
			row.createCell(0).setCellValue(i+1);
			row.createCell(1).setCellValue(list.get(i).getCardID());
			row.createCell(2).setCellValue(list.get(i).getName());
			row.createCell(3).setCellValue(list.get(i).getResultInfo());
			row.createCell(4).setCellValue(list.get(i).getDept());
			row.createCell(5).setCellValue(list.get(i).getExamName());
			row.createCell(6).setCellValue(list.get(i).getResultDate());
			}
		try {
			FileOutputStream fos;
			fileName= String.valueOf(System.currentTimeMillis());
			fos = new FileOutputStream(filePath+"/"+fileName+".xls");
			//System.out.println(filePath+"/"+fileName+".xls");
			try {
				xls.write(fos);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fileName;
	}
	public List<Student> getStudent(String fileName){
		List<Student> list = new ArrayList<Student>();
		HSSFWorkbook workbook;
		try {
			workbook = new HSSFWorkbook(new FileInputStream(fileName));
			HSSFSheet sheet = workbook.getSheet("sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows()-1;
			HSSFRow row = null;
			for(int i=1;i<=rowCount;i++){
				row = sheet.getRow(i);
				Student student=new Student();
				student.setName(this.getString(row.getCell(0)));
				student.setStudentID(this.getString(row.getCell(1)));
				student.setSex(this.getString(row.getCell(2)));
				student.setDept(this.getString(row.getCell(3)));
				student.setMajor(this.getString(row.getCell(4)));
				student.setTutor(this.getString(row.getCell(5)));
				student.setYear(this.getInt(row.getCell(6)));
				student.setGrade(this.getInt(row.getCell(7)));
				student.setPhone(this.getString(row.getCell(8)));
				list.add(student);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return list;
	}
	public List<Question> getExamFromXls(String fileName){
		List<Question> exam = new ArrayList<Question>();
		try{
			//����һ��������������FileInputStream����һ��HSSFWorkbook����
			HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(fileName));
			//ȡ�ù�������ָ���Ĺ����������HSSFWorkbook��getSheet(String sheetName)����ȡ��һ��HSSFSheet����
			HSSFSheet sheet = workbook.getSheet("sheet1");
			//ȡ�ù������еļ�¼����sheet.getPhysicalNumberOfRows()��������������һ��Ϊ�����У���˼�1.
			int rowCount = sheet.getPhysicalNumberOfRows()-1;
			//ȡ�ù������е�������
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			HSSFRow row = null;
			HSSFCell cell = null;			
			//���δ���ÿһ��
			for(int i=1;i<=rowCount;i++){
				//ȡ�ù�������ָ�����ж���
				row = sheet.getRow(i);
				//new Exam���󣬲��ø��ֶε�ֵΪ�丳ֵ��
				Question question = new Question();
				//row.getCell(int index)�᷵��ָ���ĵ�Ԫ�񣬵������Ԫ����û�����ݣ��򷵻�null��ע�⴦��
				question.setId(this.getInt(row.getCell(0)));
				question.setTableName(this.getString(row.getCell(1)));
				question.setType(this.getInt(row.getCell(2)));
				question.setQuestionTitle(this.getString(row.getCell(3)));
				int k=4;
				while(row.getCell(k)!=null){
					question.addAnswer(this.getString(row.getCell(k)));
					k++;
				}
				//��Student�������List��
				exam.add(question);
			}			
		}catch(Exception e){
			e.printStackTrace();
		}
		return exam;		
	}
	public List<Question> getExamFromXls1(String fileName){
		List<Question> exam = new ArrayList<Question>();
		try{
			//����һ��������������FileInputStream����һ��HSSFWorkbook����
			HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(fileName));
			//ȡ�ù�������ָ���Ĺ����������HSSFWorkbook��getSheet(String sheetName)����ȡ��һ��HSSFSheet����
			HSSFSheet sheet = workbook.getSheet("sheet1");
			//ȡ�ù������еļ�¼����sheet.getPhysicalNumberOfRows()��������������һ��Ϊ�����У���˼�1.
			int rowCount = sheet.getPhysicalNumberOfRows()-1;
			//ȡ�ù������е�������
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			HSSFRow row = null;
			HSSFCell cell = null;			
			//���δ���ÿһ��
			for(int i=1;i<=rowCount;i++){
				//ȡ�ù�������ָ�����ж���
				row = sheet.getRow(i);
				//new Exam���󣬲��ø��ֶε�ֵΪ�丳ֵ��
				Question question = new Question();
				//row.getCell(int index)�᷵��ָ���ĵ�Ԫ�񣬵������Ԫ����û�����ݣ��򷵻�null��ע�⴦��
				question.setId(this.getInt(row.getCell(0)));
				int k=1;
				while(row.getCell(k)!=null){
					question.addAnswer(this.getString(row.getCell(k)));
					k++;
				}
				//��Student�������List��
				exam.add(question);
			}			
		}catch(Exception e){
			e.printStackTrace();
		}
		return exam;		
	}
	public List<String> getExamTitle(String fileName){
		List<String> examTitle = new ArrayList<String>();
		try{
			//����һ��������������FileInputStream����һ��HSSFWorkbook����
			HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(fileName));
			//ȡ�ù�������ָ���Ĺ����������HSSFWorkbook��getSheet(String sheetName)����ȡ��һ��HSSFSheet����
			HSSFSheet sheet = workbook.getSheet("sheet1");
			HSSFRow row = sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++){
				examTitle.add(this.getString(row.getCell(i)));
			}	
		}catch(Exception e){
			e.printStackTrace();
		}
		return examTitle;		
	}
	public String getFileNamea(String filename) {   
        if ((filename != null) && (filename.length() > 0)) {   
            int dot = filename.lastIndexOf('.');   
            if ((dot >-1) && (dot < (filename.length()))) {   
                return filename.substring(0,dot);   
            }   
        }   
        return filename;   
    }   

	public String getFileNameNoEx(String filename) {   
        if ((filename != null) && (filename.length() > 0)) {   
            int dot = filename.lastIndexOf('.');   
            if ((dot >-1) && (dot < (filename.length()-1))) {   
                return filename.substring(dot+1);   
            }   
        }   
        return filename;   
    }   
}
