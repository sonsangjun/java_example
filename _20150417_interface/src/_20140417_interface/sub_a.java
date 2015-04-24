package _20140417_interface;

public class sub_a extends super_class implements interface_class{
	int debt;
	sub_a(String name, String address, int debt)
	{
		super(name,address);
		this.debt = debt;
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
