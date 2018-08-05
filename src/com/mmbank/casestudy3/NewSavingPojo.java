package com.mmbank.casestudy3;

public class NewSavingPojo {
	
	private String accHolderName;
	private int accNm;
	private float accBal;
	private boolean isSal;
	
	public NewSavingPojo(String accHolderName, int accNm, float accBal) {
		super();
		this.accHolderName = accHolderName;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public int getAccNm() {
		return accNm;
	}
	public void setAccNm(int accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	public boolean isSal() {
		return isSal;
	}
	public void setSal(boolean isSal) {
		this.isSal = isSal;
	}

	@Override
	public String toString() {
		return "NewSavingPojo [accHolderName=" + accHolderName + ", accNm=" + accNm + ", accBal=" + accBal + ", isSal="
				+ isSal + "]";
	}
	
}
