public class SearchInstrings{
    public static void main(Strings[] args){
        string name = "kunal";
        char target = "u";
        system.out.println(Search(name, target));
    }

    static boolean Search(string str, char target){
        if(str.length()==0){
            return false;
        }

        // for(char ch: str.toCharArray()){
        // if(ch == target){
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}