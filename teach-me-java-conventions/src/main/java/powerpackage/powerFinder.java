
    public class powerFinder {
        public static int findPower(int base, int power) {
            int result = 1;
            for (int index = 0; index<power; index++) {
                result *= base;
            }
            return result;
        }
    }

