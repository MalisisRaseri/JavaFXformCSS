package com.example.javafxformcss.DBConnect;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBProperties extends Properties {
        private static DBProperties app;

        private DBProperties(){}

        public static DBProperties get(){
            if (app == null) {
                app = new DBProperties();
                File file = new File("app.properties");
                try {
                    if(!file.exists())
                        file.createNewFile();
                    app.load(new FileInputStream(file));
                } catch (IOException ex) {
                    Logger.getLogger(DBProperties.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return app;
        }

    }

