package api

import android.database.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
// http\://api.accuweather.com/locations/v1/cities/translate.json
interface ApiServer {
//    @GET("locations/v1/cities/translate.json")
//    fun callWeatherLocation(
//        @Query("alias") alias: String?,
//        @Query("apikey") apikey: String?,
//        @Query("q") q: String?,
//        @Query("language") language: String?
//    ): Call<List<AccuLocationResult?>?>?
//
//    @GET("locations/v1/cities/translate.json")
//    fun getWeatherLocation(
//        @Query("alias") alias: String?,
//        @Query("apikey") apikey: String?,
//        @Query("q") q: String?,
//        @Query("language") language: String?
//    ): Observable<List<AccuLocationResult?>?>?
//
//    @GET("locations/v1/cities/geoposition/search.json")
//    fun getWeatherLocationByGeoPosition(
//        @Query("alias") alias: String?,
//        @Query("apikey") apikey: String?,
//        @Query("q") q: String?,
//        @Query("language") language: String?
//    ): Observable<AccuLocationResult?>?
//
//    @GET("currentconditions/v1/{city_key}.json")
//    fun getCurrent(
//        @Path("city_key") city_key: String?,
//        @Query("apikey") apikey: String?,
//        @Query("language") language: String?,
//        @Query("details") details: Boolean
//    ): Observable<List<AccuCurrentResult?>?>?
//
//    @GET("forecasts/v1/daily/25day/{city_key}.json")
//    fun getDaily(
//        @Path("city_key") city_key: String?,
//        @Query("apikey") apikey: String?,
//        @Query("language") language: String?,
//        @Query("metric") metric: Boolean,
//        @Query("details") details: Boolean
//    ): Observable<AccuDailyResult?>?
//
//    @GET("forecasts/v1/hourly/72hour/{city_key}.json")
//    fun getHourly(
//        @Path("city_key") city_key: String?,
//        @Query("apikey") apikey: String?,
//        @Query("language") language: String?,
//        @Query("details") details: Boolean,
//        @Query("metric") metric: Boolean
//    ): Observable<List<AccuHourlyResult?>?>?
//
//    @GET("forecasts/v1/minute/1minute.json")
//    fun getMinutely(
//        @Query("apikey") apikey: String?,
//        @Query("language") language: String?,
//        @Query("details") details: Boolean,
//        @Query("q") q: String?
//    ): Observable<AccuMinuteResult?>?
//
//    @GET("airquality/v1/observations/{city_key}.json")
//    fun getAirQuality(
//        @Path("city_key") city_key: String?,
//        @Query("apikey") apikey: String?
//    ): Observable<AccuAqiResult?>?
//
//
//    @GET("alerts/v1/{city_key}.json")
//    fun getAlert(
//        @Path("city_key") city_key: String?,
//        @Query("apikey") apikey: String?,
//        @Query("language") language: String?,
//        @Query("details") details: Boolean
//    ): Observable<List<AccuAlertResult?>?>?
}