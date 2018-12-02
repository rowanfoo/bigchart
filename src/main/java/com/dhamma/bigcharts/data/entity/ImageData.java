package com.dhamma.bigcharts.data.entity;

import lombok.Data;

@Data
public class ImageData {

private  int  year;
private String  code;
private String  imagedata;

    public ImageData(){}
    public ImageData(int year ,String  code, String imagedata){
        this.year = year;
        this.imagedata = imagedata;
        this.code = code;

    }


}
