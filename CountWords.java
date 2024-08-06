/**
 * CountWords
 */
public class CountWords {
    public static void main(String[] args) {
        String str= "this is a string";
        int count =0;
        for(int i=0;i<str.length();i++){
            //char ch = str.charAt(i);
            
            if( str.charAt(i)==' '){
                  count++;
            }

        }
        System.out.println(count+1);
    }

    
}