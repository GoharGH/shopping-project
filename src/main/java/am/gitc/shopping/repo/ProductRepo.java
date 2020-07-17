package am.gitc.shopping.repo;

import am.gitc.shopping.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product,Long> {
}
