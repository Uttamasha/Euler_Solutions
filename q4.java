package project_euler;
public class q4{

    public static void main(String[] args) {
    	/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    			Find the largest palindrome made from the product of two 3-digit numbers*/

        for(int i=999*999;i>=100*100;i--){
            if(Palindrome(i)==true){
                System.out.println(i);
                break;
            }
        }
    }

    static boolean Palindrome(int n){
        int[] b = new int[7];
        int index=1;
        while(n>0){
            b[index]=n%10;
            index++;
            n/=10;
        }
        for(int i=1;i<=index/2;i++){
            if(b[i]!=b[index-i]){
                return false;
            }
        }
        return true;
    }

}