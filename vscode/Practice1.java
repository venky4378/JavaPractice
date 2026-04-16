public class Practice1{

    public static void main(String args[]){
        String str = new String();
        str = "Navin Reddy";
        StringBuffer str2 = new StringBuffer("markus");
        str2.append("Markus");
        System.out.println(str2);
        System.out.println(str2.capacity());
        System.out.println(str2.chars());
        System.out.println(str2.length());
        
    }
}