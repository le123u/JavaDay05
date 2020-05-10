package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/10 14:57
 */
public class EmpJavaBean {
    // 员工姓名
    private String name;
    // 工号
    private int number;

    // 职位
    private String zhiwei;

    //薪资
    private int money;

    public EmpJavaBean(){

    }

    public String getName() {
        return name;
    }
    public int getNumber(){
        return number;
    }
    public String getZhiwei() {
        return zhiwei;
    }
    public int getMoney(){
        return money;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setZhiwei(String zhiwei){
        this.zhiwei = zhiwei;
    }
    public void setMoney(int money){
        this.money = money;
    }
}
