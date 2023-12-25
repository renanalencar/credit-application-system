package me.dio.credit.application.system.dto

import jakarta.validation.constraints.Future
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.entity.Customer
import me.dio.credit.application.system.validation.FutureDate
import java.math.BigDecimal
import java.time.LocalDate

/**
 * DTO for {@link me.dio.credit.application.system.entity.Credit}
 */
data class CreditDto(
    @field:NotNull(message = "Invalid input")
    val creditValue: BigDecimal,
    @field:Future(message = "Invalid date")
    @field:FutureDate
    val dayFirstInstallment: LocalDate,
    @field:NotNull(message = "Invalid input")
    @field:Max(value = 48, message = "Installments cannot be more than 48")
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