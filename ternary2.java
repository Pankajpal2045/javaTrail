public class ternary2 {
    public static void main(String []args){
        int a=100,b=200,c=300,d=50;
        // int res= (a<b)?(a<c?a:c):(b<c?b:c);
        // System.out.println(res);
        
        int num= (a<b)?(a<c?(a<d? a:d):(c<d?c:d)):(b<c?b:c);
        System.out.println("num= "+num);
        
        if(a<b){
            if (a<c){
                if(a<d){
                    System.out.println(a);
                }
                else{
                    System.out.println(d);
                }
            }else{

                if(c<d){
                    System.out.println(c);
                }else{
                    System.out.println(d);
                }
            
            }
        }else{
            if(b<c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}
