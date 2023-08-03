
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final Map<Integer, List<Character>>entry=new HashMap<>();


    public static void main(String[] args) {
        System.out.println(strings(23));
    }

    private static List<String>strings(int i){
        StringBuilder str=new StringBuilder();

        List<String>strings1=new ArrayList<>();
        entry.put(2,List.of('a','b','c'));
        entry.put(3,List.of('d','e','f'));
        entry.put(4,List.of('g','h','i'));
        entry.put(5,List.of('j','k','l'));
        entry.put(6,List.of('m','n','o'));
        entry.put(7,List.of('p','q','r','s'));
        entry.put(8,List.of('t','u','v'));
        entry.put(9,List.of('w','x','y','z'));
        String s =String.valueOf(i);
        List<Character> characterList = entry.get(Integer.parseInt(String.valueOf(s.charAt(0))));
        List<Character> characterList1 = entry.get(Integer.parseInt(String.valueOf(s.charAt(1))));

        for (int j = 0; j < characterList.size(); j++) {
            for (Character c:characterList1) {
                str.append(characterList.get(j));
                str.append(c);

                strings1.add(str.toString());
                str.setLength(0);

            }

        }
        return strings1;

            }


        }






