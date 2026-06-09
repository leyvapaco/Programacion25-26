package ud7.carritosuper;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;




public class MyHandler extends DefaultHandler {

	// List to hold Employees object
	private List<Articulo> artList = null;
	private StringBuilder data = null;

	// getter method for employee list
	public List<Articulo> getArtList() {
		return artList;
	}
	
	Articulo art;

	boolean bDescripcion = false;
	boolean bPrecio = false;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("Articulo")) {
			// create a new Employee and put it in Map
			String codigo = attributes.getValue("codigo");
			// initialize Employee object and set id attribute
			art = new Articulo(codigo);
			art.setCodigo(codigo);
			// initialize list
			if (artList == null)
				artList = new ArrayList<>();
		} else if (qName.equalsIgnoreCase("descripcion")) {
			// set boolean values for fields, will be used in setting Employee variables
			bDescripcion = true;
		} else if (qName.equalsIgnoreCase("precio")) {
			bPrecio = true;
		} 
		// create the data container
		data = new StringBuilder();
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (bDescripcion) {
			// age element, set Employee age
			art.setDescripcion(data.toString());
			bDescripcion = false;
		} else if (bPrecio) {
			art.setPrecio(Double.parseDouble(data.toString()));
			bPrecio = false;
		} 
		
		if (qName.equalsIgnoreCase("Articulo")) {
			// add Employee object to list
			artList.add(art);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		data.append(new String(ch, start, length));
	}
}
