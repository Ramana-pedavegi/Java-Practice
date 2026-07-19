public class StringP1 {
    public static void main(String[] args){
        String s1="   hello   ";
        String s2=new String("hi hello");
        String s3=new String("hello" );
        String s4="hello";
         String s5=new String("HELLO" );
        //System.out.println(s1==s2);
        //System.out.println(s3==s2);
        //System.out.println(s1==s4);
        //System.out.println(s5==s1);
        //System.out.println(s5==s2);
        //System.out.println(s1.equals(s2));
        //System.out.println(s2.equals(s3));
        //System.out.println(s3.equals(s4));
        //System.out.println(s1.equals(s5));
        //System.out.println(s1.equalsIgnoreCase(s2));
        //System.out.println(s3.equalsIgnoreCase(s2));
        //System.out.println(s3.equalsIgnoreCase(s4));
        //System.out.println(s1.equalsIgnoreCase(s5));
       // System.out.println(s1.contains("he"));
        //System.out.println(s1.contains("H"));
       // System.out.println(s1.contains("s"));
      //  System.out.println(s2.contains("H"));
        //System.out.println(s5.contains("llo"));
       //System.out.println(s1.startsWith("he"));
        //System.out.println(s1.startsWith("hello"));
        //System.out.println(s1.startsWith("ll"));
        //System.out.println(s2.startsWith("He"));
        //System.out.println(s5.startsWith("he"));
        //System.out.println(s1.endsWith("lo"));
        //System.out.println(s2.endsWith("llo"));
        //System.out.println(s5.endsWith("l"));
        //System.out.println(s4.endsWith("hl"));
        //System.out.println(s1.endsWith("LO"));
        System.out.println(s1.trim());
        System.out.println(s1.trim().toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toCharArray());
        System.out.println(s1.indexOf("o"));
        System.out.println(s2.substring(2));
        System.out.println(s2.split(" "));
        System.out.println(s2.replace("hi","hey"));
        System.out.println(String.valueOf(s3));
    }

    
}
