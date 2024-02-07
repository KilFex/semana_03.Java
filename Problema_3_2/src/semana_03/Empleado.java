package semana_03;

public class Empleado {
	//Atributos
	private  int codigo,categoria,numeroCelurar;
	private String nombre;
	
	//Variables
	private static int empleadosCreados;
	private static double sueldosNetos;
	private final static double descuento;
	
	static {
		descuento=0.15;
		empleadosCreados=0;
		sueldosNetos=0;
	}

	public Empleado(int codigo, int categoria, int numeroCelurar, String nombre) {
		
		this.codigo = codigo;
		this.categoria = categoria;
		this.numeroCelurar = numeroCelurar;
		this.nombre = nombre;
		empleadosCreados++;
		sueldosNetos+=sueldoBruto();
	}

	public Empleado(int codigo, String nombre) {
		
		this(codigo,1,999999999,nombre);
	}

	public Empleado() {
		this(4444,"Ninguno");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getNumeroCelurar() {
		return numeroCelurar;
	}

	public void setNumeroCelurar(int numeroCelurar) {
		this.numeroCelurar = numeroCelurar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getEmpleadosCreados() {
		return empleadosCreados;
	}

	public static void setEmpleadosCreados(int empleadosCreados) {
		Empleado.empleadosCreados = empleadosCreados;
	}

	public static double getSueldosNetos() {
		return sueldosNetos;
	}

	public static void setSueldosNetos(double sueldosNetos) {
		Empleado.sueldosNetos = sueldosNetos;
	}

	public static double getDescuento() {
		return descuento;
	}
	
	//Operacion
	public double sueldoBruto() {
		switch(categoria) {
			case 0: 
				return 7200;
			case 1: 
				return 6300;
			case 2:
				return 5100;
			default: 
				return 0;
		}
	}
	public double calcularDescuento() {
		return sueldoBruto() * descuento;
	}
	public double calcularSueldoNeto() {
		return sueldoBruto() - calcularDescuento();
	}
	
}