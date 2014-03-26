package br.com.gestaoponto.persistencia.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.gestaoponto.persistencia.dao.LicencaDAO;
import br.com.gestaoponto.persistencia.entidade.Licenca;

@FacesConverter(value="licencaConverter")
public class LicencaConverter implements Converter {
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Licenca licenca = new Licenca();
		try {
			Integer id = Integer.parseInt(value);
			licenca = new LicencaDAO().getPorId(id);
		} catch (Exception l) {
			l.printStackTrace();
			return null;
		}
		return licenca;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object licenca) {
		if (licenca instanceof Licenca) {
			Licenca l = (Licenca) licenca;

			return l.getId().toString();
		}
		return "";
	}

}
