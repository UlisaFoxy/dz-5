public class Main {
    public static void main(String[] args) {

        int a=10;
        int b=12;
        int c=17;
        int d=2;
        int i=a+b;
        int y=c+d;

        System.out.println(a+b);
        System.out.println(c+d);
        System.out.println((a+b)>=(c+d));
        System.out.println(++i);
        System.out.println(y=y-2);

        String isIBiggerThanY=i>y ? "True" : "False";
        System.out.println(isIBiggerThanY);

        String multiplicityTo2=i%2==0 || y%2==0 ? "True" : "False";
        System.out.println(multiplicityTo2);


    }
}