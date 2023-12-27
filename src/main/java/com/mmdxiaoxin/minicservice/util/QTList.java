package com.mmdxiaoxin.minicservice.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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
        if (index >= 0 && index < QTList.size()) {
            return QTList.get(index);
        } else {
            return null;
        }
    }

    public QTInfo remove(int index) {
        if (index >= 1 && index < QTList.size()) {
            return QTList.remove(index - 1);
        } else {
            return null;
        }
    }

    public void clear() {
        QTList.clear();
        QTInfo.size = 0;
    }

    public void printQTTable(FileWriter fos) throws IOException, IOException {
        try (BufferedWriter writer = new BufferedWriter(fos)) {
            for (QTInfo tmp : QTList) {
                writer.write(tmp.toString());
            }
        }
    }

    public String printQTTable() {
        StringBuilder result = new StringBuilder();
        for (QTInfo tmp : QTList) {
            result.append(tmp.toString());
        }
        return result.toString();
    }

}
