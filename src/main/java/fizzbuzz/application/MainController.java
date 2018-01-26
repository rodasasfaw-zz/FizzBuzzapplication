package fizzbuzz.application;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
@RestController
public class MainController {

@RequestMapping("/")
    public String show() {
        System.out.println("input the ending number here: ");

        Scanner keyboard = new Scanner(System.in);
        int Ending_num = keyboard.nextInt();

        String message="";
        for(int i=1; i<=Ending_num;i++) {
            if(i%5==0&&i%3==0)
                message= message + "FizzBuzz<br/>";

            else if(i%3==0)
                message= message + "Fizz<br/>";
            else if(i%5==0)
                message= message + "Buzz<br/>";

            else
                message= message + Integer.toString(i)+"<br/>";

       }

return message;
    }



}

