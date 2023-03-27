import sun.lwawt.macosx.CSystemTray;

public class StringMethods2 {
    public static void main(String[] args){
        String a="Sambhav Jain";
        String upper=a.toUpperCase();
        String lower=a.toLowerCase();

        int a1=a.indexOf("n");

        String sub=a.substring(8);

        System.out.println("Upper is:"+upper);
        System.out.println("Lower is:"+lower);
        System.out.println("Index of n is "+a1);
        System.out.println("Last name is:"+sub);

    }
}
