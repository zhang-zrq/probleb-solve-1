package day_01;

public class mutiTest {
    public static void main(String[] args) {
        Fraction f1=new Fraction(-1,3);
        Fraction f2=new Fraction(2,6);//并且可以自动化简到规定格式
        Fraction f3=f1.muti(f2);
        f3.print();
    }
}
