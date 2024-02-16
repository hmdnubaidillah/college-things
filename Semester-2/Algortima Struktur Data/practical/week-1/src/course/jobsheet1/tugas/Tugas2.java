package src.course.jobsheet1.tugas;

import java.util.*;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Speed");
        System.out.println("2. Time");
        System.out.println("3. Distance");
        System.out.println("0. Exit");

        System.out.print("Choose formula : ");
        String input = sc.nextLine();

        float distance, time, velocity;

        if (input.equalsIgnoreCase("0")) {
            System.out.println("Good Bye");
            return;
        }

        if (input.equalsIgnoreCase("1")) {

            System.out.print("Enter distance : ");
            distance = sc.nextFloat();

            System.out.print("Enter time : ");
            time = sc.nextFloat();

            float res = Speed(distance, time);
            System.out.printf("Speed => distance %f / time %f = %f\n", distance, time, res);
            return;
        }

        if (input.equalsIgnoreCase("2")) {

            System.out.print("Enter distance : ");
            distance = sc.nextFloat();

            System.out.print("Enter velocity : ");
            velocity = sc.nextFloat();

            float res = Time(distance, velocity);
            System.out.printf("Time => distance %f / velocity %f = %f\n", distance, velocity, res);
            return;
        }

        if (input.equalsIgnoreCase("3")) {

            System.out.print("Enter velocity : ");
            velocity = sc.nextFloat();

            System.out.print("Enter time : ");
            time = sc.nextFloat();

            float res = Distance(velocity, time);
            System.out.printf("Speed => velocity %f / time %f = %f\n", velocity, time, res);
            return;
        }

        if (Integer.parseInt(input) > 3) {
            System.out.println("Invalid input");
            return;
        }
    }

    /*
     * s = displacement
     * t = time
     * v = velocity
     * 
     */

    static float Speed(float s, float t) {
        return s / t;
    }

    static float Time(float s, float v) {
        return s / v;
    }

    static float Distance(float v, float t) {
        return v * t;
    }
}
