package week2.day4;

public class OracleConnection implements DatabseConnection{
	

	    @Override
	    public void connect() {
	        System.out.println("Connecting to Oracle database.");
	    }

	    @Override
	    public void disconnect() {
	        System.out.println("Disconnecting from Oracle database.");
	    }

	    @Override
	    public void executeUpdate() {
	        System.out.println("Executing query: ");
	    }

	    public static void main(String[] args) {
	    	DatabseConnection db = new OracleConnection();
	        db.connect();
	        db.executeUpdate();
	        db.disconnect();
	    }
	}



