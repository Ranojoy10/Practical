package september;

public class Studenthasa {
	int   id;
	String name;
	Addresshasa Address;
	public Studenthasa (int id , String name, Addresshasa Address) {
		this.id=id;
		this.name=name;
		this.Address=Address;
	}
void show() {
	System.out.println(id+" "+name);
	System.out.println(Address.city+" "+Address.state+" "+Address.area+" "+Address.country);
}
public static void main(String ...args) {
	Addresshasa ad= new Addresshasa("DGP","WB","DVC colony","India");
	Studenthasa sd= new Studenthasa(101,"Pallavi",ad);
	sd.show();
	
}
}
