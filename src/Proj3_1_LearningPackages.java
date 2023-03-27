import java.util.*;
public class Proj3_1_LearningPackages {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int totalCost;
        int packagePrompt;
        int coursePrompt;
        int baseCost=0;
        int costPerCourse=0;
        int numIncluded = 0;
        System.out.println("Which package do you want?1 , 2 or 3");
        packagePrompt=sc.nextInt();
        System.out.println("How much courses did you enroll in?");
        coursePrompt=sc.nextInt();
        if (packagePrompt==1){
                baseCost=10;
                costPerCourse=6;
                numIncluded=4;
        }
        else if(packagePrompt==2){
            baseCost=12;
            costPerCourse=4;
            numIncluded=4;
        }
        else if(packagePrompt==3){
            baseCost=15;
            costPerCourse=3;
            numIncluded=6;
        }

        if (coursePrompt>numIncluded){
            totalCost=baseCost+(coursePrompt-numIncluded)*costPerCourse;
        }
        else {
            totalCost=baseCost;
        }
        System.out.println("Total cost is $"+totalCost);
    }
}
