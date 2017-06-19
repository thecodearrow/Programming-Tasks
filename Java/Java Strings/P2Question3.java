
package week6;

import java.util.*;

/**
 *
 * @author Prashanth 
 * TITLE: To perform the given operations on two given
 * Classes: class StringOpClass, public class P2Question3 
 * Methods: void operation1(String, String),  void operation2(String, String)
 *          void operation3(String, String ), void operation4(String, String)
 *          void operation5(String, String), 
 *          ArrayList modifyStrings(String, String )
 * 
 * Variables: StringBuffer s1_buff,s2_buff
 *            String str1,str2,s1,s2,s2_firstHald,s2_secondHalf;
 *            String output1,output2,output3,output4,output5
 *            Boolean b, ArrayList<String> list
 *
 * 
 * Doubts: Operation 1 
 *         Non static from a non static
 */


class StringOpClass {

    static ArrayList<String> list = new ArrayList<String>();

    /*stores the outputs as an
                                                      ArrayList*/
   void operation1(String s1, String s2) {
        StringBuffer s1_buff = new StringBuffer(s1);
        String output1;

        for (int i = 0; i <= s1.length(); i += 2) {

            s1_buff.deleteCharAt(i);

            s1_buff.insert(i, s2);

            i++; //since the string in s2 is 2 characters long 

        }

        output1 = new String(s1_buff);
        list.add(output1);
    }

void operation2(String s1, String s2) {
        StringBuffer s1_buff = new StringBuffer(s1);
        StringBuffer s2_buff = new StringBuffer(s2);
        String output2;
        //to check if s2 is present in s1 more than once
        Boolean b;
        if(s1.indexOf(s2)!=s1.lastIndexOf(s2))
             b=true;
        else
            b=false;

        if (b == true) {
            int lastIndex = s1.lastIndexOf(s2);
            String s2_rev = s2_buff.reverse().toString();
            output2 = (s1_buff.replace(lastIndex, lastIndex + 1,
                    s2_rev)).toString();
            output2 = s1_buff.delete(lastIndex + 2, lastIndex + 3).toString();
            /*since s2 is of two characters, additional characters need to  
              be deleted */

        } else {
            output2 = s1 + s2;
        }
        list.add(output2);

    }

    void operation3(String s1, String s2) {
        StringBuffer s1_buff = new StringBuffer(s1);
        StringBuffer s2_buff = new StringBuffer(s2);
        String output3;
        //to check if s2 is present in s1 more than once
        Boolean b;
        if(s1.indexOf(s2)!=s1.lastIndexOf(s2))
             b=true;
        else
            b=false;

        if (b == true) {
            int firstIndex = s1.indexOf(s2);

            output3 = (s1_buff.delete(firstIndex, firstIndex + s2.length())).toString();

        } else {
            output3 = s1;
        }
        list.add(output3);

    }

  void operation4(String s1, String s2) {

        int n = s2.length();
        String output4;
         String s2_firstHalf,s2_secondHalf;
        if(s2.length()%2==0){
         s2_firstHalf = s2.substring(0, n / 2);
         s2_secondHalf = s2.substring(n / 2, n);
        }
        else
        {
        s2_firstHalf = s2.substring(0, (n / 2)+1);
        s2_secondHalf = s2.substring((n / 2)+1, n);
        }
        StringBuffer s1_buff = new StringBuffer(s1);
        output4 = s1_buff.insert(0, s2_firstHalf).toString();
        output4 = s1_buff.append(s2_secondHalf).toString();
        list.add(output4);
    }

  void operation5(String s1, String s2) {
        String output5;
        char[] ch = s2.toCharArray();
        for (char i : ch) {
            int index = s1.indexOf(i);
            if (index != -1) {
                //if present
                s1 = s1.replace(s1.charAt(index), '*');

            }
        }
        output5 = s1;
        list.add(output5);

    }

    ArrayList modifyStrings(String s1, String s2) {

        //Performs the required operations
        operation1(s1, s2);
        operation2(s1, s2);

        operation3(s1, s2);

        operation4(s1, s2);
        operation5(s1, s2);
       
        return (list);  //returns the ArrayList containing the outputs
    }
}

public class P2Question3 {

    public static void main(String[] args) {

        StringOpClass s = new StringOpClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println("Output: " + s.modifyStrings(str1, str2));

    }
}
