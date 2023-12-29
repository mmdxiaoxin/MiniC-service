package com.mmdxiaoxin.minicservice.util;

import java.util.ArrayList;

public class VariableTable {
	public ArrayList<Variable> variableList = new ArrayList<Variable>();

	public int size() {
		return variableList.size();
	}

	public void addWithCheck(Variable variable) {
		if (variableList.contains(variable)) { // api ����
			System.out.println("\u53d8\u91cf\u4e0d\u80fd\u91cd\u590d\u5b9a\u4e49\uff01 " + variable.getName() + " ["
					+ variable.getLine() + "," + variable.getColumn() + "]");
		} else {
			variableList.add(variable);
		}
	}

	public void addWithCheck(VariableTable varTable) {
		if (varTable != null && varTable.variableList != null) {
			if (variableList == null)
				variableList = varTable.variableList;
			else {
				for (int i = 0; i < varTable.variableList.size(); i++) {
					Variable variable = varTable.variableList.get(i);
					addWithCheck(variable);
				}
			}
		}
	}

	public void remove(Variable info) {
		for (int i = variableList.size() - 1; i >= 0; i--) {
			if (info.getName().equals(variableList.get(i).getName())) {
				variableList.remove(i);
				break;
			}
		}
	}

	public void removeAll(ArrayList<Variable> list) {
		if (list != null)
			for (int i = list.size() - 1; i >= 0; i--) {
				remove(list.get(i));
			}
	}

	public void removeAll(VariableTable varTable) {
		removeAll(varTable.variableList);
	}

	public void clear() {
		variableList.clear();
	}

	public void add(VariableTable varTable) {
		if (varTable != null) {
			for (int i = 0; i < varTable.size(); i++) {
				Variable variable = varTable.get(i);
				variableList.add(variable);
			}
		}
	}

	private Variable get(int i) {
		// TODO Auto-generated method stub
		return variableList.get(i);
	}

	public void printAll() {

		for (int i = 0; i < variableList.size(); i++)
			System.out.print(variableList.get(i).getName() + "  ");
		System.out.println("---------");
	}

	// �������Ѷ���ı������򷵻ظñ������ã����򷵻�null
	public Variable variableExist(Variable info) {
		Variable infoP = null;
		for (int i = variableList.size() - 1; i >= 0; i--) {
			if (variableList.get(i).getName().equals(info.getName())) {
				infoP = variableList.get(i);
				break;
			}
		}
		return infoP;
	}

	public Variable variableExist(String name) {
		Variable infoP = null;
		for (int i = variableList.size() - 1; i >= 0; i--) {
			if (variableList.get(i).getName().equals(name)) {
				infoP = variableList.get(i);
				break;
			}
		}
		return infoP;
	}
}
