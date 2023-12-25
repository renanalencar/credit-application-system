package me.dio.credit.application.system.dto

import jakarta.validation.constraints.Future
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.entity.Customer
import me.dio.credit.application.system.enummeration.Status
import java.io.Serializable
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

/**
 * DTO for {@link me.dio.credit.application.system.entity.Credit}
 */
data class CreditDto(
    @field:NotNull(message = "Invalid input")
    val creditValue: BigDecimal,
    @field:Future(message = "Invalid date")
    val dayFirstInstallment: LocalDate,
    @field:NotNull(message = "Invalid input")
    val numberOfInstallments: Int,
    @field:NotNull(message = "Invalid input")
    val customerId: Long
) {

    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.customerId)
    )
}