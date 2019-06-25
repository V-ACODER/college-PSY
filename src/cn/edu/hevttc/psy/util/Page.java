package cn.edu.hevttc.psy.util;


public class Page {
	//��ҳ��
	private int totalPageCount=1;
	//ҳ���С����ÿҳ��ʾ��¼��
	private int pageSize=0;
	//��¼����
	private int recordCount=0;
	//��ǰҳ��
	private int currPageNo=1;
	
	

	public int getCurrPageNo() {
		if(totalPageCount==0)
			return 0;
		return currPageNo;
	}
	public void setCurrPageNo(int currPageNo) {
		if(currPageNo>0)
			this.currPageNo = currPageNo;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		if(pageSize>0)
			this.pageSize = pageSize;
	}
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		if(recordCount>0){
			this.recordCount = recordCount;
			setTotalPageCountByRs();
		}
		
	}
	
	//������ҳ��
	public void setTotalPageCountByRs(){
		if(this.recordCount%this.pageSize==0)
			this.totalPageCount=this.recordCount/this.pageSize;
		else if(this.recordCount%this.pageSize>0)
			this.totalPageCount=this.recordCount/this.pageSize+1;
		else
			this.totalPageCount=0;
	}
	
	/**
	 * �õ���ʼ��¼��
	 * */
	public int getStartRow(){
		return (currPageNo-1)*pageSize+1;
	}
	
	/**
	 * �õ�������¼��
	 * */
	public int getEndRow(){
		if(totalPageCount==currPageNo) return recordCount;
	
		return currPageNo*pageSize;
	}
}
