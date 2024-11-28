public class page24 {
    public static void main(String[] args) {	
    	P24Car car1 = new P24Car();
        car1.setCar(1234, 20.5);
        System.out.println(car1);
    }
}

class P24Car {
    protected int num;     
    protected double gas;  

    public P24Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為 " + num + "，汽油量設為 " + gas);
    }

    public String toString() {
        String str = "車號: " + num + "，汽車量: " + gas;
        return str;
    }
}
