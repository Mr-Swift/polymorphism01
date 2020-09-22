package com.apple.developer.chapter02.doctor;

public final class Specialist extends Doctor {
    private String speciality;

    protected Specialist(String name, String id, String address, String speciality) {
        super(name, id, address);
        this.speciality = speciality;
    }

    public void getInfo() {
        System.out.println("种类：专业医生\t姓名：" + this.name + "\t编号：" + id + "\t地址：" + address + "\t专业：" + speciality);
    }
}
