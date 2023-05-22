public class FindIthBit {
    public static void main(String[] args) {
        int n = 10, k = 2;
        int mask = ((n & (1 << (2-1))) >> (2-1)); // << for finding it // >> for getting the value 

        mask = ((1 << k) | n);

        double a = Math.log(2) / Math.log(2);
        System.out.println((int) a + 1);

        mask = (~(1 << k)); 

        System.out.println(mask);
    }
}
