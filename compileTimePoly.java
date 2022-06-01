public class compileTimePoly {
    int add(){
        int a=10,b=20,c;
        c=a+b;
        return c;
    }
    void add(int x,int y){
        int c;
        c = x+y;
        System.out.println(c);
    }
    void add(int x,double y){
        double c;
        c = x+y;
        System.out.println(c);
    }


    public static void main(String[] args) {
        compileTimePoly r = new compileTimePoly();
        int result=r.add();
        System.out.println(result);
        r.add(122,343);
        r.add(32,156.78);

    }
}
