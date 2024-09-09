public class Equals {
    public static void main(String[] args) {
        String str1 = "kundan";
        String str2 = "kundan";
        String str3 = "kumar";
       /*  if (str1.equals(str2)) {
            System.out.println("String 1 and String 2 ar equals String is "+str1);
        }else{
            System.out.println("not equals");
        }*/

        boolean result = str1.equals(str2);
        System.out.println("str1 and str2 are equal="+result);
    }
    
}
