public class primitiveTypes {
    public static void main(String[] args) {
        boolean isPassed=true;
        int count=0;
        byte marks=12;
        short studentsCount=123;
        //need to use the keyword f to denote a float value
        float pi=3.14f;
        double secondPi=3.141592;

        char ch='a';
        System.out.println(secondPi);
        System.out.println(pi);

        //implicit type conversion can only happen from small bucket to a larger bucket

        //explicit type conversion
        long cnt=12;
        int newCnt=(int)cnt;
        char newChar='@';
        int convertedChar=(int)newChar;
        System.out.println(convertedChar);

    }
}
