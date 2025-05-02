public class StringBuilders3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Marlin");
        System.out.println("Intial StringBuilder : " + sb);

        sb.append(" Purnama Sari");
        System.out.println("After append: " + sb);

        System.out.println(sb.length());

        //convert StringBuilder to String
        String str = sb.toString();
        System.out.println(str);
    }
}
