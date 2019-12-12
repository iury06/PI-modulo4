package br.senac.go.projetointegrador_2_semestre_2019.source;

import br.senac.go.projetointegrador_2_semestre_2019.model.Veiculos;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GerenciadorApi {
    private static ApiSource service;
    private static GerenciadorApi  apiManager;
    private static Retrofit retrofit;

    private GerenciadorApi() {

        Retrofit retrofit = new Retrofit.Builder().baseUrl("http:192.168.254.4:8080/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        service = retrofit.create(ApiSource.class);
    }

    public static GerenciadorApi  getInstance() {
        if (apiManager == null) {
            apiManager = new GerenciadorApi ();
        }
        return apiManager;
    }


    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
           retrofit =  new Retrofit.Builder().baseUrl("http:192.168.254.4:8080/")
                   .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

    public  void createVeiculo(Veiculos veiculos, Callback<Veiculos> callback) {
        Call<Veiculos> veiculosCall = service.createVeiculo(veiculos);
        veiculosCall.enqueue(callback);
    }

   // public void getVeiculo(Veiculos veiculos, Callback<Veiculos> callback) {
     //   Call<Veiculos> veiculosCall = service.createVeiculo(veiculos);
     //   veiculosCall.enqueue(callback);
   // }
    
}

