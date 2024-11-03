import java.util.Arrays;
import java.util.Locale;

public class TypeString {
    public static void main(String[] args) {
        //String text = "Hello";
        //String text2 = "Hello";

        String text = new String("Hello");
        String text2 = new String("Hello");

        System.out.println(text.equals(text2));

        /*--------------------String Methods ------------------------*/
        String textContent  = "HelloWorld";

        //Uppercase -> make all letters Capital;
        String textUpper = textContent.toUpperCase();
        System.out.println(textUpper);

        //Lowercase -> make all letters low;
        String lowText = textContent.toLowerCase();
        System.out.println(lowText);

        //length -> checks the length of our text;
        int textLength = textContent.length();
        System.out.println(textLength);


        //Contains -> checks out the text that you right in it;
        boolean containHello = textContent.contains("Hello");
        System.out.println(containHello);

        //ReplaceAll -> will replace the symbol to new one;
        String replacedText = textContent.replaceAll("l","a");
        System.out.println(replacedText);

        //repeat -> will repeat text specific times;
        String textRepeat = textContent.repeat(10);
        System.out.println(textRepeat);

        //split -> will return the array of strings;
        String names = "Amir,Tohir,Faridun";
        String[] arrayNames = names.split(",");
        System.out.println(Arrays.toString(arrayNames));

        //concatenation -> will bond two string;
         String str1 = "Hello";
         String str2 = "World";
         String result = str1 + str2;
         System.out.println(result);

         //StartsWith -> return showed title;
        boolean startWith = textContent.startsWith("Hel");
        System.out.println(startWith);

        //EndWith -> return the end of out text
        boolean endWith = textContent.endsWith("orld");
        System.out.println(endWith);

        //substring -> return the substring of shown amount;
        String firstFiveLetters = textContent.substring(0,5);
        System.out.println(firstFiveLetters);


        /*------------------------The Task---------------------------*/
        String name = "My name is Mirov Akram";
        String getElevenLetters = name.substring(11).toLowerCase();
        String[] arrayString = getElevenLetters.split(" ");
        System.out.println(Arrays.toString(arrayString));

        for (String word: arrayString){
            System.out.println("name : " + word);
            System.out.println("length : " + word.length());
        }

        /*------------------------String.format---------------------------*/

        String userName = "Mirov Akram";
        int age = 18;

        //String phrase = "My name is " + userName + " . My age is " + age;
        String phrase = String.format("My name is %s  . My age is %d .",userName,age);
        System.out.println(phrase);

        System.out.printf("My name is %s  . My age is %d .",userName,age);

        /*------------------------Text Block---------------------------*/
        //String item = "\nThis item is top 1 \n You should buy it \n That is all";
        int topNumber = 1;
        String item = """
                This item is top %d.
                You should buy it,
                That is all.
                """.formatted(topNumber);

        System.out.println(item);



    }
}
