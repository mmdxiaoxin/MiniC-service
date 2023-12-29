package com.mmdxiaoxin.minicservice.util;


import com.mmdxiaoxin.minicservice.parser.Token;

import java.util.Objects;

public class Variable {

    private String type;
    private String name;
    private int line;
    private int column;
    private int elementSize;

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

    public void setElementSize(int size) {
        this.elementSize = size;
    }

    public int getElementSize() {
        return elementSize;
    }

    public void printInfo() {
        System.out.println("new Variable:" + toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Variable variable = (Variable) obj;
        return Objects.equals(name, variable.name);
    }

    @Override
    public String toString() {
        return this.type + " " + this.name;
    }

}
