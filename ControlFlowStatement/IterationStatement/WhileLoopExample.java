public class WhileLoopExample {
    public static void main(String[] args) {
        // int sec = 10;
        // while(sec > 0)
        // {
        //     System.out.println("Time left :"+sec + "s");
        //     sec--;
        // }


        int i = 1;
        while (i<=3)
        {
            System.out.println("hello" +i);
            int j = 1;
            while(j<=3)
            {
                System.out.println("student" +j);
                j++;
            }
            i++;
        }
    }
}
