package com.anginribut;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Unirest.setTimeouts(0, 0);
        try {
            HttpResponse<String> response = Unirest.get("https://emsifa.github.io/api-wilayah-indonesia/api/provinces.json")
              .asString();
            //System.out.print(response.getBody());
            // ubah string JSON menjadi Objek
        Gson gson = new GsonBuilder().create();
        ArrayList<Provinsi> provinsi = new Gson().fromJson(response.getBody(),  new TypeToken<ArrayList<Provinsi>>() {
        }.getType());
        System.out.println(provinsi.get(0).getName());
        
        } catch (UnirestException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
