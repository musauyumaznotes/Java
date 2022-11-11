package kodlama.io.demo.business.abstracts;

import kodlama.io.demo.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
