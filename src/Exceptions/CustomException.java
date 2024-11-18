package Exceptions;

//Creating our own Exception by inheriting Exception Class
class CanNotDivide extends Exception{
    public CanNotDivide(String str){
        super(str);
    }
}


public class CustomException {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try{
            b = 18 / a;
            if(b == 0){
                //throwing our own exception
                throw new CanNotDivide("You can not divide by 0");
            }
        }catch (CanNotDivide e){
            System.out.println("Custom Exception : " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception : " + e);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(b);
    }
}
