package quicksort.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import quicksort.model.SortData;

@Repository
public class SortDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public SortDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SortDAO() {
    }

    public void add(SortData sortData) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(sortData);
    }

    public void delete(SortData sortData) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(sortData);
    }

    public SortData getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(SortData.class, id);
    }
}
