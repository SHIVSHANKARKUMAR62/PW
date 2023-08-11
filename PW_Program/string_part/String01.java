package PW_Program.string_part;

public class String01 {
    public static void main(String[] args) {
        String s1 = new String("Skills");
        String s2 = new String("Skills");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3 = "Shivshankar Kumar";
        System.out.println(s3.indexOf("z"));
        System.out.println(s3.charAt(5));
        // trim method use to replace the spaces as well as strip u. strip have
        String shiv = "  Shiv  shankar";
        System.out.println(shiv.trim());
    }
}
