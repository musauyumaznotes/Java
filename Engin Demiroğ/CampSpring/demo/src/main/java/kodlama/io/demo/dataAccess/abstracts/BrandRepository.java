package kodlama.io.demo.dataAccess.abstracts;

import kodlama.io.demo.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}
