package quicksort.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import quicksort.dao.SortDAO;
import quicksort.model.SortData;


@Service
public class SortService {
    private final SortDAO sortDAO;

    @Autowired
    public SortService(SortDAO sortDAO) {
        this.sortDAO = sortDAO;
    }

    @Transactional
    public void add(SortData sortData) {
        sortDAO.add(sortData);
    }

    @Transactional
    public void delete(SortData sortData) {
        sortDAO.delete(sortData);
    }

    @Transactional
    public SortData getById(int id) {
        return sortDAO.getById(id);
    }
}
