public class Method {
        // Method without return type
        // public void greet(){
        //     System.out.println("Good Morning");
        // }

        // public static void main(String() args){
        //     Method obj = new Method();
        //     obj.greet();
        // }


        //Method without parameter with return type
        // public int number(){
        //     int a = 10;
        //     int b = 20;
        //     int result = a + b;
        //     return result;
        // }
        // public static void main(String[] args) {
        //     Method obj = new Method();
        //     System.out.println(obj.number);
        // }
     
        
        
        //Static method
        // public static int number(){
        //     return 50; 
        // }    
        // public static void main(String[] args) {
        //     // System.out.println(number());
        //     System.out.println(Method.number());
        // }


        // public int number{                                            
        // void fun(int n){
        //     if(n>0){
        //         System.out.println(n);
        //         fun(n-1);
        //     }
        // }
        // public static void main(String[] args) {
        //     Method obj = new Method();
        //     obj.display();
        //     System.out.println(obj.number);
        //     obj.greet();
        //     obj.fun(5);
        // }

        // 




        // Factorial Number
            public static int number(int num){
                if(num==0) return 1;
                int result = num * number(num-1);
                return  result;
            }
            public static void main(String[] args) {
                System.out.println(Method.number(5));
            }

}























           
              
}        


















