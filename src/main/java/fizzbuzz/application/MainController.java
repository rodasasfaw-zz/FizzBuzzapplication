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

        String message = "";
        for (int i = 1; i <= Ending_num; i++) {
            if (i % 5 == 0 && i % 3 == 0)
                message = message + "FizzBuzz<br/>";

            else if (i % 3 == 0)
                message = message + "Fizz<br/>";
            else if (i % 5 == 0)
                message = message + "Buzz<br/>";

            else
                message = message + Integer.toString(i) + "<br/>";

        }

        return message + number_of_multiples(Ending_num);
    }

    public String number_of_multiples(int n) {
        int counter_1 = 0;
        int counter_2 = 0;
        int counter_3 = 0;
        String last_message = "";
        for (int x= 1; x <= n; x++) {
            if(x%7 == 0)
                counter_1++;
             else if(x%17 == 0)
                counter_2++;
             else if(x%23==0)
                counter_3++;
        }

       return last_message = "Multiple of 7 is:" + Integer.toString(counter_1)+"<br/>Multiple of 17 is:" + Integer.toString(counter_2)+"<br/>Multiple of 23 is:" + Integer.toString(counter_3);


    }
}
