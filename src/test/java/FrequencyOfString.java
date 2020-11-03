import java.awt.*;

public class FrequencyOfString {
    public static void main(String[] args) {

        String str = "rarataal";
        String expectedResult = "";


        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;

            for (int j = 0; j< str.length(); j++) {

                if(str.charAt(i)== str.charAt(j)){
                    frequency++;

                }
            }
            expectedResult += str.charAt(i)+""+frequency;
           str= str.replace(""+str.charAt(i),"");

        }
        System.out.println(expectedResult);
    }

    }

