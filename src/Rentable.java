package src;

interface Rentable {
    static final int MAX_RENTAL_DAYS = 14;

    static double calculateLateFee(int daysLate) {
        return daysLate * 0.50;
    }

    boolean isAvailable();
    boolean rent();
    void returnItem();
}
