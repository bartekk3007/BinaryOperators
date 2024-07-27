public class Main
{
    public static void main(String[] args)
    {
        int n = 31;
        int fourthBitFromRight = (n & (1 << 3)) >> 3;
        System.out.println(fourthBitFromRight);

        int leftNumber = 0b0000_1111_0000_0000_0000_0000_0000_0000;
        System.out.println(Integer.toBinaryString(leftNumber << 4));

        int rightNumber = 0b0000_0000_0000_0000_0000_0000_1111_0000;
        System.out.println(Integer.toBinaryString(rightNumber >> 5));
        System.out.println(Integer.toBinaryString(rightNumber >>> 5));

        int negativeNumber = 0b1100_0000_0000_0000_0000_0000_1111_0000;
        System.out.println(Integer.toBinaryString(negativeNumber >> 4));
        System.out.println(Integer.toBinaryString(negativeNumber >>> 4));
        //System.out.println(negativeNumber >>> 5);
    }
}