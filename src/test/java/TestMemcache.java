import com.whalin.MemCached.MemCachedClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 *
 * @Description
 * @Author 况博凯
 * @Date 2021/03/10 22:14
 * @Version 1.0
 *
 */


// 让测试运行于spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)
// 指定 Spring 配置文件所在的位置
@ContextConfiguration(locations = "classpath:memcached.xml")
public class TestMemcache {


    @Resource(name = "memcachedClient")
    MemCachedClient memCachedClient;

    @Test
    public void test1(){
         //插入方法有三种
        //1.set方法，如果key值已存在则直接覆盖重写。
        memCachedClient.set("name",11);
        memCachedClient.set("name",22);
        System.out.println("测试结果:"+memCachedClient.get("name"));
    }

    @Test
    public void test2(){
        //2.add方法,这种方式只会添加，如果key已存在则返回false，添加不成功
        memCachedClient.add("name",11);

        System.out.println("测试结果:"+ memCachedClient.add("name",33));

    }

    @Test
    public void test3(){
        memCachedClient.add("name","ss");
        //3把key对应的value替换
        memCachedClient.replace("name","22");
        System.out.println("测试结果:"+memCachedClient.get("name"));
    }

    @Test
    public void test4(){
        memCachedClient.set("name","ss");
        System.out.println("测试结果:"+memCachedClient.get("name"));
        memCachedClient.delete("name");
        System.out.println("测试结果:"+memCachedClient.get("name"));
    }

}
