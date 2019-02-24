//Shahzodjon Ismatov (110518374)
class HexFormatException extends Exception{}

public class HexaDecimal {
	
	public static int parseHex(String hex) throws HexFormatException{
		int d = 0;
		for(int i=0; i<hex.length();i++)
		{
			d = d*16 + parseHexDigit(hex.charAt(i));
		}
		return d;
	}
	
	public static int parseHexDigit(char h) throws HexFormatException {
		if('0' <= h && h <= '9')
			return h-'0';
		if('a' <= h && h <= 'f')
			return h-'a' + 10;
		if('A' <= h && h <= 'F')
			return h-'A' + 10;
		throw new HexFormatException();
	}

	public static void main(String[] args) {
		try{
			System.out.println(parseHex("1A"));
		}catch(HexFormatException e){
			System.out.println("This is not a hexadecimal number");
		}
		

	}

}
