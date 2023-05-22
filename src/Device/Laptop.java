package Device;

public class Laptop implements SmartDevice {	
	
	protected boolean isOn ;
	protected int memory;
	protected Language language;
	public boolean hasWifi;
    public Laptop () {
    	
    }
    public void turnOn () {
    	isOn=true;    	
    }    

    public void turnOff() {
    	isOn=false;    	
    }
    public void setMemory(int _memory) {
    	memory=_memory;
    }

    public int getMemory() {
    	return this.memory;
    }
    

    public void connectWifi() {
    	hasWifi=true;
    }
    public boolean hasWifi() {
    	return hasWifi;
    	
    }

    public void setLanguage(Language _language) {
    	this.language=_language;
    }

    public void printStatus() {
    	System.out.println("This laptop is" + ( isOn? "turned on":"turned Off"+ "") );
    	System.out.println("This laptop is in" + this.language + "language" + "and it has" + this.memory + "MB memory");
    	System.out.println("This laptop is" + ( hasWifi? "has Wifi": "is not connected to Wifi"));
    }
}

