package Device;

public class SmartPhone implements SmartDevice{
	
	private boolean isOn;
    private int memory;
    private Language language;
    private boolean hasWifi;
    public SmartPhone () {    	
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
    	this.hasWifi=true;
    	System.out.println("Connected to wifi");
    }

    public boolean hasWifi() {
    	return hasWifi;
    	
    }

    public void setLanguage(Language _language) {
    	this.language=_language;
    }

    public void printStatus() {
    	System.out.println("This smart phone is" + ( isOn? "turned on":"turned Off"+ "") );
    	System.out.println("This smart phone is in" + this.language + "language" + "and it has"+ this.memory + "MB memory");
    	System.out.println("This smart phone is" + ( hasWifi? "has Wifi": "is not connected to Wifi"));
    }
}
