package schoolTests;


public class Hiker {

    public static int isNumberInRange(int start, int end, int number) {
        if(number>start & number <end) {
            return 0;
        } else if(number>end & number<start) {
            return 1;
        }
        return -1;
    }

}

