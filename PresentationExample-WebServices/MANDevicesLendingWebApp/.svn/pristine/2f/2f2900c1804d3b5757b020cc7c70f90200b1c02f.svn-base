package co.edu.udea.we.mandl.business.util;

public final class TextUtils {

	/**
	 * Constructor privado y &uacute;nico para generar instancias de esta clase
	 * de utilidad para la validaci&oacute;n de los textos.
	 * <p>
	 * La raz&oacute;n de que este sea privado es para evitar la
	 * construcci&oacute;n personalizada de instancias que hagan referencia
	 * objetos creados directamente de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	private TextUtils() {
		super();
	}

	/**
	 * M&eacute;todo utilizado para validar o chequear si un determinado
	 * <code>String</code> enviado como par&aacute;metro est&aacute;
	 * vac&iacute;o, o en caso contrario, posee alg&uacute;n tipo de valor
	 * almacenado.
	 * <p>
	 * En caso que el <code>String</code> a ser validado sea igual a
	 * <code>null</code>, la funci&oacute;n interpretar&aacute; esta instancia
	 * como vac&iacute;a.
	 * 
	 * @param s
	 *            Representa el texto que se desea validar o chequear.
	 * @return Valor primitivo que representa si el texto es vac&iacute;o.
	 *         <code>false</code>, indica que el texto posee valores.
	 */
	public static boolean isEmpty(String s) {

		return ((s == null) || (s.trim().isEmpty()));
	}

	/**
	 * M&eacute;todo utilizado para transformar a min&uacute;sculas todas las
	 * letras que componen un determinado <code>String</code> enviado como
	 * par&aacute;metro, igualmente, esta funci&oacute;n se encargar&aacute; de
	 * eliminar los espacios innecesarios tanto al comienzo como al final del
	 * texto enviado como par&aacute;metro.
	 * <p>
	 * Esta funci&oacute;n no est&aacute; en la capacidad de validar si el texto
	 * enviado como par&aacute;metro es <code>null</code> o no, es por ello, que
	 * la nulidad del mismo debe ser validad y chequeada antes de la
	 * invocaci&oacute;n de esta funci&oacute;n.
	 * 
	 * @param s
	 *            Representa el texto que se desea convertir a min&uacute;sculas
	 *            puras y suprmirle los espacios.
	 * @return Valor o texto representado solo en min&uacute;sculas y sin
	 *         espacios al comienzo o al final del mismo.
	 */
	public static String toLowerCase(String s) {

		return (s.trim().toLowerCase());
	}

	/**
	 * M&eacute;todo utilizado para transformar a may&uacute;sculas todas las
	 * letras que componen un determinado <code>String</code> enviado como
	 * par&aacute;metro, igualmente, esta funci&oacute;n se encargar&aacute; de
	 * eliminar los espacios innecesarios tanto al comienzo como al final del
	 * texto enviado como par&aacute;metro.
	 * <p>
	 * Esta funci&oacute;n no est&aacute; en la capacidad de validar si el texto
	 * enviado como par&aacute;metro es <code>null</code> o no, es por ello, que
	 * la nulidad del mismo debe ser validad y chequeada antes de la
	 * invocaci&oacute;n de esta funci&oacute;n.
	 * 
	 * @param s
	 *            Representa el texto que se desea convertir a may&uacute;sculas
	 *            puras y suprmirle los espacios.
	 * @return Valor o texto representado solo en may&uacute;sculas y sin
	 *         espacios al comienzo o al final del mismo.
	 */
	public static String toUpperCase(String s) {

		return (s.trim().toUpperCase());
	}
}