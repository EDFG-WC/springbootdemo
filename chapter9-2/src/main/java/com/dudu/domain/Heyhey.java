package com.dudu.domain;

public class Heyhey {
    private String gaga;
    private String ed;
    private String taylor;

    public Heyhey() {
    }

    public Heyhey(String gaga, String ed, String taylor) {
        this.gaga = gaga;
        this.ed = ed;
        this.taylor = taylor;
    }

    public String getGaga() {
        return gaga;
    }

    public void setGaga(String gaga) {
        this.gaga = gaga;
    }

    public String getEd() {
        return ed;
    }

    public void setEd(String ed) {
        this.ed = ed;
    }

    public String getTaylor() {
        return taylor;
    }

    public void setTaylor(String taylor) {
        this.taylor = taylor;
    }

    @Override
    public String toString() {
        return "Heyhey{" +
                "gaga='" + gaga + '\'' +
                ", ed='" + ed + '\'' +
                ", taylor='" + taylor + '\'' +
                '}';
    }
}
