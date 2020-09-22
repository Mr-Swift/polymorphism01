package com.apple.developer.chapter02.doctor;

public final class NoSpecialist extends Doctor {
    protected NoSpecialist(String name, String id, String address) {
        super(name, id, address);
    }

    public void getInfo() {
        System.out.println("种类：专业医生\t姓名：" + this.name + "\t编号：" + id + "\t地址：" + address);
    }
}
