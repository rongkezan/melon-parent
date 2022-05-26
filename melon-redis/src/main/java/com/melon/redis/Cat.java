package com.melon.redis;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Cat implements Serializable {

    private String name = "tom";

    private Integer age = 3;

    private Double weight = 22D;

    private String desc = "This is a cat";

    private LocalDateTime now = LocalDateTime.now();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDateTime getNow() {
        return now;
    }

    public void setNow(LocalDateTime now) {
        this.now = now;
    }
}
