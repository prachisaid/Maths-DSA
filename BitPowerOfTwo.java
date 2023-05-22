public class BitPowerOfTwo {
    public static void main(String[] args) {
        int n  = 32;

        if((n & (n-1)) == 0){
            System.out.println("Power of 2");
        }else{
            System.out.println("Not power of 2");
        }
    }
}
