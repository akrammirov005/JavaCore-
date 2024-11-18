package Exceptions;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        //In case that we have different errors, and we want to show what kind of error do we have, we can use multiple catch
        int a = 6;
        int b = 0;
        int nums[] = new int[4];
        String str = null;

        try{
            b = 18 / a;
            System.out.println(nums[0]);
            //trying to get the  item which not exist
            System.out.println(nums[2]);
            System.out.println(str.length());
        }
        //ArrayIndexOutOfBoundsException can only except array-index problems
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }
        //ArithmeticException can only except arithmetics problems
        catch(ArithmeticException e){
            System.out.println("Can  not divide by zero");
        }
        //Exception block always should be in the end because it can except all errors
        catch (Exception e){
            System.out.println("The error : " + e);
        }

        System.out.println(b);
    }
}
