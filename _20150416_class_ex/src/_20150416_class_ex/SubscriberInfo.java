package _20150416_class_ex;

public class SubscriberInfo {
	String name, id, password;
	String phoneNo, address;
	SubscriberInfo(){}
	SubscriberInfo(String name, String id, String password, String phoneNo)
	{
		this.name = name;
		this.id = id;
		this.phoneNo = phoneNo;
		this.password = password;
	}
	SubscriberInfo(String name, String id, String password, String phoneNo, String address)
	{
		this(name,id,password,phoneNo);	//신기하네
		this.address = address;
	}
	
	void changePassword(String password)
	{
		this.password = password;
	}
	
	void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	void setAddress(String address)
	{
		this.address = address;
	}	
}
