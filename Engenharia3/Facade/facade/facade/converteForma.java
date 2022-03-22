package facade;

public class converteForma {
	
	private Define AVI;
	private Define MP4;
	private Define MOV;
	
	public converteForma() {
		AVI = new AVI();
		MP4 = new MP4();
		MOV = new MOV();
	}
	
	
	public void converteAVI() {
		AVI.converte();
	}
	
	public void converteMP4() {
		MP4.converte();
	}
	
	public void converteMOV() {
		MOV.converte();
	}
	
	
}
