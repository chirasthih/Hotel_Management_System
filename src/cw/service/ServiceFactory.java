/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.service;

/**
 *
 * @author chira
 */
public class ServiceFactory {
        private static ServiceFactory serviceFactory;
        private ServiceFactory(){}
        public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType serviceType){
        
           switch (serviceType) {
            case ROOMCATEGORIES:
                return new RoomCategoriesServiceImpl();
            case ROOMS:
                return new RoomsServiceImpl();
            case CUSTOMER:
                return new CustomerServiceImpl();
            case RESERVATIONS:
                return new ReservationsServiceImpl();
            default:
                return null;
        }
        
        
    }
    
    public enum ServiceType{
        ROOMCATEGORIES, ROOMS, CUSTOMER, RESERVATIONS
    }
}



