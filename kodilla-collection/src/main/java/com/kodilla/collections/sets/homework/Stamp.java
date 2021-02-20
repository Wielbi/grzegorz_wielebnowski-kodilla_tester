package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String installed;
    private int length;
    private int width;


    public Stamp( String stampName, String installed,int length, int width){
        this.stampName = stampName;
        this.installed = installed;
        this.length = length;
        this.width = width;

    }
    public String getStampName(){
        return stampName;
    }
    public String getInstalled(){
        return installed;

    }
    public int getLength(){
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return length == stamp.length &&
                width == stamp.width &&
                Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(installed, stamp.installed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, installed, length, width);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", installed='" + installed + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public int getWidth(){
        return width;


    }

}
