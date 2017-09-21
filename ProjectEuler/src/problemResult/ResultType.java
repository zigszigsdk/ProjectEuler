package problemResult;

public enum ResultType {
	ACTUAL(1), TEST(2);
	
	final int type;
	
	ResultType(int type){ this.type = type; }
	
	public String toString()
	{
		return type == 1 ? "actual" : "test";
	}
}
