package com.example.demo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author manoj.bardhan
 *
 */
    @Controller
    @EnableAutoConfiguration
    public class HelloWorldController
    {
        @RequestMapping("/hello")
        @ResponseBody
        public String sayHello()
        {
            return ".   ____          _            __ _ _\n" +
                    " /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\\n" +
                    "( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\\n" +
                    " \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )\n" +
                    "  '  |____| .__|_| |_|_| |_\\__, | / / / /\n" +
                    " =========|_|==============|___/=/_/_/_/";
        }
    }