
public class Bits {

    // Get bit at position 'pos'
    public static int getBit(int n, int pos) {
        return (n >> pos) & 1;
    }

    // Set bit at position 'pos'
    public static int setBit(int n, int pos) {
        return n | (1 << pos);
    }

    // Clear bit at position 'pos'
    public static int clearBit(int n, int pos) {
        return n & ~(1 << pos);
    }

    // Update bit at position 'pos' to 'value' (0 or 1)
    public static int updateBit(int n, int pos, int value) {
        n = clearBit(n, pos);                // Clear the bit first
        return n | (value << pos);           // Set it to the new value
    }

    public static void main(String[] args) {
        int number = 29;  // Binary: 11101

        System.out.println("Original number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");

        int pos = 3;

        System.out.println("Get bit at pos " + pos + ": " + getBit(number, pos));
        System.out.println("Set bit at pos " + pos + ": " + setBit(number, pos));
        System.out.println("Clear bit at pos " + pos + ": " + clearBit(number, pos));
        System.out.println("Update bit at pos " + pos + " to 0: " + updateBit(number, pos, 0));
        System.out.println("Update bit at pos " + pos + " to 1: " + updateBit(number, pos, 1));
    }
}
