package sample2;

public class Cast {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        
        System.out.println(a/b);
        System.out.println((double)a/b); // aをdouble型に変換して、2で割っている。
        System.out.println((double)(a/b)); // a/bの計算結果をdouble型に変換している

    }

}
