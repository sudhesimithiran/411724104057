// String s="hello world";
        // System.out.println(s);
        // System.out.println(System.identityHashCode(s));
        // s=s.replace('h', 'H');
        // System.out.println(s);
        // System.out.println(System.identityHashCode(s));
        
        // String s="hello world";
        // System.out.println(s);
        // System.out.println(System.identityHashCode(s));
        // String s2=s.replace('h', 'H');
        // System.out.println(s);
        // System.out.println(System.identityHashCode(s));
        // System.out.println(s2);
        // System.out.println(System.identityHashCode(s2));

        // String s=" hello world ";
        // System.out.println(s.length());
        // System.out.println(s);
        // s=s.trim();
        // System.out.println(s);
        // System.out.println(s.length());

        //concatenation
        // String s1="javaprogram";
        // String s2="java";
        // String s3="program";
        // String s4=s2+s3;
        // System.out.println(s1);
        // System.out.println(System.identityHashCode(s1));
        // System.out.println(s4);
        // System.out.println(System.identityHashCode(s4));
        // System.out.println(s4==s1);

        // String word="hello";
        // word+=",world";
        // word+=",program";
        // System.out.println(word);

        // String word="madam speaks";
        // System.out.println(word.contains("g"));

        // String word="geeks";
        // for (int i = 0; i < word.length(); i++) {
        //     System.out.println(word.substring(i,i+1));
        // }

        // String word="aabbccdd";
        // String newword="";
        // for (int i = 0; i < word.length(); i++) {
        //     String letter=word.substring(i,i+1);
        //     if (!newword.contains(letter)) {
        //         newword+=letter;
        //     }
        // }
        // System.out.println(newword);

        // String word="geeks";
        // String newword="";
        // int freq[]=new int[26];
        // System.out.println(word);
        // for (int i = 0; i < word.length(); i++) {
        //     String letter=word.substring(i,i+1);
        //     char ch=letter.charAt(0);
        //     freq[ch-97]++;
        //     if (!newword.contains(letter)) {
        //         newword+=letter;
        //     }
        // }
        // System.out.println(newword);
        // //System.out.println(Arrays.toString(freq));
        // for (char ch : newword.toCharArray()) {
        //     System.out.print(ch+"-");
        //     System.out.println(freq[ch-97]);
        // }

        // String s1="dbcd";
        // String s2="gcbd";
        // System.out.println(s1.compareTo(s2));
        // System.out.println(s1.equals(s2));

        // StringBuffer sb=new StringBuffer();
        // System.out.println(System.identityHashCode(sb));
        // System.out.println(sb.capacity());
        // sb.append("abcdefgh");
        // System.out.println(sb.capacity());
        // sb.append("abcdefgh");
        // System.out.println(sb.capacity());
        // sb.append("i");
        // System.out.println(sb.capacity());
        // sb.append("a");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        // sb.append("abcdefghi");
        // System.out.println(sb.capacity());
        // sb.append("a");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        // System.out.println(System.identityHashCode(sb));
        // System.out.println(sb);

        // StringBuffer sb1=new StringBuffer("abcd");
        // StringBuffer sb2=new StringBuffer("abcd");
        // System.out.println(sb1.equals(sb2));

        // String s="hello";
        // StringBuffer sb=new StringBuffer(s);
        // sb.reverse();
        // System.out.println(sb);

        // String s="hello";
        // StringBuffer sb=new StringBuffer(s);
        // sb.reverse();
        // String srev=sb.toString();
        // System.out.println(s);
        // System.out.println(srev);

        // String s="hello";
        // StringBuffer sb=new StringBuffer(s);
        // System.out.println(sb);
        // System.out.println(System.identityHashCode(sb));
        // sb.reverse();
        // System.out.println(sb);
        // System.out.println(System.identityHashCode(sb));

        // String s="abc";
        // String srev="";
        // for (int i = s.length()-1; i>=0; i--) {
        //     srev+=s.charAt(i);
        // }
        // System.out.println(srev);

        // StringBuffer sb=new StringBuffer("hello world");
        // sb.insert(0, "program ");
        // System.out.println(sb);

        // StringBuffer sb=new StringBuffer("abcd efgh");
        // sb.deleteCharAt(0);
        // System.out.println(sb);

        // String s="abc,efg,hij";
        // String w[]=s.split(",");
        // System.out.println(Arrays.toString(w));
        // System.out.println(w.length);

        // String line=" abc    efg    hij    ";
        // String words[]=line.split("\\s+");
        // StringBuffer sb=new StringBuffer();
        // for (String w : words) {
        //     if(!w.isEmpty())
        //     {
        //     sb.append(w.trim()); 
        //     sb.append(",");  
        //     }
                     
        // }
        // System.out.println(sb);

public class Stringeg{
    public static void main(String[] args) {
        String s = "ram,shiva,anbu,jegan,vishnu,john,kevin,alex";
        String names[] = s.split(",");
        for (String name : names){

            if(name.startsWith("a"))
            System.out.println(name);
        }
    }
}