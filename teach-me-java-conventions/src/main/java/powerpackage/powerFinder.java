
    public class powerFinder {
        public static int findPower(int base, int power) {
            int result = 1;
            for (int i = 0; i<power; i++) {
                result *= base;
            }
            return result;
        }
    }

