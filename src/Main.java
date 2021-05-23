
public class Main {

	public static void main(String[] args) {
		
		double b, h, B, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		//Como boa prática colocar o '.0' após o número caso ele seja inteiro apenas para mostrar que é double
		
		area = (((b + B) / 2.0) * h);
		
		System.out.println("Cálculo de área de um trapézio utilizando uma expressão númerica...");
		System.out.println(area);

		
		//O exemplo abaixo utiliza variável float para mostrar o uso de 'f' após o número para indicar que é float
		float _b, _h, _B, _area;
		
		_b = 6f;
		_B = 8f;
		_h = 5f;
		
		_area = (((_b + _B) / 2f) * _h);
		
		System.out.println(_area);
		
		
		//O exemplo abaixo mostra o resultado de um cálculo com cálculo de variáveis int e saída em resultado double
		System.out.println("\nSaída de um cálculo com e sem a utilização de casting");
		int valor1, valor2;
		double resultado1, resultado2;
		
		valor1 = 5;
		valor2 = 2;
		
		resultado1 = valor1 / valor2;
		resultado2 = (double) valor1 / valor2;
		
		System.out.println("Sem casting: " + resultado1);
		System.out.println("Com casting: " + resultado2);
		
		
		//O próximo exemplo é um casting de double para int
		System.out.println("\nSaída de um cálculo com a utilização de casting de double para int");
		double valorA;
		int valorB;
		
		valorA = 5.2;
		valorB = (int) valorA;
		
		System.out.println(valorB);
	}

}
