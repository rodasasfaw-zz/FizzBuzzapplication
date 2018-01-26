package fizzbuzz.application;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
@RestController
public class MainController {

@RequestMapping("/")
    public String show() {
        System.out.println("input the ending number here: ");

        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        
        String message="";
        for(int i=1; i<=x;i++) {
            if(i%5==0&&i%3==0)
                message= message + "FizzBuzz<br/>";

            else if(i%3==0)
                message= message + "Fizz<br/>";
            else if(i%5==0)
                message= message + "Buzz<br/>";

            /*else if(i%7==0)
                count_7++;

            else if(i%17==0)
                count_17++;
            else if(i%23==0)
                count_23++;

    */

            else
                message= message + Integer.toString(i)+"<br/>";


       }
       /*
        System.out.println("the number of mulfiple of 7 is:"+count_7);
        System.out.println("the number of mulfiple of 17 is:"+count_17);
        System.out.println("the number of mulfiple of 23 is:"+count_23);
*/
return message;
    }



}

