public class SearchInString {
    public static void main(String[] args) {
        String name = "sandesh";
        char ch = 'a';
        System.out.println("character : "+ch+" found in word/string : "+name+" status : "+search(name,ch));

    }
    static boolean search(String word,char target){
        if(word.length() == 0){
            return false;
        }
        for(int i = 0; i<word.length(); i++){
            if(target == word.charAt(i)){
                return true;
            }
        }
//        for(char ch : word.toCharArray()){
//            if(target == ch){
//                return true;
//            }
//        }
        return false;
    }
}