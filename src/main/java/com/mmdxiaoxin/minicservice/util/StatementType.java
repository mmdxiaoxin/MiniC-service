package com.mmdxiaoxin.minicservice.util;

import java.util.ArrayList;


public class StatementType {

	public VariableTable varTable = null; // �������ʹ��
	public Variable      var = null;			// ��ֵ���ʹ��
	
	// return  break 
	
	public void setVariableTable(VariableTable variableTable) {
		this.varTable = variableTable;
	}
	public void setVariable(Variable var) {
		this.var = var;
	}
	
}
