public class Conditions {
    public static void main(String[] args){
        int x = 5;
        int y = 5;

        if(x > y){
            System.out.println(" x is greater than y ");
        } else if(x == y){   //used to add condition
            System.out.println(" x is equal to y ");
        }else{
            System.out.println(" x is les than y");
        }

        /* ------------------Boolean logic-----------------*/
        //&&(and)
        //true && true -> true;
        //true && false -> false;
        //false && false -> false;

        boolean isBoughtMilk = true;
        boolean isBoughtBread = true;
        //boolean isBoughtMilkAndBread = isBoughtMilk && isBoughtBread;

        if (isBoughtMilk && isBoughtBread){
            System.out.println("I bought milk and bread");
        }else if(isBoughtMilk){
            System.out.println("I bought only milk");
        }else if(isBoughtBread){
            System.out.println("I bought only bread");
        }else{
            System.out.println("I did not buy anything");
        }

        // ||(or)
        //true || true -> true;
        //true || false -> true;
        //false || false -> false
        //boolean isBoughtMilkOrBread = isBoughtMilk || isBoughtBread;

        if (isBoughtMilk || isBoughtBread){
            System.out.println("Bought one of them");
        }else{
            System.out.println("Bought none of them");
        }

        // !(not)
        //!true -> false;
        //!false -> true;

        boolean isBoughtCandy = false;

        if(!isBoughtCandy){
            System.out.println("praising myself that i saved money");
        }

        /*------------------------Ternary Operator---------------------------*/
        //The brief type of if and else condition
        //Ternary operator
        //Example #1
        int money = 100;
        int breadPrice = 50;
        int moneyAfterShopping = money - breadPrice;
        int childMoney = moneyAfterShopping >= 50 ? 10 : 5;
        moneyAfterShopping -= moneyAfterShopping >= 50 ? 10 : 5;
        System.out.println(childMoney);
        System.out.println(moneyAfterShopping);

        //Example #2
        int n = 4;
        int result = 0;
        result = n%2 == 0 ? 10 : 20;
        System.out.println(result);



        //Condition without curly brackets;
        //We can also use it like this but not recommended;

        int a  = 20;
        if(a < 10)
            System.out.println("Hello Y");
        else if(a > 10)
            System.out.println("Y");
        else
            System.out.println("Bye y");
    }
}
