package com.dudu.domain;

import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

import java.util.Date;
import java.util.Random;

 /**
     * @Title: Bar.java
     * @Package com.dudu.domain
     * @Description: fastjson测试的pojo类
     * @author WC
     * @date 2018/5/20 16:34
     */
public class Bar {
    //SerializeConfig：是对序列化过程中一些序列化过程的特殊配置，这里用作日期格式的定义。
    public static SerializeConfig mapping = new SerializeConfig();

    private String barName;
    private int barAge;
    private Date barDate = new Date();

    static {
        mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
    }

    //代码块给Bar对象中的barName和barAge赋值.
    {
        Random random = new Random();
        barName = "name_"+String.valueOf(random.nextInt());
        barAge = random.nextInt();
    }

//    public static void main(String[] args) {
//        //把Bar对象转换成JSON格式的Object类型
//        Object obj = JSON.toJSON(new Bar());
//        System.out.println(obj);
//        //输出{"barAge":-664880579,"barDate":1471348117095,"barName":"name_464160862"}
//
//        //Bar对象转换成String类型的字符串
//        String x1 = JSON.toJSONString(new Bar(), true);
//        System.out.println(x1);
//        //输出:
//    /*
//    {
//        "barAge":1553774697,
//        "barDate":1471348117144,
//        "barName":"name_-1034255192"
//    }
//    */
//
//        //格式化时间的JSON字符串
//        String x2 = JSON.toJSONString(new Bar(), mapping);
//        System.out.println(x2);
//        //输出:{"barAge":1755982737,"barDate":"2016-08-16","barName":"name_453018403"}
//    }

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
    }

    public int getBarAge() {
        return barAge;
    }

    public void setBarAge(int barAge) {
        this.barAge = barAge;
    }

    public Date getBarDate() {
        return barDate;
    }

    public void setBarDate(Date barDate) {
        this.barDate = barDate;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "barName='" + barName + '\'' +
                ", barAge=" + barAge +
                ", barDate=" + barDate +
                '}';
    }
}
