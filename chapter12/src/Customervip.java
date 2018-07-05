public class Customervip extends Customer{

	public Customervip(String name, char gender, String email, int birthYear) {
		super(name, gender, email, birthYear);
		// TODO Auto-generated constructor stub
	}



	private String suip;
	private char jiyuk;
	private String jikup;
	
	public String getSuip() {
		return suip;
	}

	public void setSuip(String suip) {
		this.suip = suip;
	}

	public char getJiyuk() {
		return jiyuk;
	}

	public void setJiyuk(char jiyuk) {
		this.jiyuk = jiyuk;
	}

	public String getJikup() {
		return jikup;
	}

	public void setJikup(String jikup) {
		this.jikup = jikup;
	}


	
//	public Customervip(String suip, char jiyuk, String jikup) {
//		this.suip = suip;
//		this.jiyuk = jiyuk;
//		this.jikup = jikup;
//	}
	
	
	@Override
	public String toString() {
		return "Customervip [suip=" + suip + ", jiyuk=" + jiyuk + ", jikup=" + jikup + "]";
	}
}
