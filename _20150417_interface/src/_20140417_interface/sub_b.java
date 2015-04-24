package _20140417_interface;

public class sub_b extends super_class implements interface_class {
	int account;
	sub_b(String name, String address, int account)
	{
		super(name,address);
		this.account = account;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	

}
