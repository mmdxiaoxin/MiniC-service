package com.mmdxiaoxin.minicservice.util;

import com.mmdxiaoxin.minicservice.parser.Token;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Variable {

	private String type;
	private String name;
	private int line;
	private int column;
	private int elementSize;
	private ArrayInfo arrayInfo = null;
	private ArrayList<Integer> arrayInfoVar = null;

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
            return other.name == null;
		} else return name.equals(other.name);
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

	public boolean checkDemen(ArrayList<Integer> intList) {
		boolean flag = false;
		if (this.arrayInfo.checkArray(intList))
			flag = true;
		else
			System.out.println("数组" + this.name + "下标异常");
		return flag;
	}
}
