package cl.awakelab.evaluacion;

/**
 * Esta clase define los constructores y métodos de la clase Television
 * @author Germán Illanes
 * @version @version: 27/02/2020/A
 */

public class Television extends Electrodomestico {
	/**
	 * Se define como constante RESOLUCIO_DEFECTO = 20 y SINTONIZADOR_DEFECTO = false
	 */
	
	public static final int RESOLUCION_DEFECTO = 20;
	public static final boolean SINTONIZADOR_DEFECTO = false; 
	
	/**
	 * Se definen las variables resolucion, de tipo entero, y que hace referencia al tamaño de la pantalla en pulgadas del televisor y sintonizador
	 * de tipo booleano que indica verdadero en caso de que el televisor tenga sintonizador de TV Digital y falso en caso contrario
	 */
	
	private int resolucion;
	private boolean sintonizador;
	
	/**
	 * Se define un constructor por defecto para la clase Television, la cual llama a traves de super() a los parametros por defecto de la clase madre 
	 * Electrodomesticos y ademas contiene los valores de resolucion y sintonizador por defecto
	 */
	
	public Television() {
		super();
		this.resolucion = RESOLUCION_DEFECTO;
		this.sintonizador = SINTONIZADOR_DEFECTO;
	}
	
	/**
	 * Se define un constructor que requiere los parámetros precioBase y peso. Ambos se obtienen de la clase madre Electrodomesticos. El resto de los
	 * parametros mantienen su valor por defecto
	 * @param precioBase
	 * @param peso
	 */
	
	public Television(int precioBase, float peso) {
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
	 * @param resolucion Este parametro hace referencia al tamaño de la pantalla del televisor en pulgadas
	 * @param sintonizador Este parametro hace referencia a si el televisor cuenta o no con sintonizador de TV digital
	 */
	
	public Television(int precioBase, String color, char consumoEnergetico, float peso, int resolucion, boolean sintonizador) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	
	/**
	 * Se define el metodo getResolucion() con el cual se puede consultar la resolucion del televisor desde otra clase del mismo paquete
	 * @return resolucion
	 */

	protected int getResolucion() {
		return resolucion;
	}

	/**
	 * Se define el metodo isSintonizador() el cual retorna un booleano indicando si cuenta o no con sintonizador de TV digital 
	 * @return boolean
	 */
	
	protected boolean isSintonizador() {
		return sintonizador;
	}
	
	/**
	 * Se define el metodo precioFinal() el cual retorna el precio del televisor, tomando en cuenta el precio de la clase madre Electrodomestico
	 * y añadiendo un adicional del 30% en caso de que la resolucion sea mayor a 40 pulgadas y un adicional de 50€ en caso de tener sintonizador
	 */
	
	public float precioFinal() {
		float precioResolucion = 0;
		float precioSintonizador = 0;
		float precioTelevision = 0;
		if(this.resolucion > 40) {
			precioResolucion = (float)((super.getPrecioBase())*0.3);
		}
		if(this.isSintonizador()) {
			precioSintonizador = 50;
		}
		
		precioTelevision = super.getPrecioBase()+ precioResolucion + precioSintonizador;
		
		return precioTelevision;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizador=" + sintonizador + ", precioFinal()="
				+ precioFinal() + ", toString()=" + super.toString() + "]";
	}



}
