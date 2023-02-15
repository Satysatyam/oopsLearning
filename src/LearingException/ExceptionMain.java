package LearingException;

public class ExceptionMain{
    public static int divide(int a,int b) throws DivideByZeroException{
        if(b==0){
/*
            throw new DivideByZeroException();
            this is giving error because this we created an exception  is a checked exception
            now system of compiler will expect from you to decide what should be the step once's that exception is accrued
*/
            //what should be the step you should call on
            //1.Handel the Exception or you can
            //2.Pass the Exception(Pass to whom :- Pass to who so over call this f^n )
            throw new DivideByZeroException();
        }
        return a/b;
    }
    public static void main(String[] args) throws DivideByZeroException {

        divide(10,0);
    }
}
