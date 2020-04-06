package com.codes.login;

import com.codes.BaseTest;
import com.codes.dao.login.model.Login;
import com.codes.service.login.LoginService;
import com.codes.dao.login.req.LoginReq;
import com.mysql.cj.xdevapi.JsonArray;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 测试用例
 * @author
 * @date 2020/02/26 16:54
 */
public class LoginServiceTest extends BaseTest {

    @Autowired
    private LoginService loginService;

    /**
     * 根据ID查询
     * @author
     * @date 2020/02/26 16:54
     */
    @Test
    public void findByIdTest() {
        Login login = loginService.findById("wcp");
        print(login);
    }

    /**
     * 根据ID集合查询
     * @author
     * @date 2020/02/26 16:54
     */
    @Test
    public void findByIdsTest() {
        print("根据ID集合查询测试通过");
    }
    /**
     * 根据ID删除
     * @author
     * @date 2020/02/26 16:54
     */
    @Test
    public void deleteByIdTest() {
        print("根据ID删除测试通过");
    }

    /**
     * 根据ID集删除
     * @author
     * @date 2020/02/26 16:54
     */
    @Test
    public void deleteByIdsTest() {
//        loginService.deleteByIds(Arrays.asList(1, 2));
//        print("根据ID集删除测试通过");
    }

    /**
     * 根据ID修改
     * @author
     * @date 2020/02/26 16:54
     */
    @Test
    public void updateById() {
        print("根据ID修改测试通过");
    }


    @Test
    public void showAnalysis() {
        String[] arguments = new String[] {"python","C:\\Users\\Administrator\\PycharmProjects\\gupiao2\\truemethods\\apriorijj.py","300059","wcp","东方财富","0.2","0.2","update","143","memo"};
//        String[] arguments = new String[] {"python", "C:\\Users\\Administrator\\PycharmProjects\\gupiao2\\helloworld.py","2"};
        try {
            Process process = Runtime.getRuntime().exec(arguments);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
            //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
            int re = process.waitFor();
            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void showK() {
        String kaddr = "300059";
        String knum = "300059";
        String[] arguments = new String[] {"python","C:\\Users\\Administrator\\PycharmProjects\\gupiao2\\truemethods\\gupiaoK.py",kaddr,knum+".csv"};
//        String[] arguments = new String[] {"python", "C:\\Users\\Administrator\\PycharmProjects\\gupiao2\\helloworld.py","2"};
        System.out.println(kaddr+knum);
        try {
            Process process = Runtime.getRuntime().exec(arguments);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            String line = null;
//            while ((line = in.readLine()) != null) {
//                System.out.println(line);
//            }
            in.close();
            //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
            //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
            int re = process.waitFor();
            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
