package sg.fintech.stocks.analyzer.controller.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class CompaniesDTO (
    @JsonProperty("companies")
    val companies: List<CompanyDTO>? = null,

    @JsonProperty("next_page")
    val next_page: String? = null
    )