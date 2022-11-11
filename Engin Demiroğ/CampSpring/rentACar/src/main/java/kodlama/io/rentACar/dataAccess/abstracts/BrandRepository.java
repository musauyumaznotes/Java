package kodlama.io.rentACar.dataAccess.abstracts;
import kodlama.io.rentACar.entities.concretes.Brand;
import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();
    Brand getById(int id);
    void add(Brand brand);
    void delete(Brand brand);
    void update(Brand brand);
}
