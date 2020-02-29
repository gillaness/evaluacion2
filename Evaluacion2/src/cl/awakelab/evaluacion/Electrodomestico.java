package cl.awakelab.evaluacion;
/**
 * Esta clase define los constructores y métodos de Electrodomestico
 * @author Germán Illanes
 * @version 27/02/2020/A
 */
public class Electrodomestico {
	
	//Constantes definidas de la clase Electrodomestico para utilizarlas en constructores por defecto 
	/**
	 * Se definen siguientes constantes: PRECIO_BASE_DEFECTO = 100000, COLOR_DEFECTO = blanco; CONSUMO_ENERGETICO_DEFECTO = 70,
	 * PESO_DEFECTO = 5;
	 */
	public static final int PRECIO_BASE_DEFECTO = 100000;
	public static final String COLOR_DEFECTO = "blanco";
	public static final char CONSUMO_ENERGETICO_DEFECTO = 70;
	public static final float PESO_DEFECTO = 5;
	
	//Variables de instancia de la clase Electrodomestico
	/**
	 * Se definen como variables de instancia el precioBase, el color, el consumoEnergetico y el peso de los electrodomesticos
	 */
	private int precioBase;
	private String color;
	private char consumoEnergetico;
	private float peso;
	
	/**
	 * Constuctor por defecto de Electrodomestico
	 * Obtiene los valores de las constantes definidas anteriormente
	 */
	
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE_DEFECTO;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
		this.peso = PESO_DEFECTO;
	}
	
	/**
	 * Constructor de Electrodomestico utilzando los siguientes parámetros:
	 * @param precioBase El parámetro precioBase indica el precio inicial que tiene el objeto de Electrodomestico
	 * @param peso El parametro peso indica el peso del objeto de Electrodomestico en unidad de medida kilogramos
	 */
	
	public Electrodomestico(int precioBase, float peso) {
		this();
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	/**
	 * Constructor de Electrodomestico utilizando los siguientes parámetros:
	 * @param precioBase El parámetro precioBase indica el precio inicial que tiene el objeto de Electrodomestico
	 * @param color Este parámetro indica el color del objeto de Electrodomestico
	 * @param consumoEnergetico
	 * @param peso El parametro peso indica el peso del objeto de Electrodomestico en unidad de medida kilogramos
	 */
	
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, float peso) {
		this(precioBase, peso);
		/**
		 * Dentro del constructor se determina si la letra asignada al consumo energético esta dentro del rango determinado (A,B,C,D,E,F)
		 * (independiente de mayusculas y minusculas). En caso de que la letra no corresponda al rango, se asigna el valor por defecto (F).
		 */
		if(comprobarConsumo(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		}else {
			this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
		}
		/**
		 * Dentro del constructor se determina si el color asignado está dentro del rango determinado (blanco, negro, rojo, azul, gris) independiente
		 * de mayusculas y minusculas. En caso de que el color no sea los de la lista, se asigna por defecto blanco.
		 */
		if(comprobarColor(color)) {
			this.color = color;
		}else {
			this.color = COLOR_DEFECTO;
		}
	}
	
	/**
	 * Se declara el método getPrecioBase() el cual retorna el precioBase del electrodomestico al ser consultado por alguna clase heredera
	 * @return precioBase
	 */

	protected int getPrecioBase() {
		return precioBase;
	}

	/**
	 * Se declara el método getColor() el cual retorna el color del electrodomestico al ser consultado por alguna clase heredera
	 * @return color
	 */
	protected String getColor() {
		return color;
	}
	
	/**
	 * Se declara el método getConsumoEnergetico() el cual retorna el consumo del electrodomestico al ser consultado por alguna clase heredera
	 * @return consumoEnergetico
	 */

	protected char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	/**
	 * Se declara el método getPeso() el cual retorna el peso del electrodomestico al ser consultado por alguna clase heredera
	 * @return
	 */

	protected float getPeso() {
		return peso;
	}
	
	/**
	 * Se declara el método comprobarConsumo(char letra) el cual retorna verdadero si la letra ingresada del consumo energético está dentro del rango
	 * o retorna falso en caso de que no esté dentro del rango.
	 * @param letra
	 * @return boolean
	 */
	
	public boolean comprobarConsumo(char letra) {
		if((letra >= 65 && letra <= 70) || (letra >= 97 && letra <= 102) ) {
			return true;
		}
		return false;
	}
	
	/**
	 * Se declara el método comprobarColor(String color) el cual retorna verdadero si el color ingresado está dentro de la lista de colores permitidos.
	 * En caso contrario, retorno falso
	 * @param color
	 * @return boolean
	 */
	
	public boolean comprobarColor(String color) {
		String [] paleta = new String [5];
		paleta[0] = "blanco";
		paleta[1] = "negro";
		paleta[2] = "rojo";
		paleta[3] = "azul";
		paleta[4] = "gris";
		int aux = 0;
		
		for (int i = 0; i < paleta.length; i++) {
			if(paleta[i].equals(color.toLowerCase())) {
			aux = 1;
			}else {
			aux = 0;
			}
		}
		if(aux == 1) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Se declara el método precioFinal() el cual el precio final del electrodomestico, en base a su precio inicial, consumo energético y peso
	 * @return precioElectrodomestico
	 */
	
	public float precioFinal() {
		int precioElectrodomestico = 0;
		int precioConsumo = 0;
		int precioPeso = 0;
		if(this.consumoEnergetico == 65 || this.consumoEnergetico == 97) {
			precioConsumo = 100; 
		}else if (this.consumoEnergetico == 66 || this.consumoEnergetico == 98) {
			precioConsumo = 80;
		}else if (this.consumoEnergetico == 67 || this.consumoEnergetico == 99) {
			precioConsumo = 60;
		}else if (this.consumoEnergetico == 68 || this.consumoEnergetico == 100) {
			precioConsumo = 50;
		}else if (this.consumoEnergetico == 69 || this.consumoEnergetico == 101) {
			precioConsumo = 30;
		}else if (this.consumoEnergetico == 70 || this.consumoEnergetico == 102) {
			precioConsumo = 10;
		}
		
		if(this.peso >= 0 && this.peso <= 19) {
			precioPeso = 10;
		}else if(this.peso >= 20 && this.peso <= 49) {
			precioPeso = 50;
		}else if(this.peso >= 50 && this.peso <= 79) {
			precioPeso = 80;
		}else if (this.peso >=80) {
			precioPeso = 100;
		}
		
		precioElectrodomestico = this.precioBase + precioConsumo + precioPeso;
		
		return precioElectrodomestico;
	}
	

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + ", precioFinal()=" + precioFinal() + "]";
	}

}
