package micronaut.general;

public interface IExceptionConverter<T extends Throwable> {

	/**
	 * Converts {@code t} exception.
	 * 
	 * @throws T On successful conversion.
	 */
	void convert(Throwable t) throws T;
	
}
