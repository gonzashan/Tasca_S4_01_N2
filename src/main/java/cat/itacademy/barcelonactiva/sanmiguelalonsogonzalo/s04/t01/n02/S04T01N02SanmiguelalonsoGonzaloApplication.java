package cat.itacademy.barcelonactiva.sanmiguelalonsogonzalo.s04.t01.n02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S04T01N02SanmiguelalonsoGonzaloApplication {

    public static void main(String[] args) {
        SpringApplication.run(S04T01N02SanmiguelalonsoGonzaloApplication.class, args);
        System.out.println("The App is working...");
        System.out.println("- Click below to check them or open your browser and try - ");
        System.out.println("http://localhost:9001/HelloWorld?nom=Manolo");;
        System.out.println("http://localhost:9001/HelloWorld");
        System.out.println("http://localhost:9001/HelloWorld2/Macarena");
        System.out.println("http://localhost:9001/HelloWorld2");
    }

}
