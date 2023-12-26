package com.mmdxiaoxin.minicservice.util;

import com.mmdxiaoxin.minicservice.parser.Token;

import java.util.ArrayList;

public class Variable {

	private String type; // ��������
	private String name; // ������
	private int line;
	private int column;
	private int elementSize;// Ԫ��ռ�ֽڵĸ�����������������ʱ��ֵ
	private ArrayInfo arrayInfo = null; // ����������ֻ��������������������
	private ArrayList<Integer> arrayInfoVar = null; // �������ʹ��ʱ���±�
//	private String address = null;

	public Variable() {

	}

	public Variable(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public Variable(String type, Token token) {
		this.type = type;
		this.name = token.image;
		this.line = token.endLine;
		this.column = token.endColumn;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getLine() {
		return this.line;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getColumn() {
		return this.column;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Variable other = (Variable) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void setArrayInfo(ArrayInfo arrayInfo) {
		this.arrayInfo = arrayInfo;
	}

	public void setArrayInfoVar(ArrayList<Integer> intList) {
		this.arrayInfoVar = intList;
	}

	public ArrayList<Integer> getArrayInfoVar() {
		return this.arrayInfoVar;
	}
//
//	public void setElementSize(String type) {
//		this.elementSize = FundamentalTypeInfo.sizeof(type);
//	}

	public void setElementSize(int size) {
		this.elementSize = size;
	}

	public int getElementSize() {
		return elementSize;
	}

	public boolean checkArray(Variable info, ArrayList<Integer> intList) {
		boolean flag = true;
		if (this.name.equals(info.getName()))
			if (checkDemen(intList)) {
				flag = true;
			}
		return flag;
	}

	public String toString() {
		String str = null;
		if (this.arrayInfo == null) {
			str = this.type + " " + this.name;
		} else {
			str = this.type + " " + this.name + this.arrayInfo;
		}
		return str;
	}

	public void printInfo() {
		System.out.println("new Variable:" + toString());
	}

	public boolean checkDemen(ArrayList<Integer> intList) {
		boolean flag = false;
		if (this.arrayInfo.checkArray(intList))
			flag = true;
		else
			System.out.println("����" + this.name + "�±��쳣");
		return flag;
	}

//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getAddress() {
//		return this.address;
//	}

	public ArrayInfo getArrayInfo() {
		return this.arrayInfo;
	}

}
