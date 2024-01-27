class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
}
class AdvCalc extends Calc{
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}
class VeryAdvCalc extends AdvCalc{
    public double power(int n1,int n2){
        return Math.pow(n1,n2);
    }
}
public class Main{
    public static void main(String a[]){
        Calc obj =new Calc();
        int r1= obj.add(2,3);
        int r2 =obj.sub(7,9);
        AdvCalc obj2 =new AdvCalc();
        int r3= obj2.multi(8,9);
        int r4= obj2.add(8,7);
        VeryAdvCalc obj3 = new VeryAdvCalc();
        int r5=obj.add(8,4);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
        
    }
}