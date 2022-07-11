/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tk.restexample2.restdemo2.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

/**
 *
 * @author Nikhil TK
 */
@JsonFilter("dynamicBeanFilter")
public class DynamicBean {
    
    private String data1;
    private String data2;
    private String data3;

    public DynamicBean(String data1, String data2, String data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    
    
}
