package ss15.thuc_hanh;

public class spaceUpper {
    public static void main(String[] args) {
        String str1 = "CodegymDaNang";
        StringBuilder result = new StringBuilder();
        result.append(str1.charAt(0));

        for (int i = 1; i < str1.length(); i++){
            if (Character.isUpperCase(str1.charAt(i))) {
                result.append(" ");
                result.append(String.valueOf(str1.charAt(i)).toLowerCase());
            } else {
                result.append(str1.charAt(i));
            }
        }
        System.out.println(result);
    }
}
