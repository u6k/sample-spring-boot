
package jp.gr.java_conf.u6k.sample_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class App {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello, sample-spring-boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
