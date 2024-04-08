package loki.project;
import java.util.logging.Logger;
public class MyBigNumber {
    public static Logger logger = Logger.getLogger("sumBigNumLogger");
    public static String sum(String stn1, String stn2)
    {
        String n1 = stn1;
        String n2 = stn2;
        //input length balancing
        while (n1.length()<n2.length()) {
            n1 = '0' + n1;
        }
        while (n2.length()<n1.length()) {
            n2 = '0' + n2;
        }

        //sum
        String output = "";
        int carry = 0;
        for (int i=n1.length()-1; i>=0; i--) {
            int c1 = (int) (n1.charAt(i) - '0');
            int c2 = (int) (n2.charAt(i) - '0');
            int s = c1 + c2 + carry;
            output = (char) (s % 10 + '0') + output;
            carry = s / 10;
        }
        if (carry != 0)
        {
            output = (char) (carry + '0') + output;
        }

        //normalize
        int notZeroIndex = 0;
        while (notZeroIndex < output.length()-1 && output.charAt(notZeroIndex) == '0') {
            notZeroIndex++;
        }
        output = output.substring(notZeroIndex);

        //logging
        String log = stn1 + " + " + stn2 + " = " + output;
        logger.info(log);

        return output;
    }
}
