package com.dudu;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dudu.domain.Data;
import com.dudu.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() throws IllegalAccessException {
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setId(9527);
        user1.setUserName("张三");
        user1.setPassWord("880921");
        userList.add(user1);

        User user2 = new User("李四","123456",1314);
        userList.add(user2);
        List<List<Object>> data = new ArrayList<>();

//        for (int i = 0; i <userList.size() ; i++) {
//            List<Object> list = new ArrayList<>();
//            list.add(userList.get(i).getUserName());
//            list.add(userList.get(i).getPassWord());
//            list.add(userList.get(i).getId());
//            data.add(list);
//        }

//        for (User user:
//             userList) {
//            List<Object> list = new ArrayList<>();
//            list.add(user.getUserName());
//            list.add(user.getPassWord());
//            list.add(user.getId());
//            data.add(list);
//        }

        for (User user:
             userList) {
            List<Object> list = new ArrayList<>(1);
            for (Field field:
            user.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                list.add(field.get(user));
            }
            data.add(list);
        }
        System.out.println("数据数据大数据!!!"+data);






//        for (Field f:
//             user1.getClass().getDeclaredFields()) {
//            f.setAccessible(true);
//            String classType = f.getType().toString();
//            int lastIndex = classType.lastIndexOf(".");
//            classType = classType.substring(lastIndex+1);
//            try {
//                System.out.println("fieldName：" + f.getName() + ",type:"
//                        + classType + ",value:" + f.get(user1));
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//        System.out.println("datadata!!!!!"+data);
//
//        List<String> tableHeadList = new ArrayList<>();
//        tableHeadList.add("账号");
//        tableHeadList.add("密码");
//        tableHeadList.add("id");
//
//        Data bigData = new Data();
//
//        bigData.setTableData(data);
//        bigData.setTableHead(tableHeadList);
//
//        System.out.println(bigData);
//        String string = JSON.toJSONString(bigData);
//        System.out.println(string);


//        for (int i = 0; i <= 7; i++) {  // 外层循环控制行数
//            for (int j = 1; j <= i; j++) { // 内层循环打印 *
//
//                System.out.print("*");  // 注意不是 println
//            }
//
//            System.out.print("\n"); //换行
//        }

    }

}
