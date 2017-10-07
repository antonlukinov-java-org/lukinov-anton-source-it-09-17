public class Palindrom {
    public static void main(String[] args){
        System.out.println(args[12].equals(new StringBuffer(args[12]).reverse().toString()) );
    }
}
