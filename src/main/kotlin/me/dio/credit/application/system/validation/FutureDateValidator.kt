package me.dio.credit.application.system.validation

import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext
import java.time.LocalDate

class FutureDateValidator : ConstraintValidator<FutureDate, LocalDate> {

    override fun isValid(value: LocalDate?, context: ConstraintValidatorContext?): Boolean {
        if (value == null) {
            return true // Consider null as valid or add your own logic
        }

        val threeMonthsAhead = LocalDate.now().plusMonths(3)
        return value.isBefore(threeMonthsAhead)
    }
}
