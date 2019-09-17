package quicksort.dao;

import org.springframework.data.repository.CrudRepository;
import quicksort.model.SortData;


public interface SortRepository extends CrudRepository<SortData, Integer> {

}
