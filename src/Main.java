public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 999999; i++) {
            String a = String.valueOf(i);
            if (a.length() == 1) {
                a = "00000" + a;
                if ((Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(a.charAt(2))) == Character.getNumericValue(a.charAt(3)) + Character.getNumericValue(a.charAt(4)) + Character.getNumericValue(a.charAt(5))) {
                    count++;
                }
            }
            if (a.length() == 2) {
                a = "0000" + a;
                if ((Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(a.charAt(2))) == Character.getNumericValue(a.charAt(3)) + Character.getNumericValue(a.charAt(4)) + Character.getNumericValue(a.charAt(5))) {
                    count++;
                }
            }
            if (a.length() == 3) {
                a = "000" + a;
                if ((Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(a.charAt(2))) == Character.getNumericValue(a.charAt(3)) + Character.getNumericValue(a.charAt(4)) + Character.getNumericValue(a.charAt(5))) {
                    count++;
                }
            }
            if (a.length() == 4) {
                a = "00" + a;
                if ((Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(a.charAt(2))) == Character.getNumericValue(a.charAt(3)) + Character.getNumericValue(a.charAt(4)) + Character.getNumericValue(a.charAt(5))) {
                    count++;
                }
            }
            if (a.length() == 5) {
                a = "0" + a;
                if ((Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(a.charAt(2))) == Character.getNumericValue(a.charAt(3)) + Character.getNumericValue(a.charAt(4)) + Character.getNumericValue(a.charAt(5))) {
                    count++;
                }
            }
            if (a.length() == 6) {
                a = "" + a;
                if ((Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(1)) + Character.getNumericValue(a.charAt(2))) == Character.getNumericValue(a.charAt(3)) + Character.getNumericValue(a.charAt(4)) + Character.getNumericValue(a.charAt(5))) {
                    count++;
                }
            }
        }
        System.out.println("Количество счастливых билетов = " + count);
    }
}