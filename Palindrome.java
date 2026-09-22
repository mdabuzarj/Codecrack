// class Palindrome{
//     public boolean isPalindrome(int x){
//         int original = x;
//         int rev = 0;

//         while(x > 0){
//             int digit = x % 10;
//             rev = rev * 10 +digit ;
//             x = x /10;

//         }
//         return original == rev;

//     }
// }

class Palindrome {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {

        Palindrome p = new Palindrome();

        System.out.println(p.isPalindrome(121));
        System.out.println(p.isPalindrome(123));
    }
}