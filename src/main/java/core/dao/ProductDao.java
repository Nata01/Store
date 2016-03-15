package core.dao;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ProductDao {
    public List<String> getAllProductNames() {
        return Arrays.asList("test", "test1");
    }
}
