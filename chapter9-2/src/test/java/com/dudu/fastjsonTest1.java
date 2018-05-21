package com.dudu;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;
import com.dudu.domain.Bar;
import com.dudu.domain.Foo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class fastjsonTest1 {

    @Test
    public void test1() {
        //把Bar对象转换成JSON格式的Object类型
        Object obj = JSON.toJSON(new Bar());
        System.out.println(obj);
        //输出{"barAge":-664880579,"barDate":1471348117095,"barName":"name_464160862"}

        //Bar对象转换成String类型的字符串
        String x1 = JSON.toJSONString(new Bar(), false);
        System.out.println(x1);
        //输出:
    /*
    {
        "barAge":1553774697,
        "barDate":1471348117144,
        "barName":"name_-1034255192"
    }
    */

        //格式化时间的JSON字符串
        String x2 = JSON.toJSONString(new Bar(), Bar.mapping);
        System.out.println(x2);
        //输出:{"barAge":1755982737,"barDate":"2016-08-16","barName":"name_453018403"}
    }

    @Test
    public void test2() {
        Date date = new Date();
        String text = JSON.toJSONString(date, Bar.mapping);
        System.out.println(text);//输出"2016-08-16 19:53:07"

        Foo f1 = new Foo();
        //System.out.println("输出转换成json格式的Foo对象: ----------------------------------------");
        //System.out.println(JSON.toJSONString(f1, true));

        String x2 = JSON.toJSONString(f1, Bar.mapping);
        //System.out.println("输出转换了日期的Foo对象,: ----------------------------------------");
        //System.out.println(x2);

        //List -> JSON array
        //json2List();

        //json2Map();

        //普通类型Array数组和JSON的相互转换
        //array2JSON();

        //array2JSON2();

        //普通类型Map和JSON的相互转换
        map2JSON();

        //listMap2Json();
    }

    public static void json2List() {
        //List -> JSON array
        System.out.println("List -> JSON array--------------------");
        List<Bar> barList = new ArrayList<Bar>();
        barList.add(new Bar());
        barList.add(new Bar());
        barList.add(new Bar());
        String json = JSON.toJSONString(barList, true);
        System.out.println(json);

        //JSON array -> List
        System.out.println("JSON array -> List-------------------");
        List<Bar> barList1 = JSON.parseArray(json, Bar.class);
        for (Bar bar : barList1) {
            System.out.println(bar.toString());
        }
        //这里可以看出不循环直接打印也没问题.
        //System.out.println(barList1);
    }

    public static void json2Map() {
        //Map -> JSON
        Map<String, Bar> map = new HashMap<String, Bar>();
        map.put("a", new Bar());
        map.put("b", new Bar());
        map.put("c", new Bar());
        String json = JSON.toJSONString(map, Bar.mapping);
        System.out.println(json);

        //JSON -> MapBar.mapping
        Map<String, Bar> map1 = (Map<String, Bar>) JSON.parse(json);
//        for (String key : map1.keySet()) {
//            System.out.println(key+":"+map1.get(key));
//        }
        System.out.println(map1);
    }


    public static void array2JSON() {
        //String数组转换成JSON
        String[] arr_String = {"a", "b", "c"};
        String json_arr_String = JSON.toJSONString(arr_String, true);
        System.out.println(json_arr_String); //输出["a","b","c"]

        //JSON转换成array
        JSONArray jsonArray = JSON.parseArray(json_arr_String);
        for (Object o : jsonArray) {
            System.out.println(o);
        }
    /* 输出:
     a
     b
     c
     */
        System.out.println(jsonArray);//输出:["a","b","c"]
    }

    public static void array2JSON2() {
        Bar[] arr_Bar = {new Bar(), new Bar(), new Bar()};
        String json_arr_Bar = JSON.toJSONString(arr_Bar, true);
        System.out.println(json_arr_Bar);
        JSONArray jsonArray = JSON.parseArray(json_arr_Bar);
        for (Object o : jsonArray) {
            System.out.println(o);
        }
        System.out.println(jsonArray);
    }


    public static void map2JSON() {

        //Map转换成JSON
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        String json = JSON.toJSONString(map);
        //System.out.println(json);//输出{"a":"aaa","b":"bbb","c":"ccc"}

        //JSON转换成Map
        Map map1 = JSON.parseObject(json,Map.class);

        for (Object o : map.entrySet()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) o;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

        System.out.println(map1);
    /*
     b--->bbb
     c--->ccc
     a--->aaa
    */
    }

    public void listMap2Json() {
        List<Map<String, Object>> listMap = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Map<String,Object> map = new HashMap<>();
            map.put("a","aaa");
            map.put("b","bbb");
            map.put("c","ccc");
            listMap.add(map);
        }
        String jsonString = JSON.toJSONString(listMap, true);
        System.out.println(jsonString);

        List<Map<String, Object>> listMap1 = JSON.parseObject(jsonString, new TypeReference<List<Map<String, Object>>>() {
        });
        //System.out.println(listMap1);
        for (Map<String,Object> map:listMap1
             ) {
            System.out.println(map);
        }
    }

    @Test
    public void test3(){
        Map<String,Object> map = new HashMap<>();
        map.put("a","aaa");
        map.put("b","bbb");
        map.put("c","ccc");
        System.out.println(map);
    }

    @Test
    public void test4(){
        int i = Integer.parseInt("123456");
    }
}
