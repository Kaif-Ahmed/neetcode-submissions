class Solution {
    public int getSum(int a, int b) {
        int carry = 0;
        while (b!=0){
            carry = (a&b)<<1; // (a AND b) then shift 1 bit to left
            a = a^b; // a XOR b
            b = carry;
        }
        return a;
    }
}
