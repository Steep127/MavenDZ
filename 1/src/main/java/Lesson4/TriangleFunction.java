package Lesson4;

public class TriangleFunction {
    private int a;
    private int b;
    private int c;

    public TriangleFunction (int _a, int _b, int _c) {
        this.a = _a;
        this.b = _b;
        this.c = _c;
    }

    public void triangleArea (){
        int p = (this.a + this.b + this.c) / 2 ;
        int s = p * (p - this.a) * (p - this.b) * (p - this.c);
        int k = (int) Math.sqrt(s);
        System.out.println(k);
    }

    public boolean proverkaCtoronHaNolb () throws TriangleZeroException {
        if (this.a == 0){
            throw new TriangleZeroException();
        }
        if (this.b == 0){
            throw new TriangleZeroException();
        }
        if (this.c == 0){
            throw new TriangleZeroException();
        }
        return true;
    }

    public boolean proverkaCtoronHaMunyc() throws TriangleMinucException {
        if (this.a <= -1){
            throw new TriangleMinucException();
        }
        if (this.b <= -1){
            throw new TriangleMinucException();
        }
        if (this.c <= -1){
            throw new TriangleMinucException();
        }
        return true;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }


}
