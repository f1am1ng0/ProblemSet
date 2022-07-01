

public class A {
    public static void main(String[] args) {

        System.out.println(isPalindrome("amanaplanacanalpanama"));
    }

    static boolean isPalindrome(String text){
        for (int i=0; i<text.length()/2; i++){
            if (text.charAt(i) != text.charAt(text.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
