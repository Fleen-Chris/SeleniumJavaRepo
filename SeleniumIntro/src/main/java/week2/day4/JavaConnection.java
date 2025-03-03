package week2.day4;

public class JavaConnection extends MySqlConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaConnection jcon = new JavaConnection();
		
		jcon.connect();
		jcon.executeQuery();
		jcon.executeUpdate();
		jcon.executeQuery();
		

	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Overriding abtract connect menthod from interface");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Overriding abtract disconnect menthod from interface");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Overriding abtract executeUpdate menthod from interface");
	}

}
