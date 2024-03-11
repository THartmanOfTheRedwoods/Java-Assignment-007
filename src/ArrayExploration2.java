public class ArrayExploration2 {

public static boolean isAnagram(String a , String b){

    a= a.replaceAll("\\s","");
    b=b.replaceAll("\\s","");
    a=a.toLowerCase();
    b=b.toLowerCase();
    if (a.length() != b.length()) return false;

    for (int i = 0; i < (a.length()); i++) {
        int length = a.length();
        int index = a.indexOf(b.charAt(i));

        if (index==-1) return false;

        a = a.substring(0, index) + a.substring(index + 1, length);
    }
    return true;
}
    public static void main(String[] args) {
    System.out.println(isAnagram("christopher mayfield", "hi prof the camel is dry"));
    }
}
