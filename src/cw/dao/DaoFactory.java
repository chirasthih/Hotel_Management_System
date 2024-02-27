/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.dao;

import cw.dao.custom.impl.CustomerDaoImpl;
import cw.dao.custom.impl.RoomCategoryDaoImpl;
import cw.dao.custom.impl.RoomDaoImpl;
import cw.dao.custom.impl.ReservationDaoImpl;
/**
 *
 * @author chira
 */
public class DaoFactory {
    
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }

        return daoFactory;
    }

    public SuperDao getDao(DaoType type) {
        switch (type) {
            case ROOMCATEGORIES:
                return new RoomCategoryDaoImpl();
            case CUSTOMERS:
                return new CustomerDaoImpl();
            case ROOMS:
                return new RoomDaoImpl();
            case RESERVATIONS:
                return new ReservationDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoType {
        ROOMCATEGORIES, CUSTOMERS, ROOMS, RESERVATIONS
    }
}

