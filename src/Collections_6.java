import java.util.*;

public class Collections_6 {
    public static void main(String[] args){
        // initialization_1
        var data = new ArrayList<String>(){
            {
               add("バラ");
               add("ひまわり");
               add("あさがお");
            }
        };
        // 拡張 for
        // 内部ではiteratorを使ってる
        for ( var s : data ){
            System.out.println(s);
            // これは不可 ConcurrentModificationException
            // data.remove(s);
        }

        // ループ内の削除
        var itr = data.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            // itr.remove();
        }

        // 逆順 data.size()は開始位置
        var ite = data.listIterator(data.size());
        while(ite.hasPrevious()){
            System.out.println(ite.previous());
        }

        //　配列 -> リスト asList
        var array = new String[]{"バラ", "あさがお", "チューリップ"};
        var list = Arrays.asList(array);
        // list.remove(0); list.add("桜");　とか要素の追加削除はできない

        // 配列 -> リスト Collections.addAll
        var list2 = new ArrayList<String>();
        Collections.addAll(list2, array);
        list2.add("胡蝶蘭");

        //Collections -> 配列
        var strs = new String[data.size()];
        data.toArray(strs);

        // unmodifiable Collections
        var udata = Collections.unmodifiableList(data);
        // udata.set(0, "百合"); UnsupportedOperationException





    }
}
