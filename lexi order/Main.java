public class Main {

    public static boolean relates(String a, String b){
        //check if a is the null String
        if(a.equals("")){
            return true;
        }
        
        //check if a is prefix of b    
        int mini = Math.min(a.length(), b.length());
    
        for(int i = 0; i < mini; ++i){
            if(a.charAt(i) != b.charAt(i)){
                //check if relate on k'th character
                int x = (int)(a.charAt(i))-48;
                int y = (int)(b.charAt(i))-48;
                    
                return (x != 0 && y % x == 0);
            }
        }
    
        return true;
    }

    public static void main(String[] args) {
        String a[] = {"1", "2", "3", "9", "18"};
    
        for(int i = 0; i < a.length; ++i){
            for(int j = i; j >= 0; --j){
                //check if the i'th String relates to the j'th String
                if(relates(a[i], a[j])){
                    System.out.println(a[i] + " R " + a[j]);
                }
            }
        }
	}
}
