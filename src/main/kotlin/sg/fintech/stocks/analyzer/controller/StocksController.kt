package sg.fintech.stocks.analyzer.controller

import org.slf4j.LoggerFactory
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder
import org.springframework.http.HttpMethod
import org.springframework.http.HttpEntity
import com.fasterxml.jackson.databind.ObjectMapper
import sg.fintech.stocks.analyzer.controller.dto.CompaniesDTO
import sg.fintech.stocks.analyzer.controller.dto.CompanyDTO


@RestController
@RequestMapping("/api")
class StocksController {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    @GetMapping("/health")
    fun healthCheck(): String {
        return "OK"
    }

        @GetMapping("/stocks/sync")
    fun syncStocks(): String {
        //OjdmYjkzMjQxZGM3OWQ2OTgxNmMxNWEyNDJjYjY5ZWQ4
        val restTemplate = RestTemplate()
        val headers = HttpHeaders()
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE)

        val builder = UriComponentsBuilder.fromHttpUrl("https://api-v2.intrinio.com/companies")
                .queryParam("api_key","OjdmYjkzMjQxZGM3OWQ2OT" +
                        "gxNmMxNWEyNDJjYjY5ZWQ4")

        val entity = HttpEntity<Any>(headers)

        val response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                String::class.java)

            val objectMapper = ObjectMapper()
            val data = objectMapper.readValue(response.body, CompaniesDTO::class.java)
            logger.debug("Data", data)
        return response.toString()
    }
}