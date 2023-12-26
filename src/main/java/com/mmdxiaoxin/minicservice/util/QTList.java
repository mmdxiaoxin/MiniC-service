package com.mmdxiaoxin.minicservice.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class QTList {
	public ArrayList<QTInfo> QTList = new ArrayList<QTInfo>();
	public static boolean flag = true;

	public void addQTInfo(QTInfo info) {
		QTList.add(info);
	}

	public void addQTInfo(int index, QTInfo info) {
		QTList.add(index, info);
	}

	public QTInfo get(int index) {
		return (QTInfo) QTList.get(index);
	}

	public QTInfo remove(int index) {
		return QTList.remove(index - 1);
	}

	public void clear() {
		QTList.clear();
		QTInfo.size = 0;
	}

	public void printQTTable(FileWriter fos) {
		Iterator<QTInfo> itr = QTList.iterator();
		try {
			while (itr.hasNext()) {
				QTInfo tmp = itr.next();
				fos.write(Arrays.toString(tmp.toString().getBytes()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public String printQTTable() {
		Iterator<QTInfo> itr = QTList.iterator();
		StringBuilder result = new StringBuilder();
		try {
			while (itr.hasNext()) {
				QTInfo tmp = (QTInfo) itr.next();
				String st = new String(tmp.toString());
				result.append(st);
			}
			return result.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

}
