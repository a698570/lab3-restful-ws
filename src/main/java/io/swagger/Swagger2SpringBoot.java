package io.swagger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import io.swagger.model.AddressBook;
import io.swagger.model.Person;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "io.swagger", "io.swagger.api" , "io.swagger.configuration"})
public class Swagger2SpringBoot implements CommandLineRunner {

    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) throws Exception {
        AddressBook ab = new AddressBook();

        // Some dummy data
        Person salvador = new Person();
        salvador.setName("Salvador");
        salvador.setId(ab.nextId());
        Person juan = new Person();
        juan.setName("Juan");
        juan.setId(ab.nextId());
        ab.getPersonList().add(salvador);
        ab.getPersonList().add(juan);

        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }
}
