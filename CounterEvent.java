public class CounterEvent {
    public static String removeDuplicate(String sNumber) {
        String sNewNumber = "";
        int length = sNumber.length();
        for (int i = 0; i < length; i++) {
            String sTmp = sNumber.substring(i, i+1);
            int index = sNewNumber.indexOf(sTmp);
            if (index < 0) {
                sNewNumber = sNewNumber.concat(sTmp);
            }
        }
        return sNewNumber;
    }

    public static int factorial(int n) {
        int fResult = 1;
        for (int i = 1; i <= n; i++) {
            fResult *= i;
        }
        return fResult;
    }

    public static int[] countEvenOddNumber(String sNumber) {
        int[] cResult = { 0, 0 };
        int length = sNumber.length();
        for (int i = 0; i < length; i++) {
            String sTmp = sNumber.substring(i, i+1);
            int tmp = Integer.parseInt(sTmp);
            if (tmp % 2 == 0) {
                cResult[0]++;
            } else {
                cResult[1]++;
            }
        }
        return cResult;
    }

    public static int countSumEven(int numOfNumber) {
        int cResult = 0;
        cResult = factorial(numOfNumber) / (2 * factorial(numOfNumber - 2));
        return cResult;
    }

    public static int countSumEvent4Number(int number) {
        int count = 0;
        String sNumber = String.valueOf(number);
        sNumber = removeDuplicate(sNumber);
        int[] counter = countEvenOddNumber(sNumber);
        count = countSumEven(counter[0]);
        count += countSumEven(counter[1]);
        return count;
    }

    public static void main(String args[]) {
        int count = 0;
        int number = 1325797;
        count = countSumEvent4Number(number);
        System.out.println("Number Of Event: " + count);
    }
}
