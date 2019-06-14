package com.sxtsoft.cajondesastre.interfaceserio;

import java.sql.Date;
import java.util.List;

public interface ProductServices {

	/**
	 * Java doc
	 * @param product
	 * @return
	 */
	public Product create(Product product);	//C
	public Product read(int codigo);		//R
	public Product update(Product product); //U
	public void delete (int codigo);		//D
	
	public List<Product> getAll();
	public List<Product> getBetweenRange(double min, double max);
	public List<Product> getBetweenDates(Date fecha1, Date fecha2);
	public List<Product> getDescatalogados();
	
	public List<Product> incresePrice(String family, double amount);
	
}
