public class Lesson2 {
    public static void main(String[] args) {
        //Kiểm tra số đối xứng
        int n = 54145;
        String s = Integer.toString(n);
        char[] a=s.toCharArray();
        int begin,end=0;
        end= a.length-1;
        for (begin=0; begin < end ; begin++ ,end--)
        {
            char temp = a[begin];
            a[begin] = a[end];
            a[end]=temp;
        }
        String str = "";
        for (Character c : a)
            str +=a.toString();
        int result = str.compareTo(s);
        if (result == 0)
         System.out.println(s + " là số đối xứng");
        else
         System.out.println(s + " không là số đối xứng");
    }
}
