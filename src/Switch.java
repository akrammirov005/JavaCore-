public class Switch {
    public static void main(String[] args){
        int dayOfWeeks = 2;

        //The switch case constructor

        switch(dayOfWeeks){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Other day of week");
                break;
        }

        //new version of switch
        //now we can use not only INT but also STRING;
        //also we can specifies  value
        //we can also return value ->  result = switch(nameWork){ case "Hello" -> return "Hii"};

        String nameWeek = "Wednesday";
        String result = "";

       switch (nameWeek){
            case "Monday","Tuesday" -> System.out.println("8 p.m.");
            case "Wednesday" -> result = "New value";
            case "Friday" -> System.out.println("9 p.m.");
            case "Saturday","Sunday" -> System.out.println("10 p.m.");
        }

        System.out.println(result);


    }
}
