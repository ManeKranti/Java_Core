public class VariableAndDatatype{

    public static void main(String[] args) {
        // bit
        byte a = 1;  
        short b = 2;
        int c = 10;
        long d = 1001;
        boolean f = true;
        double s = 13.4;
        char w = 'C';
        float q = 12.5f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(s);
        System.out.println(w);
        System.out.println(q);

        //  Arithmatic operator
        
        int num1 = 20;
        int num2 = 5;

        System.out.println(num1 + num2);
         System.out.println(num1 - num2);
          System.out.println(num1 * num2);
         System.out.println(num1 / num2);
          System.out.println(num1 % num2);

          // Used to basic mathematic calculation on premitive datatype
          // Relational Operator [< , > , <= , >= , == , !=] it always return boolean value either true or false
          
           System.out.println("num1 > num2"); //true
           System.out.println(num1 < num2); //false

           num2 = 20;

           System.out.println(num1 >= num2); //true
           System.out.println(num1 <= num2); //true
           System.out.println(num1 != num2); //false

           //Logical Operator [&& , || , !]


           //num++; // post increment
           //++num; // pre increment
           
           int num = 7;

           int result = ++num;
           System.out.println(result); //First fatch the value then increment

           int n = 10, res;
           res = n++ + n++ + ++n;
           System.out.println("res");
          
              

    }
}                             