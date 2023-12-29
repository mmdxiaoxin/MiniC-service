package com.mmdxiaoxin.minicservice.util;

import java.util.ArrayList;

public class VariableTable {
	public ArrayList<Variable> variableList = new ArrayList<Variable>();

	public int size() {
		return variableList.size();
	}

	public String addWithCheck(Variable variable) {
		String result = null;
		if (variableList.contains(variable)) {
			System.out.println("\u53d8\u91cf\u4e0d\u80fd\u91cd\u590d\u5b9a\u4e49\uff01 " + variable.getName() + " [line:"
					+ variable.getLine() + ", column:" + variable.getColumn() + "]");
			result = "\u53d8\u91cf\u4e0d\u80fd\u91cd\u590d\u5b9a\u4e49\uff01 " + variable.getName() + " [line:"
					+ variable.getLine() + ", column:" + variable.getColumn() + "]";
		} else {
			variableList.add(variable);
		}
		return result;
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

	public void add(VariableTable varTable) {
		if (varTable != null) {
			for (int i = 0; i < varTable.size(); i++) {
				Variable variable = varTable.get(i);
				variableList.add(variable);
			}
		}
	}

	private Variable get(int i) {
		return variableList.get(i);
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

