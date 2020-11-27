package Lab_10;
interface Currency {
	public String getCurrency();
	public String getSymbol(); 
}
class India implements Currency{
	@Override
	public String getCurrency() {
		return "Rupee";
	}
	@Override
	public String getSymbol() {
		return "Rs"; 
	}
	public static void main(String a[]){
		India in = new India(); 
		System.out.println(in.getSymbol());
	}
}
class USA implements Currency{
    @Override
    public String getCurrency() {
        return "Dollar";
    }
    @Override
    public String getSymbol() {
    	return "$"; 
    }
}
public class CurrencyFactory {
	class CountryDoesNotExistException extends Exception{
		public CountryDoesNotExistException(String s) {
			super(s);
		}
	}
	public static Currency getCurrencyByCountry(String cnty) throws Exception{
		if(cnty.equalsIgnoreCase("USA")) {
			return new USA();
		}
		else if(cnty.equalsIgnoreCase("India")) {
			return new India();
		}
		else throw new CurrencyFactory().new CountryDoesNotExistException(cnty+" does not exist. Choose from available countries only!");
	}
	public static void main(String[] args) {
		try {
			Currency curr1 = getCurrencyByCountry("USA");
			System.out.println(curr1.getCurrency());
			System.out.println(curr1.getSymbol());
			Currency curr2 = getCurrencyByCountry("India");
			System.out.println(curr2.getCurrency());
			System.out.println(curr2.getSymbol());
			Currency curr3 = getCurrencyByCountry("Pakistan");
			System.out.println(curr3.getCurrency());
			System.out.println(curr3.getSymbol());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
