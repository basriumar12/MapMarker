package id.co.blogbasbas.mapaplication.services;


import id.co.blogbasbas.mapaplication.models.ListLocationModel;
import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiService {
    @GET("JsonDisplayMarker.php")
    Call<ListLocationModel> getAllLocation();
}
