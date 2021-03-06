package be.bartgeluykens.invoice.dao.impl;

import be.bartgeluykens.invoice.dao.GenericDao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * {@inheritDoc}
 */
public class GenericDaoImpl<T> implements GenericDao<T> {
  /**
   * Instance of the class
   */
  private Class<T> clazz;
  /**
   * Session factory
   */
  @Autowired
  protected SessionFactory sessionFactory;
  /**
   * Default constructor
   */
   public GenericDaoImpl() {
   }
  /**
   * {@inheritDoc}
   */
    public GenericDaoImpl(Class<T> clazz) {
      this.clazz = clazz;
    }

  /**
   * {@inheritDoc}
   */
    public T save(T object) {
      sessionFactory.getCurrentSession().saveOrUpdate(object);
      return object;
    }
  /**
   * {@inheritDoc}
   * @param object object to remove
   */
    @Override
    public void evict(T object) {
      sessionFactory.getCurrentSession().evict(object);
    }

  /**
   * {@inheritDoc}
   */
   @SuppressWarnings("unchecked")
   @Override
   public T get(Integer id) {
     return (T) sessionFactory.getCurrentSession().get(clazz, id);
   }
  /**
   * {@inheritDoc}
   * @param object Object to remove
   */
    @SuppressWarnings("unchecked")
    @Override
    public void remove (T object) {
      sessionFactory.getCurrentSession().delete(object);
    }
}

