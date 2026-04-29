package programs;

public class IsAndNotEquals {

    public static void main(String[] args) {
//        String str="This is notnot";
        String str="noisxxnotyynotxisi";
        int is=0,not=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String s = str.substring(i, j);
                if(s.equalsIgnoreCase("is")){
                    is++;
                }
                if(s.equalsIgnoreCase("not")){
                    not++;
                }
            }
        }

        if (is==not)
            System.out.println("same count for is and not");
        else
            System.out.println("not same count");
    }
}
