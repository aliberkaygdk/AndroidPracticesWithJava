package com.example.retrofitjava.service;

import com.example.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    //GET,POST,UPDATE,DELETE
    //https://github.com/atilsamancioglu/K21-JSONDataSet/blob/master/crypto.json
    //https://raw.githubusercontent.com/
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")

    Observable<List<CryptoModel>>getData();
    //Call<List<CryptoModel>> getData();

}
