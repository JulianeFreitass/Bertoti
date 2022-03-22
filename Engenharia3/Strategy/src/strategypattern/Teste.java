package strategypattern;

public class Teste {

	public static void main(String[] args) {
		
		Participante Juliane = new Participante();
	
		Juliane.setShow(new IngressoComum());
		Juliane.participarShow();
		
		System.out.println("--------------------------------");
		
		
		Juliane.setShow(new IngressoVIP());
		Juliane.participarShow();
	
		
	}
	
}
