package business;

import business.exception.DifferentCurrenciesException;

import java.util.List;

import business.exception.DifferentCurrenciesException;
import model.Amount;
import model.Product;

public interface ClientBO {

    Amount getClientProductsSum(List<Product> products)
            throws DifferentCurrenciesException;

}