package com.neusoft;

/**
 * @author Liu
 * @date 2020/5/10 14:57
 */
public class TestEmpJavaBean {
    public static void main(String[] args) {
        EmpJavaBean e = new EmpJavaBean();
        e.setName("孙悟空");
        e.setNumber(123456);
        e.setZhiwei("弼马温");
        e.setMoney(18000);
        System.out.println("姓名："+ e.getName()+"职位："+e.getZhiwei()+"编号:"+e.getNumber()+"薪资："+e.getMoney());
    }
}
