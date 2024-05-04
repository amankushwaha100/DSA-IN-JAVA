public class Palindromic_Array {
    public static int palinArray(int[] a, int n)
    {
        boolean isPalindromic = true;
     for(int i=0;i<n;i++){
         int p = a[i];
         int rev = 0;
         while(p!=0){
             rev = rev*10 + p%10;
             p=p/10;
         }
         if(rev !=a[i]){
             isPalindromic = false;
         }
     }
 return isPalindromic?1:0 ;
    } 
}



/* 
 * Palindromic means something reads the same forward and backward.
 * boolean use 
 * ternary operator while using boolean 
 */