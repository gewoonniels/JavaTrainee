package h5;

public class HomeWorkH5 {

    public void fibo(int n){
        fibo(1,n);
    }

    public void fibo(int start, int n){
        int first = start;
        int second = 0;
        System.out.println(start);
        for(int i = 0; i < n -1; i++){
            System.out.println(first + second);
            int buffer = first;
            first = first + second;
            second = buffer;
        }
    }

    public void fibo(int f1, int f2, int n){
//        int first = f1;
//        int second = f2;
//        System.out.println(f1);
//        System.out.println(f2);
//        for(int i = 0; i < n -1; i++){
//            System.out.println(first + second);
//            int buffer = first;
//            first = first + second;
//            second = buffer;
//        }
    }


}
