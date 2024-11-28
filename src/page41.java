public class page41 {
	public static void main(String[] args) {
		P41Car car1 = new P41Car(1234, 30.5);
		car1.vShow();
		car1.mShow();
	} 
}

interface iP41Vehicle {
    void vShow();
}

interface iP41Material {
	void mShow();
}

class P41Car implements iP41Vehicle, iP41Material {
    private int num;
    private double gas;

    public P41Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    public void vShow() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
    public void mShow() {
    	System.out.println("車子的材質是鐵");
    }
}