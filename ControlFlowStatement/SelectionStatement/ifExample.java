public class ifExample {
    public static void main(String[] args) {
        
        // int age = 12;
        // if(age >= 18){
        //     System.out.println("Eligible for voting");
        // }
        // else{
        //     System.out.println("Not eligible for voting");
        // }

        //Using Ternary
        // String result = (age >= 18) ? "Eligible for voting" : "Not eligible for voting";
        // System.out.println(result);





        //else if

        // int mark = 75;
        // if(mark >= 90){
        //     System.out.println("Grade A");
        // }
        // else if (mark >= 70) {
        //     System.out.println("Grade B");
        // }
        // else if(mark >= 50){
        //     System.out.println("Grade C");
        // }
        // else{
        //     System.out.println("Fail");
        // }

        //Using Ternary

        // String result = (mark >= 90) ? "Grade A"
        //                : (mark >= 70) ? "Grade B"
        //                : (mark >= 50) ? "Grade C" : "Fail";

        // System.out.println("result");               

        
        
        
        //Nested if else

        // int age = 22;
        // boolean hasLicense = true;
        // if(age >= 18){
        //     if(hasLicense){
        //         System.out.println("You can drive");
        //     }
        //     else{
        //         System.out.println("You need license");
        //     }
        // }
        // else{
        //     System.out.println("You are underage");
        // }
     



        // int yr = 2023;
        // if(yr%4==0){
        //     System.out.println("leap year");
        // }
        // else{
        //     System.out.println("not leap year");
        // }

        //Using Ternary
        int year = 2026;
        boolean isleap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isleap ? "Leap Year" : "Not Leap Year");




    }
}