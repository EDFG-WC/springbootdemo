package com.dudu.domain;

import java.util.List;

public class Data {
    List<List<Object>> tableData;
    List<String> tableHead;

    public Data() {
    }

    public Data(List<List<Object>> tableData, List<String> tableHead) {
        this.tableData = tableData;
        this.tableHead = tableHead;
    }

    public List<List<Object>> getTableData() {
        return tableData;
    }

    public void setTableData(List<List<Object>> tableData) {
        this.tableData = tableData;
    }

    public List<String> getTableHead() {
        return tableHead;
    }

    public void setTableHead(List<String> tableHead) {
        this.tableHead = tableHead;
    }

    @Override
    public String toString() {
        return "Data{" +
                "tableData=" + tableData +
                ", tableHead=" + tableHead +
                '}';
    }
}
