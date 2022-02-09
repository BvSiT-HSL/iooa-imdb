package nl.hsleiden;

import java.util.InputMismatchException;
import java.util.Scanner;

//https://stackoverflow.com/questions/61537142/how-to-loop-a-user-input-until-integer-is-entered
//TODO Better use Reader directly in stead of Scanner?
//TODO Rename since System.in does not read necessarily from console?

public class ConsoleReader {
    private static String PROMPT="Type a whole number:";
    private static String PROMPT_BETWEEN="Type a whole number between %d and %d" ;

    public int read(){
        return read(null,null);
    }

    public int read(Integer  min,Integer max){
        boolean limitRange = (min!=null && max !=null);
        Scanner scanner = new Scanner(System.in);
        int x;
        while (true){
            try{
                System.out.println( limitRange ? String.format(PROMPT_BETWEEN, min,max)
                        : String.format(PROMPT));
                //TODO When string with spaces avoid multiple prompts
                x = scanner.nextInt();
                if (limitRange && (x<min || x > max) ) continue;
                break;
            }
            catch (InputMismatchException e){
                scanner.next();//Move read position past delimiter after last read token
            }
        }
        //scanner.close(); // This could throw NoSuchElementException?? See also https://stackoverflow.com/questions/33555283/why-is-not-possible-to-reopen-a-closed-standard-stream
        return x;
    }
}
