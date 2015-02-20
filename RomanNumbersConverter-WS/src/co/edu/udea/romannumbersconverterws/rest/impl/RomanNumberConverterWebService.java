package co.edu.udea.romannumbersconverterws.rest.impl;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import co.edu.udea.romannumbersconverterws.converter.RomanNumbersConverter;
import co.edu.udea.romannumbersconverterws.dto.RomanNumber;
import co.edu.udea.romannumbersconverterws.rest.IRomanNumberConverterWebService;
import co.edu.udea.romannumbersconverterws.rest.WebServicePath;

@Path(WebServicePath.RomanConverterWSContext.ROOT_PATH)
@WebService(endpointInterface = "co.edu.udea.romannumbersconverterws.rest.IRomanNumberConverterWebService")
public class RomanNumberConverterWebService implements
		IRomanNumberConverterWebService {

	private RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();

	@Produces(value = { MediaType.APPLICATION_JSON })
	@GET()
	@Override
	public RomanNumber convertoRomanNumber(
			@QueryParam(WebServicePath.RomanConverterWSContext.NUMBER_PARAM) int number) {

		return (new RomanNumber(
				this.romanNumbersConverter.convertDecimalToRomanNumber(number)));
	}
}
