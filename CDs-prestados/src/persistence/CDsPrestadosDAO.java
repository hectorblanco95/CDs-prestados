/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author etore
 */
public class CDsPrestadosDAO {

    DB db;
    DBCollection tabla;

    public void conectar() {
        try {
            Mongo mongo = new Mongo("LocalHost", 27017);
            db = mongo.getDB("discos");
            tabla = db.getCollection("tabla");
        } catch (UnknownHostException ex) {
            Logger.getLogger(CDsPrestadosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
