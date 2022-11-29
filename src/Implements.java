import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Implements {
    public boolean check(String str){
        Stack st=new Stack();
        for(int i=0;i<str.length();i++) {
            st.push(str.charAt(i));
        }
        String rev="";
        while(!st.isEmpty()){
            rev=rev+st.pop();
        }
        if(str.equals(rev))
            return true;
       return false;
    }
    public static void main(String[] args) {
        Implements imp=new Implements();
        String str="levis";
        System.out.println(imp.check(str));
    }

}
