package sg.fintech.stocks.analyzer.model

import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Company (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(name = "ticker")
    val ticker: String,

    @Column(name = "name")
    val name: String
)