public class Fibanacci {

    public static void main(String... args){
        

        for(int i=0 ; i <= 10; i++){
            System.out.println(f(i));
            
        }
        
        System.out.println("-----------");
        
        for(int i=0 ; i <= 10; i++){
            System.out.println(f2(i));
            
        }
            
    }
    
    static int f(int n){
        
        if(n <= 1){
            return 1;
        }
        return f(n-1) + f(n-2);
    }
    
    static int f2(int n){
        
        if(n == 0 || n == 1){
            return 1;
        }else{
                  
        int fib1 = 1;
        int fib2 = 1;
        int fibn = 0;
            
        for (int i =2; i<=n;i++){
                
                fibn = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibn;
        }
        
            return fibn;
            
        }

        
    }

}