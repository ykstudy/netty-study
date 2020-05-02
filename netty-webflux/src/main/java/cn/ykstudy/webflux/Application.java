package cn.ykstudy.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author james mu
 * @date 2019/12/10 17:16
 */
@SpringBootApplication(scanBasePackages = {"com.sanshengshui.webflux"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
