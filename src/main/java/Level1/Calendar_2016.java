package Level1;

import java.util.Scanner;

public class Calendar_2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        System.out.println(solution(N, M));
    }

    public static String solution(int a, int b) {
        String answer = "";
        int[] calendar= {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dataA=1;
        int divisior=1;
        while(true) {
            if (dataA == a) {
                if (b % 7 == divisior) {
                    answer = "FRI";
                } else if (b % 7 - 1 == divisior || b % 7 + 6 == divisior) {
                    answer = "SAT";
                } else if (b % 7 - 2 == divisior || b % 7 + 5 == divisior) {
                    answer = "SUN";
                } else if (b % 7 - 3 == divisior || b % 7 + 4 == divisior) {
                    answer = "MON";
                } else if (b % 7 - 4 == divisior || b % 7 + 3 == divisior) {
                    answer = "TUE";
                } else if (b % 7 - 5 == divisior || b % 7 + 2 == divisior) {
                    answer = "WED";
                } else if (b % 7 - 6 == divisior || b % 7 + 1 == divisior) {
                    answer = "THU";
                }
                break;
            } else {
                divisior = (divisior+28-calendar[dataA - 1]) % 7;
                if(divisior<0){
                    divisior=divisior+7;
                }
                dataA++;
            }

        }
        return answer;
    }
}