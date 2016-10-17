/**
 * Instructions:
 * You can run this file to check whether you have solved the problems correctly.
 * You MUST NOT MODIFY this file.
 *
 * Created by Yi Zhou on 2016/10/17.
 */

import java.lang.reflect.Method;

public class Validate {
    public static void main(String[] args) {
        try {
            Class sol;
            sol = Class.forName("Solution");

            char[] a = {'1', '2', '3'};
            char[] b = {'1', '2', '3'};
            char[] c = {'3', '2', '1'};
            char[] d = {};


            Method m = sol.getMethod("equals", new Class[]{char[].class, char[].class});
            if ((boolean) m.invoke(sol, a, b) && !(boolean) m.invoke(sol, a, c) && !(boolean) m.invoke(sol, a, d))
                System.out.println("You solved problem 1.");
            else
                System.out.println("Something wrong with problem 1.");

            Method m2 = sol.getMethod("climb", new Class[]{int.class});
            if((int)m2.invoke(sol,1)==1 && (int)m2.invoke(sol,2)==2 && (int) m2.invoke(sol,3)==3 && (int)m2.invoke(sol,10)==89)
                System.out.println("You solved problem 2.");
            else
                System.out.println("Something wrong with problem 2.");

        } catch (Exception e1) {
            System.out.println("Something wrong with your code.");
            e1.printStackTrace();
        }
    }
}
