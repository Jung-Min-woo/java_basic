class OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int) (pi * 1000 + 0.5) / 1000.0; // Round pi to fourth deicmal places
        double shortPi2 = Math.round(pi * 1000) / 1000; // Math.round(pi * 1000) / 1000 = (long) / (int) = (long) -->
                                                        // `double
        double shortPi3 = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);
        System.out.println(shortPi2);
        System.out.println(shortPi3);
        // 3.142
        // 3.0
        // 3.142
    }
}