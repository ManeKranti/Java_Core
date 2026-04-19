class test{
    int marks;
}

public class CallByReference {
    public static void changeMarks(test s){
        s.marks = 90;
    }
    public static void main(String[] args) {
        test t = new test();
         
        t.marks = 80;
        changeMarks(t);
        System.out.println(t.marks);
    }
}
