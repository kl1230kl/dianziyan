public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WashingMachine m=new HaierRolling();
		m.wash();
		m.dry();
		WashingMachine m2=new MideaWheel();
		m2.wash();
		m2.dry();		
	}
}