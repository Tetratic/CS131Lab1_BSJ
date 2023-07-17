import java.security.SecureRandom;
import java.util.*;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	
	private boolean active;
	private String intelligenceType;
	
	public NonPlayerCharacter() {
		super();
		setActive(false);
		setIntType("AVERAGE");
	}
	
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		super(id,personality);
		setActive(active);
		setIntType(intelligenceType);
	}
	
	public void setActive(boolean b) {
		active = b;
	}
	
	public void setIntType(String s) {
		intelligenceType = s;
	}
	
	public boolean getActive() {
		return active;
	}
	
	public String getIntType() {
		return intelligenceType;
	}
	
	public String reportStructure() {
		super.reportStructure();
		
		StringBuilder sb = new StringBuilder("Active: "+getActive()+"\n");
		sb.append("Intelligence: "+getIntType()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}
	
	public String introduce() {
		String sb = ("Hello my name is " + super.uniqueID);
		return sb;
	}
	
	public String exclaim() {
		String [] arr = {"Dag Gummit","Doggone it","Holy cow","Jeez","Well cheese and crackers"};
		Random rand = new Random();
		
		int choice = rand.nextInt(arr.length);
		return arr[choice];
	}

}//end class
