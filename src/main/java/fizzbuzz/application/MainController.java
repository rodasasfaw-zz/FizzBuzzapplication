package fizzbuzz.application;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import java.util.Scanner;
@RestController
public class MainController {

    @RequestMapping("/")
    public String showIndex() {
        int i;
        String numberasstring ="";

        for (i = 1; i <= 90; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
            numberasstring = String.valueOf(i);


        }

        return numberasstring;
    }
}
