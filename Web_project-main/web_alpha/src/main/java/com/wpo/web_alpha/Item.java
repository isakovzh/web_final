package com.wpo.web_alpha;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

public class Item {
    @NotBlank(message = "Choose category")
    private String category;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Choose start time")
    private String begin;
    @NotBlank(message = "Choose finish time")
    private String end;
    @Future(message = "Order time cannot be in the past")
    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date date;



    public Item(String category, String name, String begin, String end, Date date) {
        this.category = category;
        this.name = name;
        this.begin = begin;
        this.end = end;
        this.date = date;
    }



    public Item() {
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBegin() {
        return this.begin;
    }

    public void setBegin(
        String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return this.end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
