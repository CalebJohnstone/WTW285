public class Main {

    public static boolean relates(int a, int b){
        return (a != 0 && b % a == 0);
    }

    public static void main(String[] args) {
        int a[] = {2,3,4,6,8,12,24};
    
        for(int i = 0; i < a.length; ++i){
            boolean least = true;
            boolean maximal = true;

            for(int j = 0; j<a.length; ++j){
                if(relates(a[i], a[j])){
                    System.out.println(a[i] + " R " + a[j]);
                    
                    if(i != j){
                        maximal = false;
                    }
                }else{
                    least = false;
                }
            }

            if(least){
                System.out.println("Least element: " + a[i]);
                System.out.println("----------------------");
            }

            if(maximal){
                System.out.println("Maximal element: " + a[i]);
                System.out.println("----------------------");
            }

            boolean greatest = true;
            boolean minimal = true;

            for(int j=a.length-1; j>=0; --j){
                if(!relates(a[j], a[i])){
                    greatest = false;
                }else if(j != i){
                    minimal = false;
                }
            }

            if(greatest){
                System.out.println("Greatest element: " + a[i]);
                System.out.println("----------------------");
            }

            if(minimal){
                System.out.println("Minimal element: " + a[i]);
                System.out.println("----------------------");
            }
        }
	}
}
