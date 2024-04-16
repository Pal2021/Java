package DateAndTime;

import java.time.LocalDate;
import java.util.Scanner;
public class Calander {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        LocalDate d=LocalDate.of(x,y,6);
        int v=d.getDayOfWeek().getValue();

        System.out.println("\tMon\tTue\tWed\tthur\tFri\tSat\tSun");
        for(int i=1;i<=d.lengthOfMonth();i++){
            System.out.println(i);
            v++;
            if((v-1)%7==0){
                System.out.println();
            }
        }
     }
}
