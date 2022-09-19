/**
 * 
 * @author Hayden Barolette
 * @version 1.0
 * 
 */

public class Password {

	private String password;
	private int largestBlock;

	/**
	 * Class constructor which creates a password with the specified String and
	 * calculates and stores the length of the largest block.
	 * 
	 * @param password     The password's string value.
	 * @param largestBlock The integer length of the largest block of exact same
	 *                     adjacent characters in the password.
	 */
	public Password(String password) {
		this.password = password;
		largestBlock = this.largestBlockLength();
	}

	/**
	 * Gets the password value.
	 * 
	 * @return A string representing the password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Gets the length of the largest block in the password.
	 * 
	 * @return The integer value of the length of the largest block in the password.
	 */
	public int getLargestBlock() {
		return largestBlock;
	}

	/**
	 * Checks the strength of the password by determining if the largest block in
	 * the password is greater than or less than 2.
	 * 
	 * @return A string stating the length of the largest block, whether or not it
	 *         is a decent or weak password, and how to improve the password.
	 */
	public String strengthCheck() {
		String output = "The largest block in the password is " + largestBlock + ". ";
		String goodpassword = "This is a decent password.";
		String weakpassword = "This password can be made stronger by reducing this block by " + (largestBlock - 2)
				+ ".";
		return output + (largestBlock <= 2 ? goodpassword : weakpassword);
	}

	/**
	 * Determines the integer length of the largest block of exact same adjacent
	 * characters in the password.
	 * 
	 * @return The integer value of the largest block in the password.
	 */
	public int largestBlockLength() {
		String largestblock = "";
		String currentblock = "";
		for (int i = 0; i < this.length() - 1; i++) {
			if (i == 0) {
				currentblock += password.charAt(i);
			} else if (password.charAt(i) != currentblock.charAt(0)) {
				if (currentblock.length() > largestblock.length()) {
					largestblock = currentblock;
					currentblock = "" + password.charAt(i);
				} else {
					currentblock = "" + password.charAt(i);
				}
			} else if (password.charAt(i) == currentblock.charAt(0)) {
				currentblock += password.charAt(i);
			}
		}
		if (currentblock.length() > largestblock.length())
			return currentblock.length();
		return largestblock.length();
	}

	/**
	 * Determines the length of a password.
	 * 
	 * @return The integer value of the length of the password.
	 */
	public int length() {
		return password.length();
	}
	
	public boolean isValid() {
		return password.length() >= 8 && password.length( )<= 12 && !password.contains(" ");
	}
	
	public String invalidpassword() {
		return "The password you entered is invalid. Please check to make sure the password is no less than 8 and no greater than 12 characters, and contains no spaces.";
	}

}
