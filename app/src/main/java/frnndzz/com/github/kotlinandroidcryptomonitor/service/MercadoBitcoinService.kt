package frnndzz.com.github.kotlinandroidcryptomonitor.service

import frnndzz.com.github.kotlinandroidcryptomonitor.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {
    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}