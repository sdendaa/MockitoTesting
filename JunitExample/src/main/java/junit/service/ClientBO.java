package junit.service;

import java.util.List;

import junit.service.exception.DifferentCurrenciesException;
import junit.entity.Amount;
import junit.entity.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}