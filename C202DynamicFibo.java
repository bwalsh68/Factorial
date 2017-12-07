
package c202dynamicfibo;
import java.util.*;

public class C202DynamicFibo {
    public static Integer recFib(Integer n){ //O(2^N) solution
        if ( n==0 || n==1 )
            return n;
        else
            return recFib(n-1) + recFib(n-2);
    }//rec
    
    public static Integer DPFib(Integer n){ //O(N) solution
        
        Integer f0 = 0;
        Integer f1 = 1;
        Integer f2 = 1;
        
        if (n == 0) return f0;
        if (n == 1) return f1;
        if (n == 2) return f2;
        
        for(int i = 3; i <= n; i++){
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }
        return f2;
    }// dynamic

    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int num = 35;
        long start = System.currentTimeMillis();
        System.out.println(recFib(num));
        long endTime = System.currentTimeMillis();
        System.out.println("Time for "+num+
                " numbers in RecFib:"+(endTime-start));
        
        start = System.currentTimeMillis();
        System.out.println(DPFib(num));
        endTime = System.currentTimeMillis();
        System.out.println("Time for "+num+
                " numbers in DynFib:"+(endTime-start));
        
        
        
    }//main
    
}//class
