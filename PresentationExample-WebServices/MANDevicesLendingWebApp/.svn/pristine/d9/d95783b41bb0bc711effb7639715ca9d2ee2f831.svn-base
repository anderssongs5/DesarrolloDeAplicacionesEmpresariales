package co.edu.udea.we.mandl.persistence.dao.hibernate.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.we.mandl.model.dto.IEntityContext;
import co.edu.udea.we.mandl.persistence.dao.IEntityContextDAO;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Clase abstracta y de visibilidad oculta que define la implementaci&oacute;n
 * gen&eacute;rica para los m&eacute;todos de acceso al repositorio de datos y
 * definidos en la interfaz {@code IEntityContextDAO}.
 * <p>
 * Esta clase abstracta implementar&aacute; los m&eacute;todos de acceso a los
 * datos de acuerdo al contexto de persistencia asociado a la aplicaci&oacute;n,
 * en otras palabras, realizar&aacute; las operaciones C.R.U.D. <i>Create
 * Retrieve Update Delete</i> sobre la Base de Datos a trav&eacute;s de un
 * contexto de persistencia defindo por el framework <b>Hibernate</b>.
 * <p>
 * Los m&eacute;todos expuestos para la gesti&oacute;n de los datos asociados a
 * las entidades de la aplicaci&oacute;n, se han realizado de una forma
 * gen&eacute;rica e independiente del D.A.O. <i>Data Access Object</i> definido
 * para la {@code IEntityContext} en particular.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
abstract class AbstractEntityDAO extends HibernateDaoSupport implements
		IEntityContextDAO {

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre. Esta clase al ser una abstracta, no se podr&aacute;n
	 * generar directamente instancias de esta clase.
	 */
	public AbstractEntityDAO() {
		super();
	}

	@Override()
	public Long count(Class<? extends IEntityContext> c)
			throws MANDevicesLendingDAOException {
		Long counter = Long.valueOf(-1L);
		Session session = null;

		try {
			session = super.getSession();

			Criteria criteria = session.createCriteria(c);
			counter = (Long) criteria.setProjection(Projections.rowCount())
					.uniqueResult();
		} catch (Exception ex) {
			throw new MANDevicesLendingDAOException(String.format(
					"Error during procedures's \"%s\" for class: %s", "Count",
					c.getSimpleName()), ex);
		}

		return (counter);
	}

	@Override()
	public Object delete(IEntityContext entityContext)
			throws MANDevicesLendingDAOException {
		Session session = null;
		Transaction transaction = null;

		try {
			session = super.getSession();
			transaction = session.beginTransaction();
			session.delete(entityContext);
			transaction.commit();
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}

			throw new MANDevicesLendingDAOException(String.format(
					"Error during procedure's \"%s\" for class: %s", "Delete",
					entityContext.getClass().getSimpleName()), ex);
		}

		return (entityContext.getKey());
	}

	@Override()
	public IEntityContext find(Class<? extends IEntityContext> c,
			Serializable primaryKey) throws MANDevicesLendingDAOException {
		IEntityContext entityContext = null;
		Session session = null;

		try {
			session = super.getSession();

			entityContext = (IEntityContext) session.get(c, primaryKey);
		} catch (Exception ex) {
			throw new MANDevicesLendingDAOException(String.format(
					"Error during procedure's \"%s\" for class: %s", "Find",
					c.getSimpleName()), ex);
		}

		return (entityContext);
	}

	@Override()
	@SuppressWarnings(value = { "unchecked" })
	public List<IEntityContext> findAll(Class<? extends IEntityContext> c)
			throws MANDevicesLendingDAOException {
		List<IEntityContext> entitesContextFoundList = new ArrayList<IEntityContext>();
		Session session = null;

		try {
			session = super.getSession();

			Criteria criteria = session.createCriteria(c);
			entitesContextFoundList = criteria.list();
		} catch (Exception ex) {
			throw new MANDevicesLendingDAOException(String.format(
					"Error during procedure's \"%s\" for class: %s",
					"Find All", c.getSimpleName()), ex);
		}

		return (entitesContextFoundList);
	}

	@Override()
	@SuppressWarnings(value = { "unchecked" })
	public List<IEntityContext> findByAttributes(
			Class<? extends IEntityContext> c, Map<String, Object> attributesMap)
			throws MANDevicesLendingDAOException {
		List<IEntityContext> entitesContextFoundList = new ArrayList<IEntityContext>();
		Session session = null;

		try {
			session = super.getSession();

			Criteria criteria = session.createCriteria(c);
			criteria.add(Restrictions.allEq(attributesMap));
			entitesContextFoundList = criteria.list();
		} catch (Exception ex) {
			throw new MANDevicesLendingDAOException(String.format(
					"Error during procedure's \"%s\" for class: %s",
					"Find By Attributes", c.getSimpleName()), ex);
		}

		return (entitesContextFoundList);
	}

	public Object save(IEntityContext entityContext)
			throws MANDevicesLendingDAOException {
		Object primaryKey = null;
		Session session = null;
		Transaction transaction = null;

		try {
			session = super.getSession();
			transaction = session.beginTransaction();
			primaryKey = session.save(entityContext);
			transaction.commit();
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}

			throw new MANDevicesLendingDAOException(String.format(
					"Error during procedure's \"%s\" for class: %s", "Save",
					entityContext.getClass().getSimpleName()), ex);
		}

		return (primaryKey);
	}

	@Override()
	public Object update(IEntityContext entityContext)
			throws MANDevicesLendingDAOException {
		Session session = null;
		Transaction transaction = null;

		try {
			session = super.getSession();
			transaction = session.beginTransaction();
			session.update(entityContext);
			transaction.commit();
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}

			throw new MANDevicesLendingDAOException(String.format(
					"Error during procedure's \"%s\" for class: %s", "Update",
					entityContext.getClass().getSimpleName()), ex);
		}

		return (entityContext.getKey());
	}
}