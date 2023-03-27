public class StringBuilderFun {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Sambhav Jain");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(7," Sam");
        System.out.println(sb);

        sb.replace(11,19," amazing");
        System.out.println(sb);

        sb.delete(8,12);
        System.out.println(sb);

        sb.replace(0,7,"Dr.");
        System.out.println(sb);

    }
}
