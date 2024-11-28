public class page26 {
	public static void main(String[] args) {
		P26Car[] cars = new P26Car[2];
        cars[0] = new P26Car();
        cars[1] = new P26RcCar();

        for (int i = 0; i < cars.length; i++) {
            Class cl = cars[i].getClass();
            System.out.println("第" + (i+1) + "個物件的類別是" + cl);
        }
	} 
}


class P26Car {
	protected int num;
    protected double gas;

    public P26Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

   
}

class P26RcCar extends P26Car {

    public P26RcCar() {
        System.out.println("生產了賽車");
    }
    

   
}	
