package day_01;

public class Fraction {
    int numerator = 1;       //分子
    int denominator = 1;     //分母

    //    类的构造方法
    public Fraction(int Numerator, int Denominator) {
        this.numerator=Numerator;
        if (Denominator != 0)
            denominator=Denominator;
        else {
            System.out.println("输入有误，分母不能为零");
            System.exit(0);
        }
        int c = GCD(Math.abs( numerator), Math.abs(denominator));
        numerator =  numerator / c;
        denominator = denominator / c;
        if (numerator < 0 && denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    //    求最大公约数
    int GCD(int a, int b) {
        if (a == 0)
            return 1;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    //    打印输出
    void print() {
       if(numerator==0)
           System.out.println(0);
       else if(numerator!=0&&denominator==1)
           System.out.println(numerator);
       else
           System.out.println(numerator+"/"+denominator);
    }

    //    实现加法运算
    Fraction add(Fraction r) {
        int newNumerator = this.numerator * r.denominator + r.numerator * this.denominator;//新的分子
        int newDenominator = this.denominator * r.denominator;//新的分母
        Fraction temp_fraction = new Fraction(newNumerator, newDenominator);
        return temp_fraction;
    }

    //    实现减法运算
    Fraction sub(Fraction r) {
        int newNumerator = this.numerator * r.denominator - r.numerator * this.denominator;//新的分子
        int newDenominator = this.denominator * r.denominator;//新的分母
        Fraction temp_fraction = new Fraction(newNumerator, newDenominator);
        return temp_fraction;
    }

    //    实现乘法运算
    Fraction muti(Fraction r) {
        int newNumerator = this.numerator * r.numerator;
        int newDenominator = this.denominator * r.denominator;
        Fraction temp_fraction = new Fraction(newNumerator, newDenominator);
        return temp_fraction;
    }

    //    实现除法运算
    Fraction divi(Fraction r) {
        int newNumerator = this.numerator * r.denominator;
        int newDenominator = this.denominator * r.numerator;
        Fraction temp_fraction = new Fraction(newNumerator, newDenominator);
        return temp_fraction;
    }
}