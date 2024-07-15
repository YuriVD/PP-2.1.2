import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld leaf = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean ==  leaf);


        Cat catBean = applicationContext.getBean("catBean", Cat.class);

        Cat catBean1 = applicationContext.getBean("catBean", Cat.class);
        System.out.println(catBean ==  catBean1);
    }
}