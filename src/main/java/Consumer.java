import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DemoService;

import java.io.IOException;

public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("dubbo服务消费端已启动...");
        DemoService demoService = (DemoService) context.getBean("demoService");// 获取远程服务代理
        String hello = demoService.sayHello("world");//执行远程方法
        System.out.println(hello);//显示调用结果
        System.in.read(); // 按任意键退出
    }
}

