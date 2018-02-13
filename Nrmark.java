public class Nrmark{
	public String andmed;
	public Nrmark(String number) {
		andmed=number;
	}
	public int kuunr() {
		return Integer.parseInt(andmed.substring(2, 3));
	}
	public String kuunimi() {
		String[] kuunimed={"detsember", "märts", "aprill", "mai", "juuni", "juuli", "august", "september", "oktoober", "november"};
		return kuunimed[kuunr()];
	}
}