package kodlama.io.demo.business.concretes;

import kodlama.io.demo.business.abstracts.BrandService;
import kodlama.io.demo.dataAccess.abstracts.BrandRepository;
import kodlama.io.demo.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
