package training.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import training.entity.Product;

@Transactional(readOnly = true, rollbackFor = { DaoException.class })
public interface ProductDao {

	// CRUD OPERATIONS
	@Transactional(readOnly = false)
	public void addProduct(Product product) throws DaoException;

	public Product getProduct(Integer id) throws DaoException;

	@Transactional(readOnly = false)
	public void updateProduct(Product product) throws DaoException;

	@Transactional(readOnly = false)
	public void deleteProduct(Integer id) throws DaoException;

	// QUERIES

	public List<Product> getAll() throws DaoException;

	public List<Product> getProductByPrice(Double min, Double max) throws DaoException;

	public List<Product> getProductsByBrand(Integer brandId) throws DaoException;

	public List<Product> getProductsByCategory(Integer categoryId) throws DaoException;

	public int count() throws DaoException;

}
