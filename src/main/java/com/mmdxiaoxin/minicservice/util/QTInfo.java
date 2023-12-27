package com.mmdxiaoxin.minicservice.util;

//������Ԫʽ����Ϣ
public class QTInfo {
	public static int START = 0;
	public static int innerIdSeqen = START;
	public static int size = 0;
	private int innerId;
	private String operator;
	private String arg1;
	private String arg2;
	private String result;

	public QTInfo(String operator, String arg1, String arg2, String result) {
		super();
		this.innerId = ++size;
		this.operator = operator;
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.result = result;
	}

	public QTInfo(String operator, String arg1, String arg2, int result) {
		this(operator, arg1, arg2, result + "");
	}

	public String getOperator() {
		return this.operator;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setResult(int result) {
		this.result = "" + result;
	}

	public String getResult() {
		return this.result;
	}

	public void setInnerId(int innerID) {
		this.innerId = innerID;
	}

	public int getInnerIdSeqen() {
		return size;
	}

	public String toString() {
		String formattedString = "%-3d: (%-10s, %-10s, %-10s, %-10s)%n";
		return String.format(formattedString, this.innerId, this.operator, this.arg1, this.arg2, this.result);
	}
}
