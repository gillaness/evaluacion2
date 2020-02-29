package cl.awakelab.evaluacion;

/**
 * Esta clase define los constructores y métodos de la clase Lavadora
 * @author Germán Illanes
 * @version @version: 27/02/2020/A
 */

public class Lavadora extends Electrodomestico {
	/**
	 * Se define como constante CARGA_DEFECTO = 5
	 */
	public static final int CARGA_DEFECTO = 5;
	
	/**
	 * Se define la variable carga de tipo entero
	 */
	
	private int carga;
	
	/**
	 * Se define un constructor por defecto para la clase Lavadora, la cual llama a traves de super() a los parametros por defecto de la clase madre 
	 * Electrodomesticos y ademas contiene el valor de carga por defecto
	 */
	
	public Lavadora() {
		super();
		this.carga = CARGA_DEFECTO;
	}
	
	/**
	 * Se define un constructor que requiere los parámetros precioBase y peso. Ambos se obtienen de la clase madre Electrodomesticos. El resto de los 
	 * parametros mantienen su valor por defecto
	 * @param precioBase
	 * @param peso
	 */
	
	public Lavadora(int precioBase, float peso) {
		this();
		this.getPrecioBase();
		this.getPeso();
	}
	
	/**
	 * Se define un constructor que hacer uso de todos los parámetros heredados de la clase madre Electrodomesticos y el propio de esta clase 
	 * @param precioBase El parámetro precioBase indica el precio inicial que tiene el objeto de Electrodomestico
	 * @param color Este parámetro indica el color del objeto de Electrodomestico
	 * @param consumoEnergetico
	 * @param peso El parametro peso indica el peso del objeto de Electrodomestico en unidad de medida kilogramos
	 * @param carga Este parametro se refiere a la carga máxima de ropa con la que puede operar la lavadora
	 */
	
	public Lavadora(int precioBase, String color, char consumoEnergetico, float peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	/**
	 * Se define el metodo getCarga() con el cual se puede consultar la carga de la lavadora desde otra clase del mismo paquete
	 * @return carga
	 */

	protected int getCarga() {
		return carga;
	}
	
	/**
	 * Se define el metodo precioFinal() el cual retorna el precio de la lavadora, tomando en cuenta el precio de la clase madre Electrodomestico
	 * y añadiendo un adicional de 50€ en caso de que la carga de la lavadora sea mayor a 30 kg
	 * @return precioLavadora
	 */
	
	public float precioFinal() {
		int precioCarga = 0;
		float precioLavadora = 0;
		if (this.carga > 30) {
			precioCarga = 50;
		}else {
			precioCarga = 0;
		}
		
		precioLavadora = super.precioFinal() + precioCarga;

		return precioLavadora;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioFinal()=" + precioFinal() + ", toString()=" + super.toString()
				+ "]";
	}



}
