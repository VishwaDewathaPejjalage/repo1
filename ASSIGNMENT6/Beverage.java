package ASSIGNMENT6;

abstract class Beverage{
	String name; 
	TYPE type;
	SIZE size; 
	
	public final static double BASE_PRICE = 2.0; 
	public final static double SIZE_PRICE = 1.0; 

	public Beverage(String name, TYPE type,SIZE size){
		this.name = name;
		this.type = type; 
		this.size = size;
	}
	
	public double calcPrice(){
		if(this.size.equals(SIZE.SMALL)) {
			return BASE_PRICE;
		}
		if(this.size.equals(SIZE.MEDIUM)) {
			return BASE_PRICE+SIZE_PRICE;	
		}
		else {
			return BASE_PRICE+(SIZE_PRICE*2);
		}
	}
	public TYPE getBevType() {
		return this.type;
	}
	public String toString() {
		return this.name+" "+this.size;
	}
	public boolean equals(Beverage beverage) {
		return (beverage.name.equals(this.name) && beverage.type.equals(this.type)&&beverage.size.equals(this.size));
	}
	public String getName() {
		return this.name;
	}
	public TYPE getType() {
		return this.type; 
	}
	public SIZE getSize() {
		return this.size;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setType(TYPE type) {
		this.type = type;
	}
	public void setSize(SIZE size) {
		this.size = size;
	}

	public String getBevName() {

		return this.name;
	}
}
