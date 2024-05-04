/*https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?page=1&difficulty=School&sortBy=submissions */

public class Print_1_To_N_Without_Loop {
  public void printNos(int N)
    {
        if(N==0){
            return ;
        }
        printNos(N-1);
        System.out.print(N +" ");
    }
}

/*
 * In this question learn how to solve any loop question using recurrsion .
 * When the printNos method is called with an argument N, it checks if N is equal to 0.
If N is indeed 0, the method immediately returns, which means it exits without executing any further code.

 */