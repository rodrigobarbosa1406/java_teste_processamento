
public class Main {

	public static void main(String[] args) {
		
		double b, h, B, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		//Como boa pr�tica colocar o '.0' ap�s o n�mero caso ele seja inteiro apenas para mostrar que � double
		
		area = (((b + B) / 2.0) * h);
		
		System.out.println("C�lculo de �rea de um trap�zio utilizando uma express�o n�merica...");
		System.out.println(area);

		
		//O exemplo abaixo utiliza vari�vel float para mostrar o uso de 'f' ap�s o n�mero para indicar que � float
		float _b, _h, _B, _area;
		
		_b = 6f;
		_B = 8f;
		_h = 5f;
		
		_area = (((_b + _B) / 2f) * _h);
		
		System.out.println(_area);
		
		
		//O exemplo abaixo mostra o resultado de um c�lculo com c�lculo de vari�veis int e sa�da em resultado double
		System.out.println("\nSa�da de um c�lculo com e sem a utiliza��o de casting");
		int valor1, valor2;
		double resultado1, resultado2;
		
		valor1 = 5;
		valor2 = 2;
		
		resultado1 = valor1 / valor2;
		resultado2 = (double) valor1 / valor2;
		
		System.out.println("Sem casting: " + resultado1);
		System.out.println("Com casting: " + resultado2);
		
		
		//O pr�ximo exemplo � um casting de double para int
		System.out.println("\nSa�da de um c�lculo com a utiliza��o de casting de double para int");
		double valorA;
		int valorB;
		
		valorA = 5.2;
		valorB = (int) valorA;
		
		System.out.println(valorB);
	}

}
