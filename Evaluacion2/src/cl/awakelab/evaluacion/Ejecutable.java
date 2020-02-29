package cl.awakelab.evaluacion;

/**
 * Esta es la clase ejecutable del proyecto
 * @author Germán Illanes
 * @version 27/02/2020/A
 */

public class Ejecutable {

	/**
	 * En esta clase Ejecutable se efectua el metodo main
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		/**
		 * Se define un arreglo electrodomesticos de la clase Electrodomestico con un largo de 10.
		 * Para cada una de las posiciones de este arreglo se invoca a cada uno de los constructores de las clases anteriores
		 */

		Electrodomestico [] electrodomesticos = new Electrodomestico[10];
		electrodomesticos[0] = new Electrodomestico();
		electrodomesticos[1] = new Electrodomestico(40000, 2);
		electrodomesticos[2] = new Electrodomestico(200000, "GRIS", 'p', 81);
		electrodomesticos[3] = new Lavadora();
		electrodomesticos[4] = new Lavadora(399999, 45);
		electrodomesticos[5] = new Lavadora(499999, "RoJo", 'h', 50, 40);
		electrodomesticos[6] = new Television();
		electrodomesticos[7] = new Television(219900, 3);
		electrodomesticos[8] = new Television(1999999, "negro", 'a', 7, 80, true);
		electrodomesticos[9] = new Television();
		
		/**
		 * Se imprime por pantalla el precio final de cada Electrodomestico, Lavadora y Television
		 */
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			System.out.println("El precio final de este " + electrodomesticos[i].getClass().getSimpleName()+ " es de $" +electrodomesticos[i].precioFinal());
		}
		
		System.out.println("");
		
		/**
		 * Se establecen variables precioElectrodomestico, precioLavadoras y precioTelevisores para trabajar con el precio final para cada una de las clases
		 * (Electrodomestico, Lavadora y Televisor)
		 */
		
		float precioElectrodomesticos = 0;
		float precioLavadoras = 0;
		float precioTelevisores = 0;
		
		/**
		 * Se recorre el arreglo y se imprime por pantalla el precio final para cada una de las clases
		 */
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] instanceof Electrodomestico) {
				precioElectrodomesticos = precioElectrodomesticos + electrodomesticos[i].precioFinal();
			}
			if (electrodomesticos[i] instanceof Lavadora) {
				precioLavadoras = precioLavadoras + electrodomesticos[i].precioFinal();
			}
			if (electrodomesticos[i] instanceof Television) {
				precioTelevisores = precioTelevisores + electrodomesticos[i].precioFinal();
			}
			
		}
		
		System.out.println("El precio total de los Electrodomesticos es €" + precioElectrodomesticos);
		System.out.println("");
		System.out.println("El precio total de las Lavadoras es €" + precioLavadoras);
		System.out.println("");
		System.out.println("El precio total de los Televisores es €" + precioTelevisores);
	}

}
