
public class RemoveAllOccurenceFromString{
 public static String removeOccurence(String s, String part){

    while(s.contains(part)){
        int idx = s.indexOf(part);
        s = s.substring(0,idx) + s.substring(idx+part.length());
    }
    return s;
 }
}