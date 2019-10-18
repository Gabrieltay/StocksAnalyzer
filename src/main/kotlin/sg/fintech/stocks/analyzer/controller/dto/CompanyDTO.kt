package sg.fintech.stocks.analyzer.controller.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class CompanyDTO (

    @JsonProperty("id")
    val id: String? = null,

    @JsonProperty("ticker")
    val ticker: String?,

    @JsonProperty("name")
    val name: String?,

    @JsonProperty("lei")
    val lei: String?,

    @JsonProperty("cik")
    val cik: String?
)