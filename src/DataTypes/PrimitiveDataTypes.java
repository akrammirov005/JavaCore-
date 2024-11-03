package DataTypes;

public class PrimitiveDataTypes {
    public static void main(String[] args){
        //1. Boolean ->  True and False
        //True
        boolean  typeTrue = true; //call them literals
        //  False
        boolean typeFalse = false;
        System.out.println(typeTrue + " and " + typeFalse);

        //2.Integers
        //Byte -> consist of 1 byte
        byte maxByte = 127;
        byte minByte = -128;
        System.out.println(maxByte + " and  " + minByte);

        //Short ->short integer/number,consist of 2 bytes or 16 bites
        short maxShort = 32767;
        short minShort = -32_768;
        System.out.println(maxShort + " and  " + minShort);

        //Int -> the whole number which is consist of 4 bytes or 32 bites
        int maxInt = 2_147_483_647;
        int minInt =- 2_147_483_647;
        System.out.println(maxInt + " and " + minInt);

        //Long -> whole number, consist of 8 bytes or 64 bites
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9223372036854775808L;

        //3.Float
        //Double -> The float number consist of 8 bytes or 64 bites
        double  maxDouble  = 1.1234567891234567;
        double minDouble = - 1.1234567891234567;
        System.out.println(maxDouble + " and " + minDouble);

        //Float -> The float number consist of 4 bytes 32 bites
        float maxFloat = 1.1234567F;
        float minFloat = -1.1234567F;
        System.out.println(maxFloat + " and " + minFloat);

        //4.Character
        //Char -> character consist of 2 bytes or 16 bite;
        //only use ' ' in char
        char character = 'H';
        System.out.println(character);
        char charNumber = 70;
        System.out.println(charNumber);
        char newLine = '\n';
        System.out.print("a");
        System.out.print(newLine);
        System.out.print("b\n");
        char slash = '\\';
        System.out.println(slash);
    }
}
