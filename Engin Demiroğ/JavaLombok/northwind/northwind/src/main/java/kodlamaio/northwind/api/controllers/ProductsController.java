package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	@GetMapping("/getAll")
	public DataResult<List<Product>> getAll(){
		return productService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return productService.add(product);
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return productService.getByProductName(productName);
	}
	@GetMapping("/getByProductNameAndCategoryId")
	public  DataResult<Product> getByProductNameAndCategoryId(@RequestParam String productName,@RequestParam int categoryId){
		return productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	@GetMapping("/getByProductNameOrCategoryId")
	public DataResult<List<Product>> getByProductNameOrCategoryId(@RequestParam String productName,@RequestParam int categoryId){
		return productService.getByProductNameOrCategoryId(productName, categoryId);
	}
	@GetMapping("/getByCategoryIdIn")
	public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories){
		return productService.getByCategoryIdIn(categories);
	}
	@GetMapping("/getByProductnameContains")
	public DataResult<List<Product>> getByProductnameContains(@RequestParam String productName){
		return productService.getByProductnameContains(productName);
	}
	@GetMapping("/getByProductnameStartsWith")
	public DataResult<List<Product>> getByProductnameStartsWith(@RequestParam String productName){
		return productService.getByProductnameStartsWith(productName);
	}
	@GetMapping("/getByNameAndCategory")
	public DataResult<List<Product>> getByNameAndCategory(@RequestParam String productName,@RequestParam int categoryId){
		return productService.getByNameAndCategory(productName, categoryId);
	}
	@GetMapping("/getAllByPage")
	public DataResult<List<Product>> getAll(int pageNo, int pageSize){
		return productService.getAll(pageNo, pageSize);
	}
	@GetMapping("/getAllDesc")
	public DataResult<List<Product>> getAllSorted(){
		return productService.getAllSorted();
	}
	@GetMapping("/getProductWithCategoryDetails")
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
		return productService.getProductWithCategoryDetails();
	}
}

