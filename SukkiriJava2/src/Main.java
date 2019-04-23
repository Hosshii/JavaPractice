import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args){
        String s1 = "JAVA";
        String s2 = "java";
        String s3 = "スッキリ Java";
        System.out.println("null");
        if(s1.contains("java")){
            System.out.println("s1はjavaを含む");
        }
        if(s2.startsWith("J")){
            System.out.println("s2はJで始まる");
        }

        System.out.println("s3の中でJavaという文字は" + s3.indexOf("Java"));

       System.out.println(s3.charAt(4) + "a");
       System.out.println(s3.substring(3));
       System.out.println(s3.substring(3, 9));

       String s4 = "   空白3文字";
       System.out.println(s4.trim());
       System.out.println(s4);

       StringBuilder sb = new StringBuilder();
       long start = System.currentTimeMillis();
       for(int i = 0; i <10000; i++){
           sb.append("JAVA");
       }
       long end = System.currentTimeMillis();
       String s5 = sb.toString();
       System.out.println(end - start);


       long start2 = System.currentTimeMillis();
       String s6 = "JAVA";
       for(int i = 0; i<10000; i++){
           s6 = s6 + "JAVA";
       }
       long end2 = System.currentTimeMillis();

       System.out.println(end2 - start2);

        StringBuffer sf = new StringBuffer();
        sf.append(3);
        for(int i = 0; i <1000; i++) {
            sf.append("JAVA");
        }

        String s7 = "ようこそ。スッキリわかるJAVA入門へ";
        char[] data = s7.toCharArray();
        for(char d : data){
            System.out.print(d + " ");
        }

        byte[] data3 = s7.getBytes();

        for(byte a: data3){
            System.out.println(a);
        }

        String s8 = "abc,def.ghi:jkl";
        String[] words = s8.split("[,.:]");
        for(String word : words){
            System.out.println(word);
        }

        String words2 = s8.replaceAll("[beh]","X");
        System.out.println(words2);




    }

    //public void test(){};
    public String test(){return "";}






}
