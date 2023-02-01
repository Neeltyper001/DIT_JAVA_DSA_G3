public class PrimeBetter2 {
    public static void main(String[] args) {
        int num = 7;
        if(num == 1){
            System.out.println("Not a Prime Number");
            return ; // exit from the function
        }
        if(num ==2 || num == 3){
            System.out.println("Prime Number");
            return ;
        }
        if(num % 2==0 || num % 3==0){
            System.out.println("Not a Prime Number");
            return ;
        }
        for(int i = 5; i*i<=num; i=i+6){
            if(num%i==0 || num%(i+2)==0 ){
                System.out.println("Not a Prime Number");
                return ;
            }
        }
        System.out.println("Prime Number");

    }
}
